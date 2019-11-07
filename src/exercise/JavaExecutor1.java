package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaExecutor1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		JavascriptExecutor jse = driver;
		//jse.executeScript("window.scrollBy(0,2500)", "");
		
		WebElement a = driver.findElement(By.linkText("Registration"));
		System.out.println(a.getLocation());
		
		jse.executeScript("arguments[0].scrollIntoView(true);", a);

	}

}
