//11 august (4th day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardButtonTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
	}
}
