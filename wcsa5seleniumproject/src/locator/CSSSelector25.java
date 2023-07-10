package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector25 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//FACEBOOK
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id$='l']")).sendKeys("monika@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name*='as']")).sendKeys("monika123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[name^='l']")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_97w3")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[name^='r']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name^='e']")).sendKeys("abcd@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[rel='nofollow']")).click();
		Thread.sleep(1000);
		
	}
}
