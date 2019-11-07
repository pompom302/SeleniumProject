//24 August - day 7(1) 
//1st program
//to select web driver by itself based on application 
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiplBrowsersTest {

	public static void main(String[] args) {

		String browser = "Firefox";
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();		
		} 
		/*else {
			 * System.setProperty("webdriver.ie.driver", "C:\\SeleniumJars\\iedriver.exe");
			 * IE driver = new IE driver 
			 * }  */
		 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dddddddddddddddf4ewds");
		driver.findElement(By.name("pass")).sendKeys("ldkw");
		driver.findElement(By.id("loginbutton")).click();


	}
}

