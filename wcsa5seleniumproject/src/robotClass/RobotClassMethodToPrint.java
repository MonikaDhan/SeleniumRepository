package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassMethodToPrint {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe" );
		 WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.flipkart.com");
		 driver.findElement(By.xpath("//button[text()='✕']")).click();// to handle popup
		 
		 //to generate print pop up
		 Robot robot = new Robot();
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_P);
		 Thread.sleep(2000);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_P);																		
		 
		 // to transfer control on cancel button
		  
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 driver.quit();
		 
		 
		 
	}

}
