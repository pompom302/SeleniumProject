//day 6 18 aug 
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayHover {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(Electronics).build().perform();
		
		Thread.sleep(2000);
		List<WebElement> ElectronicsList = driver.findElements(By.xpath("(//div[@class='hl-cat-nav__flyout']/div[1]/div[1])[3]/ul//a"));//xpath: (//li[@class='hl-cat-nav__js-tab'])[3]/div/div[1]/div[1]//a
		//List<WebElement> ElectronicsList = driver.findElements(By.xpath("//li[@data-hover-track='p2481888.m1381.l6435']/div[2]/div[1]/div[1]//a"));
		System.out.println(ElectronicsList.size());
		
//		for(int i = 0; i < ElectronicsList.size(); i++) {
//			System.out.println(ElectronicsList.get(i).getText());
//		} 
	
		for(WebElement a : ElectronicsList) {
			System.out.println(a.getText());
		} 
		
		

		

	}

}
