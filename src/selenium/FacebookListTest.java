//10 aug (3rd day)
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@role='contentinfo']/ul/li"));

		System.out.println(allLinks.size());

		for(int i = 0; i < allLinks.size(); i++) {   // Sys (allLinks(0).getText())that way separate elements can be found but here as we have list we create for loop
			System.out.println(allLinks.get(i).getText());

		}
	}
}
