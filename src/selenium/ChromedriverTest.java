//11 august (4th day)
package selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromedriverTest {

	public static void main(String[] args) {
		

		
		        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");// to excess web driver
				
				//System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); 
				ChromeDriver driver = new ChromeDriver();
				
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();

	}

}
