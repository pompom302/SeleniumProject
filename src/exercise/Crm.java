package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://classic.crmpro.com");
		driver.findElement(By.name("username")).sendKeys("PayalModi");
		driver.findElement(By.name("password")).sendKeys("PayalHenish");
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
		driver.findElement(By.linkText("Contacts")).click();
	}

}
