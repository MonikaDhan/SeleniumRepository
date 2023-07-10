package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByUsingxPathCase1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
		driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9096012844");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Monika");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dhanvijaymonica@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();

	}

}
