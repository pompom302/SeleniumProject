//25 aug(1)
//day 8 

package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver , 30);
		
		driver.get("https://moodle.cestarcollege.com/moodle/");
		driver.findElement(By.linkText("Faq")).click();

		Set<String> allWindows = driver.getWindowHandles();//getWindowHandles can't give list, it gives set of strings as o/p
		//list allows duplicates so can be used with web elements as they may be duplicates like matching nodes
		//but windows opening will have unique session IDs i.e. handles
		System.out.println(allWindows.size());

		Iterator<String> iter = allWindows.iterator();//to save all windows in one location 
		String mainWindow = iter.next();//iter.next is to read from set; like get(0) in list of web elements
		String childWindow = iter.next();//ctrl will be at top above 0th index, so to jump to first coming window we do iter.next
		System.out.println(mainWindow);
		System.out.println(childWindow);

		driver.switchTo().window(childWindow);
		wait.until(ExpectedConditions.titleIs("Frequently Asked Questions (FAQ)"));//explicit wait
		System.out.println(driver.getTitle());
		driver.close();

		//allWindows = driver.getWindowHandles();//try this after closing 1 of 2 window
		//System.out.println(allWindows.size());
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
