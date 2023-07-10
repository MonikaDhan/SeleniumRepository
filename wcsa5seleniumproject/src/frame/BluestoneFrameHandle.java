package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BluestoneFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("fc_widget"); // or driver.swtichTo().frame(6);--> find iframe by using string name or id or index 
		Thread.sleep(2000);
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		
		// switch the control to main web page
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("Monika");
		driver.findElement(By.id("chat-fc-email")).sendKeys("acbd@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("9876543210");
		driver.findElement(By.xpath("//a[text()='Start Chat']")).click();
		
		// need run 
		
		
		
	}
}