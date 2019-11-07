package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("modipayal98@gmail.com");
		driver.findElement(By.name("password")).sendKeys("modipayal98@gmail.com");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
	}

}
