package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver.", "./drivers/chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get()
		

	
}

}