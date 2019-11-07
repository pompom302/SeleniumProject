//17 aug(2)

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
			
		List<WebElement> element = driver.findElements(By.linkText("About"));//try using Aboutr
		System.out.println(element.size());
		
		// TO check webelements presence we have to use list and not find.webelement bcz for list, webelemet's presence is not truely mandatory
		//but for webelement it is must(see notes in book)
		
		if(element.size()>0) {
			System.out.println("Element is Present");
		} else {
			System.out.println("Element is not Present");
		}

	}

}
