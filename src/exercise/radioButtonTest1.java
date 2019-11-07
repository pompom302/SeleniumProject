package exercise;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtonTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> group2 = driver.findElements(By.name("group2"));
		System.out.println(group2.size());
		
		for(WebElement a : group2) {
			System.out.println(a.getAttribute("value")+"-------"+a.isSelected());
		}
		
		group2.get(1).click();
		System.out.println("-----------------");
		
		for(WebElement a : group2) {
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+"-------"+a.isSelected());
			}
		}
	}

}
