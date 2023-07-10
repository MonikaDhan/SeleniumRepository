package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobile Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123654");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-z2wwpe r-1loqt21 r-1x0uki6 r-ah5dr5 r-1otgn73']")).click();
		

	}

}
