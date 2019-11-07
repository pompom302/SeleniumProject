//10 aug (3rd day)
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("https://www.facebook.com/");
			    driver.findElement(By.name("lastname")).sendKeys("modi");
			    driver.findElement(By.name("reg_email__")).sendKeys("4168561720");
			    driver.findElement(By.name("reg_passwd__")).sendKeys("abc");
			    driver.findElement(By.name("websubmit")).click();
			    
			    Thread.sleep(2000);
			    String expErrMsg = "What’s your name?";
			    //String actualErrMsg = driver.findElement(By.xpath("//div[contains(text(),'your name')]")).getText(); but not preferred 
			    //String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@id,'js_')])[2]")).getText();
			    String actualErrMsg = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij']")).getText();
			    System.out.println(actualErrMsg);
			    
			    if(expErrMsg.equals(actualErrMsg)) {
			    	System.out.println("passed");
			    } else {
			    	System.out.println("failed");
			    }
			    

	}

}
