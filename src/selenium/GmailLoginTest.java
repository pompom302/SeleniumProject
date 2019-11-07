//10 aug (3rd day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//enter correct email id
		driver.findElement(By.id("identifierId")).sendKeys("modipayal98@gmail.com");
			
		//click on next button
		driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
		//span[contains(text(),'Next')] also can be used
		//div[@id='identifierNext']/span/span
		//span[@class='RveJvd snByac']
		Thread.sleep(3000);
		
		//enter wrong password
		driver.findElement(By.name("password")).sendKeys("kdjsjk");
		
		//click on next button
		driver.findElement(By.xpath("//span[@class='CwaK9']/span[1]")).click();
		//span[contains(text(),'Next')] also can be used
		//div[@id='identifierNext']/span/span
		//span[@class='RveJvd snByac']
		
		Thread.sleep(2000);
		
		String expErrMsg = "Wrong password. Try again or click Forgot password to reset it.";
		String actualMsg = driver.findElement(By.xpath("//div[@jsname='B34EJ']/span")).getText();
		System.out.println(actualMsg);
		
		if(expErrMsg.equals(actualMsg)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		}
	}


