package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("weddriver.chrome.driver","./divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.netflix.com/in.login");
		
		// to identify web element we use locator
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("Dare@mail.com");
		driver.findElement(By.id("id_password")).sendKeys("DareDavil");
		driver.findElement(By.xpath("/button[@class='btn login-button btn-sbmit btn-small']")).click();
		
		

	}

}
