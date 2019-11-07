//singleton pattern concept used in selenium
package singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {
	
	private static DriverInit instanceDriver = null;
	private static WebDriver driver;
	
	private DriverInit() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		driver = new FirefoxDriver();
		return driver;
	}
	
	public static DriverInit getInstance() {
		if(instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;
		
	}
	public static void main(String[] args) {
		DriverInit x = DriverInit.getInstance();
		driver = x.openBrowser();
		driver.get("https://www.google.com");
		driver.quit();
	}

}
