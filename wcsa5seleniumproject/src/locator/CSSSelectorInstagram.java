package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorInstagram {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='ern']")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='acap ']")).click();
	



	}

}
