package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkVerification {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.linkText("Gift Cards")).click();
		
		String expectedTitle = "Amazon.ca: Gift Cards";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedUrl = "https://www.amazon.ca/gp/browse.html?node=9230166011&ref_=nav_cs_gc";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedUrl.equals(actualUrl) && expectedTitle.equals(actualTitle)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}

	}

}
