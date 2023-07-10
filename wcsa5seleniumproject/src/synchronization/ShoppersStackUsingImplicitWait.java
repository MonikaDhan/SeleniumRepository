package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackUsingImplicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https:/www.shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='men'")).click();
		driver.findElement(By.xpath("//img[@alt='HOODIES']")).click();
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
	

	}

}
