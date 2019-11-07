//24 August - day 7 (2)
//2nd program
//if pop-up is there close it
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();


		driver.get("https://www.aliexpress.com/");
		Thread.sleep(2000);

		List<WebElement> popUp = driver.findElements(By.className("close-layer"));//By.linktest("x") also popUp could be found
		System.out.println(popUp.size());

		if(popUp.size()>0) {
			popUp.get(0).click();
			} 

		driver.findElement(By.linkText("Buyer Protection")).click();
	}

}
