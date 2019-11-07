//day 5: 17 aug
//hover on city hall and get list
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumJars\\geckodriver.exe"); // to excess web driver
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.mississauga.ca/portal/home");
		
		WebElement cityHall = driver.findElement(By.id("tnNavHall"));
				
		Actions builder = new Actions(driver); //(driver) is to link action to driver
		builder.moveToElement(cityHall).build().perform();//will hover on cityhall image
		Thread.sleep(2000);
				
		List<WebElement> cityHallList = driver.findElements(By.xpath("//div[@id='tnNavHallMenu']/a"));
		//List<WebElement> cityHallList = driver.findElements(By.xpath("//a[contains(text(),'Mayor & Council')]/../a")); by using "/.." we can go one line up
		System.out.println(cityHallList.size());
		
		for(int i = 0; i < cityHallList.size(); i++) {
			System.out.println(cityHallList.get(i).getText());
			if(cityHallList.get(i).getText().equals("Jobs & Careers")) { //click on jobs and career
				cityHallList.get(i).click();
				break;
			}
		}
	}
}
