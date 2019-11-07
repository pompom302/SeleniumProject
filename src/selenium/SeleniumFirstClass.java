//4 aug (2nd day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		
		    System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");// to open website with URL
			
			//driver.findElement(By.className("inputtext")).sendKeys("fkjefi");
			driver.findElement(By.id("email")).sendKeys("dddddddddddddddf4ewds"); //to find email box on fb
			//driver.findElement(By.id("pass")).sendKeys("sssssssssssssss43gfdsa");
			driver.findElement(By.name("pass")).sendKeys("ldkw");// did not use class=inputtext because this is used mult times so Selenium will find very first arrival
			//driver.findElement(By.id("loginbutton")).click();	
			//driver.findElement(By.name("email")).sendKeys("payal");// locators are the ones that come after by. (i.e. id, class name) and web elements
			//driver.findElement(By.tagName("input")).sendKeys("dufgsud");
			driver.findElement(By.id("loginbutton")).click();
	}

}
