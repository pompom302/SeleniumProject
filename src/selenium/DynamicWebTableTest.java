//day-9  (1)
//31st August
//let table size is not known
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		for(int i = 1; i < rows.size(); i++) {//started from i = 1 bcz we don't want 1st raw data
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			//System.out.println(cols.size());
			
			for(int j = 0; j < cols.size(); j++) {
				System.out.print(cols.get(j).getText() + " | ");
			}
			System.out.println();
					}

	}

}
