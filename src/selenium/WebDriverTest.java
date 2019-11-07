//4 aug (2nd day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		//className objName = new className();  righthand side has to be fix LHS name we can set
		//InterfaceName objName = new className();
		
		driver.get("https://www.facebook.com/");// to open website with URL
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hjkhn"); //through xpath found email
		
		
		//driver.findElement(By.id("email")).sendKeys("dddddddddddddddf4ewds"); //to find email box on fb
		
		driver.findElement(By.name("pass")).sendKeys("bhjhk");// did not use class=inputtext because this is used mult times so selenium will find very first arrival
		
		driver.findElement(By.id("loginbutton")).click();

	}

}
