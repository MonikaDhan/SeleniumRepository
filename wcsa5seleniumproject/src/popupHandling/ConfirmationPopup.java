package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///E:/HTML/corfirmation%20popup.html");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		//handle confirmation popup
		Alert al = driver.switchTo().alert();
		//al.accept();
		al.dismiss();
		driver.quit();
	}

}
