package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleHenishList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.id("uh-search-box")).sendKeys("henish");
		
		
		Thread.sleep(2000);
		
		//List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li/span/span"));
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='yui3-aclist-content']/ul/li/span/span"));
		System.out.println(allSuggestions.size());
		
		for(int i = 0; i < allSuggestions.size(); i++ ) {
			if(allSuggestions.get(i).getText().contains("he")) {
			System.out.println(allSuggestions.get(i).getText());
			}else {
				System.out.println("test failed");
			}

	}
	}
}
