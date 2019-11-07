//11 aug (4th day)
package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

}
