package stepDefinition;

import appium.RuntimeExec;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObject.MTicket;
import supportMethods.FileReader;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AppiumAndroidStepdefs {
    AndroidDriver driver;
    DesiredCapabilities caps = new DesiredCapabilities();
    RuntimeExec appiumObj = new RuntimeExec();

    @Given("^I am using Appium to run Mobile Browser automation tests for device \"([^\"]*)\" and Android version \"([^\"]*)\"$")
    public void iAmUsingAppiumToRunAutomationTestsForDevice(String device, String version) throws Throwable {
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,device);
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
        caps.setCapability("avd",device);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Given("^I am using Appium to run APK automation tests for device \"([^\"]*)\" and Android version \"([^\"]*)\"$")
    public void iAmUsingAppiumToRunAPKAutomationTestsForDeviceAndAndroidVersion(String device, String version) throws Throwable {
        //DesiredCapabilities caps = new DesiredCapabilities();
        appiumObj.startAppium("appium --address 127.0.0.1");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, device);
        caps.setCapability("avd",device);
    }

    @And("^I am using the \"([^\"]*)\" local path$")
    public void iAmUsingTheLocalPath(String apk) throws Throwable {
        caps.setCapability(MobileCapabilityType.APP, apk);

    }

    @Then("^I launch the App on the Device$")
    public void iLaunchTheAppOnTheDevice() throws Throwable {
        driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @And("^I am using the \"([^\"]*)\" url for the mobile browser$")
    public void iAmUsingTheUrlForTheMobileBrowser(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^I use a unique Gmail email address$")
    public void iUseAUniqueGmailEmailAddress() throws Throwable {
        String email = "springertester" + "+" + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(2) + "Appium@gmail.com";
        FileReader.addData("uniqueEmailAddress", email);

        WebElement emailElement = driver.findElement(By.id("_EmailAddress"));
        emailElement.clear();
        emailElement.sendKeys(email);
    }

    @And("^I use a confirmation of the unique Gmail email address$")
    public void iUseAConfirmationOfTheUniqueGmailEmailAddress() throws Throwable {
        String emailConfirm = FileReader.readProperties().get("uniqueEmailAddress");
        WebElement emailElement = driver.findElement(By.id("_ConfirmEmailAddress"));
        emailElement.clear();
        emailElement.sendKeys(emailConfirm);
    }

    @And("^I run some Example Tests$")
    public void iRunSomeExampleTests() throws Throwable {
        WebElement planner=driver.findElement(By.id("uk.co.nationalrail.google:id/journeyPlannerTabButton"));
        planner.click();
        WebElement stationFrom=driver.findElement(By.id("uk.co.nationalrail.google:id/stationFrom"));
        stationFrom.click();
    }

    @And("^I close the Mobile Browser$")
    public void iCloseTheMobileBrowser() throws Throwable {
        driver.closeApp();
        driver.quit();
//        Actions action2 = new Actions(driver);
//        action2.sendKeys(Keys.COMMAND + "Q");
    }

    @Then("^I validate the Virgin Trains Splash screen is displayed$")
    public void iValidateTheVirginTrainsSplashScreenIsDisplayed() throws Throwable {
        MTicket mticket = new MTicket();
        //TO DO
    }

    @And("^I select the Login button$")
    public void iSelectTheLoginButton() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.LoginButton())))).click();
    }

    @And("^I select the Skip button$")
    public void iSelectTheSkipButton() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.SkipButton())))).click();
        //RuntimeExec.stopAppium();
    }

    @Then("^I select Buy Tickets$")
    public void iSelectBuyTickets() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElementByAccessibilityId(mticket.BuyTickets()).click();
//        driver.findElementByAccessibilityId("Buy tickets").click();
    }

    @And("^I select Help & Info$")
    public void iSelectHelpInfo() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.linkText(String.valueOf((mticket.HelpInfo())))).click();
    }

    @Then("^I select to Open the Hamburger Menu$")
    public void iSelectToOpenTheHamburgerMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElementByAccessibilityId(mticket.HamburgerMenu()).click();
    }

    @Then("^I select to Close the Hamburger Menu$")
    public void iSelectToCloseTheHamburgerMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElementByAccessibilityId(mticket.CloseHamburgerMenu()).click();
    }
}
