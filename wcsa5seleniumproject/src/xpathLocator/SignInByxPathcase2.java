package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInByxPathcase2 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//span[text()='Sign In / Join AJIO']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9595706212");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//label[@class='gender-opt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("Monika");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email-mob']")).sendKeys("dhanvijaymonica@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Monika2331");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		


	}

}
