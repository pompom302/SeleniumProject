package exercise;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe"); 
		FirefoxDriver  driver = new FirefoxDriver();
		 driver.get("https://www.freecrm.com"); 
		 String title = driver.getTitle();
		  System.out.println(title);
		  driver.findElement(By.linkText("Log In")).click();
		  driver.findElement(By.name("email")).sendKeys("modipayal98@gmail.com");
		  driver.findElement(By.name("password")).sendKeys("PayalHenish"); 
		  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		  String title1 = driver.getTitle(); 
		  System.out.println("Home Page title ::"+ title1);
	}

}
