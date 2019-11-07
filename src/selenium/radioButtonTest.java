//day 5 : 17 aug

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtonTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> allRadio = driver.findElements(By.name("group1"));
		//List<WebElement> allRadio = driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(allRadio.size());

		/*
		 * for(int i = 0; i < allRadio.size(); i++) {
		 * System.out.println(allRadio.get(i).getAttribute("value")); }
		 */
		for(WebElement a: allRadio) {
			System.out.println(a.getAttribute("value")+"--------"+a.isSelected());
		}


		allRadio.get(2).click();//index wise cheese is on number 2 so will find cheese and click on its radio button
		System.out.println("--------------");

		for(WebElement a: allRadio) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value")+"-------"+a.isSelected());
			}
		}
	}
}