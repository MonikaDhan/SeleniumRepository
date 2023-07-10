package frame;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlueStoneAppWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[text()='Allow']")).click();
	Alert al=driver.switchTo().alert();
	al.dismiss();
		//driver.findElement(By.id("chat-icon")).click();
	
		

	}

}
