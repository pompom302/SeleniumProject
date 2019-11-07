package exercise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		Thread.sleep(2000);
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		//File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
		
		FileUtils.copyFile(srcFile, new File("C:\\testing.\\screenshot1.jpeg"));
		FileUtils.copyFile(srcFile, new File("C:\\testing.\\screenshot1.png"));

	}

}
