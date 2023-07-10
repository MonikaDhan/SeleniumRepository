package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskOnActionsMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//MOUSEHOVER = moveToElement
		System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);                                
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement target= driver.findElement(By.xpath("//a[@title='Coins']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();// perform method is mandatory in actions class method 
		
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
		Thread.sleep(2000);
		WebElement coin = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		if(coin.isDisplayed())
		{
			Thread.sleep(2000);
			System.out.println("Yes coin is displayed");
			driver.close();
		}
		else
		{
			System.out.println("coin Not displayed");
		}// run successfully
	}

}
