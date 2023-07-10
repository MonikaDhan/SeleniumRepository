package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixAssignment4 {

	public static void main(String[] args)
	{
		System.setProperty("weddriver.chrome.driver","./divers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		

	}

}
