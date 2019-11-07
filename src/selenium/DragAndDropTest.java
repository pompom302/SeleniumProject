//24 August - day 7 (3)
//3rd program
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);// frame with index, with string (i.e. id), with webelement
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		System.out.println(draggable.getText());
		WebElement droppable = driver.findElement(By.id("droppable"));
		System.out.println(droppable.getText());
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		
		Thread.sleep(2000);
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		
	}

}
