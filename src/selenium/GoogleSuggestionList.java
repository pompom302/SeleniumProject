//11 aug (4th day)
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("canada ");//to type canada in google's search window
		Thread.sleep(2000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));// we can also take xpath= //div[@class='aajZCb']/ul/li or //ul[@role='listbox']/li
		System.out.println(suggestions.size());
		
		for(int i = 0; i < suggestions.size(); i++)
		if(suggestions.get(i).getText().contains("canada")) {
		System.out.println(suggestions.get(i).getText());
					} else {
			System.out.println("Test Failed");
		}
	}
}
