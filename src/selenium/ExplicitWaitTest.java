//24 August - day 7 (5)
//5th program
//explicit wait is when conditions are waited for(for example DragAndDropTest in it after dropped we do something,i.e.there are conditions to be checked for; also in AlertTest)
//implicit is strictly for web element
package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait
		WebDriverWait wait = new WebDriverWait(driver, 100);//explicit wait object creation
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println(draggable.getText());
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText());
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("droppable"), "Dropped!"));//calling explicit wait //Exp +ctrl +space
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}

	}

}
