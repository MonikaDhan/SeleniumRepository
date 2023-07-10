package robotClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAndActionClassMethodToHandleSelenium {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("driver.edge.driver","./drivers/edgedriver.exe" );
		 WebDriver  driver= new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.selenium.dev/");
		 
		WebElement target = driver.findElement(By.xpath("//span[text()='Downloads']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		Thread.sleep(2000);
		driver.quit();
		 

	}

}
