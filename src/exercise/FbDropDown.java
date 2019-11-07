package exercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropDown {

	public static void main(String[] args) {
		
			
				System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
						FirefoxDriver driver = new FirefoxDriver();
						
						driver.get("https://www.facebook.com/");
					    driver.findElement(By.name("lastname")).sendKeys("modi");
					    driver.findElement(By.name("reg_email__")).sendKeys("4168561720");
					    driver.findElement(By.name("reg_passwd__")).sendKeys("abc");
					    
					    WebElement month = driver.findElement(By.id("month"));
					    Select m = new Select(month);
					    m.selectByIndex(4);
					    
					    WebElement day = driver.findElement(By.id("day"));
					    Select d = new Select(day);
					    d.selectByValue("6");
					    
					    WebElement year = driver.findElement(By.id("year"));
					    Select y = new Select(year);
					    y.selectByVisibleText("1993");
					    
					    driver.findElement(By.name("websubmit")).click();
	}

}
