package exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		
		  driver.findElement(By.name("B1")).click(); 
		  Thread.sleep(2000);
		  
		  Alert al = driver.switchTo().alert(); 
		  System.out.println(al.getText());
		  al.accept();
		 
		  Thread.sleep(2000);
		  driver.findElement(By.name("B3")).click();
		  Thread.sleep(2000);
		  
		  Alert al1 = driver.switchTo().alert();
		  System.out.println(al1.getText());
		  al1.sendKeys("payal");
		  Thread.sleep(2000);
		  al1.accept();
	}

}
