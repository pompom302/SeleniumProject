//11 aug (4th day)
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooList {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
			FirefoxDriver driver = new FirefoxDriver();		
			driver.get("https://ca.yahoo.com/");
			driver.findElement(By.xpath("//span[@data-category='trending news']/div")).click();  //xpath //div[contains(text(),'Trending Now')]
			
			Thread.sleep(1000);
			List<WebElement> all = driver.findElements(By.xpath("//li[@data-category='trending news']/ul/li")); 
			System.out.println(all.size());
			
			for(int i = 0; i < all.size(); i++) {
			System.out.println(all.get(i).getText());
				} 
			
			/*driver.findElement(By.xpath("//xpath //div[contains(text(),'Back to School')]")).click();;
			Thread.sleep(1000);
			List<WebElement> others = driver.findElements(By.xpath("//li[@data-category='trending news']/ul/li")); 
			System.out.println(others.size());
			
			for(int j = 0; j < others.size(); j++) {
			System.out.println(others.get(j).getText());
				} */
	}		
}
