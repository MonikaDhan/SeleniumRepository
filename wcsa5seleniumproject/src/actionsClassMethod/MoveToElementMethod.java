package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// use to perform mousehover action

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https;//www.bluestone.com/"); // to handle bluestone app
		driver.findElement(By.id("denyBtn")).click();// to handle the popup
		//driver.findElement(By.xpath("Watch Jewellery ")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
		// to perform mouse actions on webelement
		
		Actions act = new Actions(driver);
		
		// to perform mousehover action
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[.='Band']")).click();
		
	}

}
