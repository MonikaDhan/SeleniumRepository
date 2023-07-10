package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActionsMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("//https:www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='")).click();
		driver.findElement(By.name("q")).sendKeys("Hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//span["));
		
	}

}
