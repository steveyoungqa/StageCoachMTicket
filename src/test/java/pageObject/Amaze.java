package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

import java.io.IOException;


public class Amaze {

    public WebElement AmazeUATUserName() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='LoginControl_UserName']"));
    }

    public WebElement AmazeUATPassword() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='LoginControl_Password']"));
    }

    public WebElement AmazeUATLogin() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='LoginControl_Button1']"));
    }

    public WebElement AmazeUATLSignInRegisterLink() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='signin-link']"));
    }

    public WebElement AmazeUATLEmailAddress() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='LoginForm_email']"));
    }

    public WebElement AmazeUATLEmailPassword() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='LoginForm_password']"));
    }

    public WebElement AmazeUATLEmailSignIn() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='main']//*[@aria-label='Sign in']"));
    }

    public WebElement OutgoingStation() throws IOException {
        return Driver.findElement(By.xpath("//*[@id='prefx_2654_bookingForm']/div[1]/div[1]/div/div/fieldset/div[1]/div/span/input[1]"));
    }

    public WebElement InboundStation() throws IOException {
        return Driver.findElement(By.xpath("//*[@class='tb-wrapper bg-wrap input-icon swap station-pick-wrapper']"));
    }

    public WebElement FindTrainsButton() throws IOException {
        return Driver.findElement(By.xpath("//*[@aria-label='Find trains']"));
    }

}
