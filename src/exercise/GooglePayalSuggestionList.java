package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePayalSuggestionList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("payal ");
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li"));
		System.out.println(allSuggestions.size());
		
		for(int x = 0; x < allSuggestions.size(); x++) {
			if(allSuggestions.get(x).getText().contains("payal")) {
			System.out.println(allSuggestions.get(x).getText());
		} else {
			System.out.println("test failed");
		}
		}
	}
}
			

