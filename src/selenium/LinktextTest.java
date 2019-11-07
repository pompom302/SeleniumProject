//4 aug (2nd day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinktextTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		
		//driver.findElement(By.linkText("About")).click();or
		driver.findElement(By.partialLinkText("Abou")).click(); // to get element just by partially entering text
		
		Thread.sleep(4000);
		
		String expectedTitle = "About | Google";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedUrl = "https://about.google/intl/en/?fg=1&utm_source=google-CA&utm_medium=referral&utm_campaign=hp-header";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		
		if(expectedTitle.equals(actualTitle) && expectedUrl.equals(actualUrl)) {
			 System.out.println("passed");
		}else {
			System.out.println("failed");
		}

	}

}
