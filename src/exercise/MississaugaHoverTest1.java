package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaHoverTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		// WebElement thingsToDo =
		// driver.findElement(By.xpath("//div[@id='tnNavDiscover']"));
		WebElement thingsToDo = driver.findElement(By.id("tnNavDiscover"));

		Actions builder = new Actions(driver);
		builder.moveToElement(thingsToDo).build().perform();
		Thread.sleep(3000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@id='tnNavDiscoverMenu']//a"));
		System.out.println(suggestions.size());

		for (int i = 0; i < suggestions.size(); i++) {
			System.out.println(suggestions.get(i).getText());
			Thread.sleep(1000);
			  if(suggestions.get(i).getText().equals("Celebration Square")) { 
			  suggestions.get(i).click(); break; }
			 
		}
	}
}