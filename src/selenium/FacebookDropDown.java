//11 august (4th day)
package selenium;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("lastname")).sendKeys("modi");
		driver.findElement(By.name("reg_email__")).sendKeys("4168561720");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc");

		WebElement month= driver.findElement(By.id("month"));
		//List<WebElement> all = month.findElements(By.tagName("option"));
		Select m = new Select(month);
		m.selectByIndex(4);

		WebElement day= driver.findElement(By.id("day"));
		//List<WebElement> all1 = day.findElements(By.tagName("option"));
		Select d = new Select(day);
		d.selectByValue("6");

		WebElement year= driver.findElement(By.id("year"));
		//List<WebElement> all2 = year.findElements(By.tagName("option"));
		Select y = new Select(year);
		y.selectByVisibleText("1993");


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
