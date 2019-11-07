//24 August - day 7 (7)
//7th program
//CSS selector syntax: tagname[attributeName='attributeValue']
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginUsingCSSselector {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kdjwjskk");
		//#email where # means ID
		//*[id='email'] where * means any tag name is ok
		//input[id*='mail'] where * after id means contains
		//input[id^='ema'] where ^ means starts with
		//input[id$='ema'] where $ means ends with
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("pakmdwkd");
		driver.findElement(By.cssSelector("input[id='u_0_2']")).click();
	}
}
