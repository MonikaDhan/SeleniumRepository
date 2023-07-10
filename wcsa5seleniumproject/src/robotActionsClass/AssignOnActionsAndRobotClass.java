package robotActionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignOnActionsAndRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to launch bluestone
		driver.get("https://www.bluestone.com/");
		// to handle hidden division popup
		driver.findElement(By.id("denyBtn")).click();
		
		// moveToElement to watch jewellery
		Actions act=new Actions(driver);
		WebElement target =driver.findElement(By.xpath("//a[text()=watch Jewellery]"));
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		
		//click and hold filter by text
		
		WebElement target1=driver.findElement(By.xpath("//div[text()='Filter By']"));
				
		for(int i=1; i<=2; i++ )
		{
			act.doubleClick(target1).perform();
			act.clickAndHold(target1).perform();
		}
		Thread.sleep(2000);
		
		//copy the filter by text
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		// identify the search box
		
		driver.findElement(By.id("search_query_top_elastic_search"))
	
		
		
		

	}

}
