package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator
{
	public static void main(String[]args)
	{
		System.setProperty("weddriver.chrome.driver","./divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("monica geller",Keys.ENTER);
		driver.findElement(By.className("1NPNe")).click();

	}

}
