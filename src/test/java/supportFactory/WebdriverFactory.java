package supportFactory;

import org.openqa.selenium.WebDriver;
import supportMethods.FileReader;
import webDriver.Driver;

public class WebdriverFactory {

	public static class BrowserCleanup implements Runnable {
		public void run() {
			System.out.println("Cleaning up the browser");
			try { 
				Driver.webdriver.quit();
			} catch (NullPointerException e) {
				System.out.println("Browser already shut down.");
			}
		}
	}

	public static WebDriver createWebdriver() throws Throwable {

		String browser = FileReader.readProperties().get("browser");
		Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
		return null;
	}



}
