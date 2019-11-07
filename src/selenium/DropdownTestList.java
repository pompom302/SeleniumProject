//11 august (4th day)
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTestList {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.ebay.ca/");

		WebElement box = driver.findElement(By.id("gh-cat"));
		List<WebElement> all = box.findElements(By.tagName("option"));

		//driver.findElement(By.id("gh-cat-box"));
		//List<WebElement> all = driver.findElements(By.xpath("//div[@id='gh-cat-box']/select/option")); 
		//List<WebElement> all = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(all.size());

		for(int i = 0; i < all.size(); i++) {
			if(all.get(i).isSelected()) {
				System.out.println(all.get(i).getText()+"--------"+ all.get(i).isSelected());
			}
		}
		Select s = new Select(box);
		//s.selectByIndex(2);
		//s.selectByValue("6000"); from option in Q
		s.selectByVisibleText("Books");

		System.out.println("----------------------after selection--------------------------");

		for(int i = 0; i < all.size(); i++) {
			if(all.get(i).isSelected()) {
				System.out.println(all.get(i).getText()+"--------"+ all.get(i).isSelected());
			}
		}
	}
}
