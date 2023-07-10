package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("weddriver.chrome.driver","./divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// to click on sing up link
		//driver.findElement(By.linkText("sign up")).click();
		driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("qspider");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class$=_'9npi']")).sendKeys("qspider");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[name='login']")).click();

	

	}

}
