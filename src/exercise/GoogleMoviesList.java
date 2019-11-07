//google>search>movies>all the way down>list
package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleMoviesList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("movies");
		driver.findElement(By.xpath("(//div[@class='FPdoLc VlcLAe']//input)[1]")).click();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='card-section']/div/p"));
		System.out.println(allLinks.size());
		
		for(int i = 0; i < (allLinks.size()); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		

	}

}
