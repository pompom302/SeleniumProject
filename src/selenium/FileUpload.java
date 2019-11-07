package selenium;

import java.io.IOException;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {								
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();	
	    driver.get("https://ca.indeed.com/jobs?q=customer%20service&l=Brampton%2C%20ON&advn=3055108626518303&vjk=b2c9d3f6bc0ba9a4");
	    driver.findElement(By.className("indeed-apply-button")).click();  
	    driver.findElement(By.id("ia-FilePicker-resume")).click();
		/*
		 * Thread.sleep(3000); driver.findElement(By.id("postjob")).click();
		 * Thread.sleep(3000); driver.findElement(By.id("input_3")).sendKeys("Gaurav");
		 * driver.findElement(By.id("id_4")).sendKeys("test.test@gmail.com		");
		 * driver.findElement(By.id("input_4")).click(); // below line execute the
		 * AutoIT script . Runtime.getRuntime().exec("E:\\AutoIT\\FileUpload.exe");
		 * driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");
		 * driver.findElement(By.id("input_2")).click(); driver.close();
		 */
	     }
	}
