//day 6 18 aug 
//in some programs it has to be in view of selenium to find some web element , in such cases we want this method 
//it will drive selenium where element is
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,10000)","");//fixed syntax to scroll down on web page till the co-ordinate values we are giving is reached

		WebElement a = driver.findElement(By.linkText("Registration"));//registration is under Buy in website
		System.out.println(a.getLocation());
		
		jse.executeScript("arguments[0].scrollIntoView(true);",a);	//fixed syntax to find location where the webelement we are looking for islocated so it will scroll until
		//it gets element we are looking for on that page
		}
}

