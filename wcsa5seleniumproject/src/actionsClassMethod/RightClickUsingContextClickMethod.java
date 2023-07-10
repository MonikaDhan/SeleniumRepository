package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingContextClickMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///E:/HTML/singledropdown.html");
		
		WebElement target = driver.findElement(By.xpath("//select[@id='menu']"));
		
		// to right click on web page 
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(target).perform();
		
		}

}
