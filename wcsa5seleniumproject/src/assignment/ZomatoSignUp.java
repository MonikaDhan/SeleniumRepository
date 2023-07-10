package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) 
	{
		System.setProperty("weddriver.chrome.driver","./divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		// to click on sing up link
		driver.findElement(By.linkText("sign up")).click();
		driver.findElement(By.cssSelector("input")).click();
		//driver.findElement("")

	}

}
