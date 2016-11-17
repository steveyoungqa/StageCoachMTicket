package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Driver;

import java.io.IOException;


public class Gmail {

    public WebElement GmailFrontPageSignIn() throws IOException {
        return Driver.findElement(By.id("gmail-sign-in"));
    }

    public WebElement GmailInboxField() throws IOException{
        return Driver.findElement(By.id("Email"));
    }

    public WebElement GmailNextButton() throws IOException{
        return Driver.findElement(By.id("next"));
    }

    public WebElement GmailPasswordField() throws IOException{
        return Driver.findElement(By.id("Passwd"));
    }

    public WebElement GmailStaySignedInCheckbox()throws IOException {
        return Driver.findElement(By.id("PersistentCookie"));
    }

    public WebElement GmailSignIn()throws IOException {
        return Driver.findElement(By.id("signIn"));
    }

    public WebElement GmailExpandEmail () throws IOException{
        return Driver.findElement(By.xpath("//*[@src='images/cleardot.gif'][@role='menu']"));
    }

    public WebElement GmailSelectAllMenu ()throws IOException {
        return Driver.findElement(By.xpath("//*[@data-tooltip='Select']"));
    }

    public WebElement AllOptionDropdown () throws IOException {
        return Driver.findElement(By.xpath("//*[@selector='all']"));
    }

    public WebElement GmailTrashIcon() throws IOException {
        return Driver.findElement(By.xpath("//*[@data-tooltip='Delete']"));
    }

    public WebElement GmailDeleteEmail () throws IOException{
        return Driver.findElement(By.xpath("//*[contains(text(), 'Delete this message')]"));
    }

    public WebElement GmailSignOutLogo ()throws IOException {
        return Driver.findElement(By.xpath(".//*[@href='https://accounts.google.com/SignOutOptions?hl=en&continue=https://mail.google.com/mail&service=mail']"));
    }

    public WebElement GmailSignOutLink() throws IOException{
        return Driver.findElement(By.xpath("//*[@aria-label='Account Information']//*[contains(text(), 'Sign out')]"));
    }

    public WebElement EmailBodyContains (String contains) throws IOException{
        return Driver.findElement(By.xpath("//*[@role='main']//*[contains(text(),'" + contains + "')]"));
    }
}
