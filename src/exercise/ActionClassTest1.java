package exercise;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.nike.com/ca/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement women = driver.findElement(By.linkText("WOMEN"));
				
		Actions builder = new Actions(driver);
		builder.moveToElement(women).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> womenSuggestions = driver.findElements(By.xpath("//ul[@class='ta-sm-c']/li[2]/div[1]/div[1]/div[4]//a"));
		//List<WebElement> womenSuggestions = driver.findElements(By.xpath("(//div[@class='nav-menu-column prl4-sm va-sm-t d-sm-tc has-left-border is-static is-header'])[2]//a"));
		System.out.println(womenSuggestions.size());
		
		for(WebElement a : womenSuggestions) {
			System.out.println(a.getText());
		}
	}
}
