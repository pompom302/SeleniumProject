//day 7 18-aug(2)
//for java script pop-up, it is called alert
//alerts' webelements can't be inspected , there is special function named alert() used for it

package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//will wait until 30 seconds to find expected webelement
		WebDriverWait wait = new WebDriverWait(driver,100);//explicit wait


		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();//to click on java script alert
		System.out.println(al.getText());

		al.accept();//to click on default selected value
		//al.dismiss();//to click on other value from default selected value
	}

}


