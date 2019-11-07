////day 6 18 aug 
package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(500);
		driver.navigate().to("http://www.mississauga.ca/portal/home");  
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
	}

}
