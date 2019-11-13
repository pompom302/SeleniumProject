package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HighlightConcept {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); 
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.crmpro.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	
		WebElement loginbtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		highlight(loginbtn, driver);
	}
	public static void highlight(WebElement element, WebDriver driver) {
		//JavascriptExecutor js =(JavascriptExecutor) (driver);
		String bgcolor = element.getCssValue("backgroundColor");//to find color of backgnd
		//to blink highlight 100 times
		for(int i = 0 ;i < 100; i++) {
			changeColor("rgb(200,0,0)", element, driver);//change to red color
			changeColor(bgcolor, element, driver);//will conver color back to default colour //back to blue
		}
	}
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor) (driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
	}
	
}
