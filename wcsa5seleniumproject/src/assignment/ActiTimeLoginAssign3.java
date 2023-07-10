package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginAssign3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("weddriver.chrome.driver","./divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-c5d7g85/login.do");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		

	}

}
