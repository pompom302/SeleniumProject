//10 aug (3rd day)
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement footer = driver.findElement(By.id("fsl"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));//list hover done then select util java to import
		//webElement hovering and importing is required
		//to find list we have to choose findElements 
		
		WebElement header = driver.findElement(By.id("hptl"));
		List<WebElement> twoLinks = header.findElements(By.tagName("a"));
		
		
		//or
		/*
		* List<WebElement> allLinks = driver.findElements(By.xpath("//span[@id='fsl']/a"));
		*/
		System.out.println(allLinks.size());
		
		
		for(int i = 0; i < allLinks.size(); i++) {   // Sys (allLinks(0).getText())that way seperate elements can be found but here as we have list we create for loop
			System.out.println(allLinks.get(i).getText());
		}
		
		System.out.println(twoLinks.size());
		
		for(int j = 0; j < twoLinks.size(); j++ )
			System.out.println(twoLinks.get(j).getText());
	}

}
