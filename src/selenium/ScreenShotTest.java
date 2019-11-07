//day 7 18 aug 
package selenium;

import java.io.File;//to create file we have to import it
import java.io.IOException;//for copyfile thing

import org.apache.commons.io.FileUtils;//download and add path then import
import org.openqa.selenium.OutputType;//for output type element , we have to import this

import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		File scrFile = driver.getScreenshotAs(OutputType.FILE);//This is for firefox driver
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// this line is for webdriver..//writing into braces to match the both sides is called casting
		//above line is to call through interface and match LHS and RHS if I am using #WebDriver driver = new FirefoxDriver();
		
		FileUtils.copyFile(scrFile, new File("C:\\testing\\screenshot.jpeg"));// to give location where we want to save our screenshots , png files can also be got
		//FileUtils.copyFile(scrFile, new File("C:\\testing\\screenshot.png"));
	}
	

}
