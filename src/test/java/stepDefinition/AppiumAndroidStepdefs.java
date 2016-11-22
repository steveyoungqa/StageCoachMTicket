package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import pageObject.MTicket;
import supportMethods.FileReader;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AppiumAndroidStepdefs {
    AndroidDriver driver;
    DesiredCapabilities caps = new DesiredCapabilities();

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
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,device);
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

    @Then("^I register a new user in the mobile browser in language \"([^\"]*)\"$")
    public void iRegisterANewUserInTheMobileBrowser(String language) throws Throwable {
        WebElement registerButton = driver.findElement(By.xpath("//*[@data-reactid='.1.2.0.0']"));
        registerButton.click();
    }

    @And("^I use a Country of \"([^\"]*)\" and a First Name of \"([^\"]*)\" and Surname of \"([^\"]*)\"$")
    public void iUseALanguageOfFirstnameSurname(String country, String first, String last) throws Throwable {
        WebElement countrySelector = driver.findElement(By.xpath("//*[@data-flux-key='countryOfResidence']"));
        Select countrySelect = new Select(countrySelector);
        countrySelect.selectByValue(country);
        WebElement firstName = driver.findElement(By.id("_FirstName"));
        firstName.clear();
        firstName.sendKeys(first);
        WebElement surname = driver.findElement(By.id("_LastName"));
        surname.clear();
        surname.sendKeys(last);
        FileReader.addData("firstName", first);
        FileReader.addData("surname", last);
        FileReader.addData("country", country);
    }


    @Then("^use a date of birth of \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void useADateOfBirthOf(String day, String month, String year) throws Throwable {
        WebElement daySelect = driver.findElement(By.xpath("//*[@id='_DateOfBirth_Day']"));
        Select dayValue = new Select(daySelect);
        dayValue.selectByValue(day);

        WebElement monthSelect = driver.findElement(By.xpath("//*[@id='_DateOfBirth_Month']"));
        Select monthValue = new Select(monthSelect);
        monthValue.selectByValue(month);

        WebElement yearSelect = driver.findElement(By.xpath("//*[@id='_DateOfBirth_Year']"));
        Select yearValue = new Select(yearSelect);
        yearValue.selectByValue(year);
        FileReader.addData("dayOfBirth", day);
        FileReader.addData("monthOfBirth", month);
        FileReader.addData("yearOfBirth", year);

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

    @Then("^select the Terms & Conditions checkbox$")
    public void selectTheTermsConditionsCheckbox() throws Throwable {
        WebElement termsBox = driver.findElement(By.id("_AgreeToTermsOfUse"));
        termsBox.click();
    }

    @And("^I use the Submit button$")
    public void iUseTheSubmitButton() throws Throwable {
        WebElement submit = driver.findElement(By.id("_submitBtn"));
        submit.click();
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
    }

    @And("^I select the Skip button$")
    public void iSelectTheSkipButton() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.SkipButton())))).click();
    }

    @Then("^I select Buy Tickets$")
    public void iSelectBuyTickets() throws Throwable {
        MTicket mticket = new MTicket();
//        driver.findElement(By.xpath(String.valueOf((mticket.BuyTickets())))).click();
        driver.findElementByAccessibilityId("Buy tickets").click();
    }

    @And("^I select Help & Info$")
    public void iSelectHelpInfo() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.linkText(String.valueOf((mticket.HelpInfo())))).click();
    }
}
