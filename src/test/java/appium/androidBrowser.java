package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class androidBrowser {
    AndroidDriver driver;

//    AVD (Android Virtual Devices)
    String avdGalaxyS7 = "Samsung_Galaxy_S7_Edge_API_22";
    String avdNexus7 = "Nexus_7_API_22";
//    String avdNexus1 = "Nexus_One_API_24"; Nougat 7.0 Not supported by X-Code/Appium yet
    String avdGalaxyTab4 = "Galaxy_Tab_4_0_API_23";

    String apiVersion = "5.1";

    String url = "https://google.co.uk";

    @BeforeClass
    public void setUp() throws MalformedURLException{
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, apiVersion);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Device");
        caps.setCapability("avd",avdNexus7);
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void webTest() throws IOException, InterruptedException {
        driver.get(url);
        WebElement registerButton = driver.findElement(By.xpath("//*[@data-reactid='.1.2.0.0']"));
        registerButton.click();
        WebElement firstName = driver.findElement(By.id("_FirstName"));
        firstName.clear();
        firstName.sendKeys("Arnold");
        WebElement surname = driver.findElement(By.id("_LastName"));
        surname.clear();
        surname.sendKeys("Appium");
        WebElement countrySelector = driver.findElement(By.xpath("//*[@data-flux-key='countryOfResidence']"));
        Select country = new Select(countrySelector);
        country.selectByValue("GB");
    }

    @AfterClass
    public void tearDown(){
        driver.closeApp();
    }
}
