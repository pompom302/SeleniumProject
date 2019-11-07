//day 6 18-aug(1)
//how can we be sure it's a frame in the page:
//(a) tagname = iframe
//(b) rightclicking on frame gives option: this frame
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com");
		driver.findElement(By.linkText("Droppable")).click();

//in main page
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
		} else {
			System.out.println("sortable is not Present");
		}

//in main page
		List<WebElement> draggable = driver.findElements(By.linkText("Draggable"));//if we find with (By.id("draggable")) it will shoe as not present bcz its in frame and not main page
		System.out.println(draggable.size());
		if(draggable.size()>0) {
			System.out.println("draggable is Present");
		} else {
			System.out.println("draggable is not Present");
		}
		
		System.out.println("------------------------------");
		
		driver.switchTo().frame(0);//to jump to frame through index
		//driver.switchTo().frame("demo-frame"); //in our case we won't be able to use string bcz we need id for this.will work only with id.
		//driver.switchTo().frame(By.className("demo-frame")); //to jump to frame through web-element
		
//in frame		
		sortable = driver.findElements(By.linkText("Sortable"));//here sortable will not be present  bcz here it will try finding sortable in frame
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
		} else {
			System.out.println("sortable is not Present");
		}

//in frame
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(sortable.size()>0) {
			System.out.println("draggable is Present");
		} else {
			System.out.println("draggable is not Present");
		}
		
		System.out.println("-------------------------------");
		
		driver.switchTo().defaultContent(); //to jump back to main page
		
//in main page
		sortable = driver.findElements(By.linkText("Sortable"));//here sortable will not be present  bcz here it will try finding sortable in frame
		System.out.println(sortable.size());
		if(sortable.size()>0) {
			System.out.println("sortable is Present");
		} else {
			System.out.println("sortable is not Present");
		}

//in main page
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		if(draggable.size()>0) {
			System.out.println("draggable is Present");
		} else {
			System.out.println("draggable is not Present");
		}
		
		//driver.switchTo().parentFrame();//see book notes
		
	}
}


