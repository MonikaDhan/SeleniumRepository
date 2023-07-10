package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginSynchronization {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
// NOT RUN
	}

}
