package exercise;import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultWindowTest1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver , 30);
		driver.get("https://moodle.cestarcollege.com/moodle/");
		
		driver.findElement(By.linkText("Faq")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainWindow = iter.next();
		System.out.println(mainWindow);
		String childWindow = iter.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		wait.until(ExpectedConditions.titleIs("Frequently Asked Questions (FAQ)"));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(mainWindow);
		wait.until(ExpectedConditions.titleIs("Lambton College in Toronto Learning Management System"));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
