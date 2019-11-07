//4 aug (2nd day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElemetTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");// to open website with URL
		
		WebElement email = driver.findElement(By.className("inputtext"));
		email.sendKeys("dddddddddddddddf4ewds"); 
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("ldkw");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();

	}

}
