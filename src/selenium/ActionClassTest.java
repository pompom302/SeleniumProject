//17 august
//involves hovering on links
//
//hovering action
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.nike.com/ca/");

		WebElement men = driver.findElement(By.linkText("MEN"));
		driver.manage().window().maximize();

		Actions builder = new Actions(driver); //(driver) is to link action to driver
		builder.moveToElement(men).build().perform(); // whenever doing action , build().perform() at the end is common, must do
		// this is to hover on men

		Thread.sleep(3000);
		List<WebElement> menSuggestions = driver.findElements(By.xpath("//div[@id='NavigationMenu-0']/div/div[2]/a"));
		//List<WebElement> menSuggestions = driver.findElements(By.xpath("(//div[@class='nav-menu-column prl4-sm va-sm-t d-sm-tc has-left-border is-header'])[1]/a"));
		System.out.println(menSuggestions.size());


		for(int i = 0; i < menSuggestions.size(); i++) {
			System.out.println(menSuggestions.get(i).getText());
		} 
	}

}
