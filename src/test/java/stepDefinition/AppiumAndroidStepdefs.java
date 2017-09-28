package stepDefinition;

import appium.RuntimeExec;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
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
        appiumObj.startAppium("appium --address 127.0.0.1");
        caps.setCapability(MobileCapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
        caps.setCapability("noReset", false);
        caps.setCapability("fullReset", true);
        
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
        String email = "tester" + "+" + RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(2) + "Appium@gmail.com";
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

    @Then("^I enter an Email address of \"([^\"]*)\"$")
    public void iEnterAnEmailAddressOf(String email) throws Throwable {
        MTicket mticket = new MTicket();
//        driver.findElement(By.id(String.valueOf((mticket.EmailAddress())))).clear();
        Thread.sleep(1000);
        driver.findElement(By.id(String.valueOf((mticket.EmailAddress())))).sendKeys(email);
        driver.hideKeyboard();
    }

    @And("^I enter a Password of \"([^\"]*)\"$")
    public void iEnterAPasswordOf(String password) throws Throwable {
        MTicket mticket = new MTicket();
//        driver.findElement(By.id(String.valueOf((mticket.Password())))).clear();
        Thread.sleep(1000);
        driver.findElement(By.id(String.valueOf((mticket.Password())))).sendKeys(password);
        driver.hideKeyboard();
    }

    @Then("^I enter a Device Name of \"([^\"]*)\"$")
    public void iEnterADeviceNameOf(String deviceName) throws Throwable {
        MTicket mticket = new MTicket();
        String uniqueDeviceName = RandomStringUtils.randomAlphabetic(6);
        driver.findElement(By.id(String.valueOf((mticket.DeviceName())))).clear();
        Thread.sleep(1000);
        driver.findElement(By.id(String.valueOf((mticket.DeviceName())))).sendKeys(deviceName);
        driver.hideKeyboard();
    }

    @Then("^I enter a Unique Device Name of \"([^\"]*)\"$")
    public void iEnterAUniqueDeviceNameOf(String deviceName) throws Throwable {
        MTicket mticket = new MTicket();
        String uniqueDeviceName = RandomStringUtils.randomAlphabetic(6);
        driver.findElement(By.id(String.valueOf((mticket.DeviceName())))).clear();
        Thread.sleep(1000);
        driver.findElement(By.id(String.valueOf((mticket.DeviceName())))).sendKeys(deviceName + uniqueDeviceName);
        driver.hideKeyboard();
    }

    @Then("^I select Register$")
    public void iSelectRegister() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.RegisterButton())))).click();
    }

    @And("^I select the Skip button$")
    public void iSelectTheSkipButton() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.SkipButton())))).click();
    }

    @Then("^I select Buy Tickets$")
    public void iSelectBuyTickets() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.BuyTickets()))).click();
    }

    @And("^I select Ticket Wallet$")
    public void iSelectTicketWallet() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.TicketWallet()))).click();
    }

    @And("^I select My Account$")
    public void iSelectMyAccount() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.MyAccount()))).click();
    }

    @And("^I select Help & Info$")
    public void iSelectHelpInfo() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HelpInfo()))).click();
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

    @And("^I select Settings from the Menu$")
    public void iSelectSettingsFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.Settings()))).click();
    }

    @And("^I select the Back button on the device$")
    public void iSelectTheBackButtonOnTheDevice() throws Throwable {
        Thread.sleep(5000);
        driver.sendKeyEvent(AndroidKeyCode.BACK);
    }

    @And("^I select Home from the Menu$")
    public void iSelectHomeFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElementByAccessibilityId(mticket.Home()).click();
    }

    @And("^I select Passenger Charter from the Menu$")
    public void iSelectPassengerCharterFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        Thread.sleep(5000);
        driver.findElement(By.id(mticket.PassengerCharter())).click();
    }

    @And("^I select Live Travel Updates from the Menu$")
    public void iSelectLiveTravelUpdatesFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.LiveTravelUpdate()))).click();
    }

    @And("^I select How busy is my train from the Menu$")
    public void iSelectHowBusyIsMyTrainFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HowBusyIsMyTrain()))).click();
    }

    @And("^I select Journey Planner from the Menu$")
    public void iSelectJourneyPlannerFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.JourneyPlanner()))).click();
    }

    @And("^I select Help from the Menu$")
    public void iSelectHelpFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HelpFromMenu()))).click();
    }

    @And("^I select Feedback from the Menu$")
    public void iSelectFeedbackFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.Feedback()))).click();
    }

    @And("^I select Train Mapper from the Menu$")
    public void iSelectDelayRepayFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.TrainMapper()))).click();
    }

    @And("^I select Live Train Times from the Menu$")
    public void iSelectLiveTrainTimesFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.LiveTrainTimes()))).click();
    }

    @And("^I select About from the Menu$")
    public void iSelectAboutFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.About()))).click();
    }

    @And("^I select Social Hub from the Menu$")
    public void iSelectSocialHubFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.SociaHub()))).click();
    }

    @And("^I select Download Beam App from the Menu$")
    public void iSelectDownloadBeamAppFromTheMenu() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.DownloadBeamApp()))).click();
    }

    @Then("^I select the How do I activate and use my m-ticket link$")
    public void iSelectTheHowDoIActivateAndUseMyMTicketLink() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HelpActivate()))).click();
    }

    @Then("^I select the Where do I find my m-ticket link$")
    public void iSelectTheWhereDoIFindMyMTicketLink() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HelpWhereMTicket()))).click();
    }

    @Then("^I select the What Journey/ticket types are available link$")
    public void iSelectTheWhatJourneyTicketTypesAreAvailableLink() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HelpWhatJourneyTypes()))).click();
    }

    @Then("^I select the How do I transfer my m-ticket to another device link$")
    public void iSelectTheHowDoITransferMyMTicketToAnotherDeviceLink() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf(mticket.HelpTransfer()))).click();
    }

    @And("^permission to allow Notifications pop-up for IOS is displayed$")
    public void permissionToAllowNotificationsPopUpForIOSIsDisplayed() throws Throwable {
       //TO DO
    }

    @And("^xpath example$")
    public void xpath() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.xpath(String.valueOf((mticket.xpath())))).click();
    }

    @Then("^I select the LogOut button$")
    public void iSelectTheLogOutButton() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.xpath(String.valueOf((mticket.logOut())))).click();
        Thread.sleep(3000);
    }

    @And("^I confirm to LogOut$")
    public void iConfirmToLogOut() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.logOutConfirm())))).click();
    }

    @And("^I confirm to Cancel$")
    public void iConfirmToCancel() throws Throwable {
        MTicket mticket = new MTicket();
        driver.findElement(By.id(String.valueOf((mticket.cancelConfirm())))).click();
    }
}
