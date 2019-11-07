//day 5 : 17 aug
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		driver.findElement(By.id("identifierId")).sendKeys("modipayal98@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		//sometimes after entering email we don't click on next button, but just click enter key to go to enter "password page", so we have to test that as well
		Thread.sleep(3000);
		
		//enter wrong password
		driver.findElement(By.name("password")).sendKeys("kdjsjk");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		}
}
