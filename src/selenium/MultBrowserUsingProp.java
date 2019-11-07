//day 10 (2.a) after Read_write_PropertiesFile.java from XLS_project
//1st September
package selenium;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultBrowserUsingProp {

	public static void main(String[] args) throws IOException {

		FileInputStream fs = new FileInputStream("C:\\testing\\prop.properties");//reads this file
		Properties prop = new Properties();
		prop.load(fs);

		String browser = prop.getProperty("Browser");//in there browser is Chrome
		System.out.println(browser);
		WebDriver driver;

		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();		
		} 

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dddddddddddddddf4ewds");
		driver.findElement(By.name("pass")).sendKeys("ldkw");
		driver.findElement(By.id("loginbutton")).click();



	}

}
