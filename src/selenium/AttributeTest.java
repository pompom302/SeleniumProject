//11 august (4th day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		String s = driver.findElement(By.name("_nkw")).getAttribute("placeholder");//when its not text we can't use getText()
		System.out.println(s);
		//in any input box if we typed something and we want to make sure its been typed no need to check html code
		
		driver.findElement(By.name("_nkw")).sendKeys("watches");
		String p = driver.findElement(By.name("_nkw")).getAttribute("value");////for values we type in , it is by default found with getAttribute("value")
		System.out.println("Typed value:"+ p);
	}

}
