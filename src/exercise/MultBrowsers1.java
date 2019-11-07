package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultBrowsers1 {

	public static void main(String[] args) {
		
		String browser = "ChromeDriver";
		WebDriver driver;
		
		if(browser.equals("ChromeDriver")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
		System.setProperty("Webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dddddddddddddddf4ewds");
		driver.findElement(By.name("pass")).sendKeys("ldkw");
		driver.findElement(By.id("loginbutton")).click();
	}
	}

