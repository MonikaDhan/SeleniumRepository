package omayoBlog;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
	// open both browsers
		//String parent = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		Set<String> childParent = driver.getWindowHandles();
		for(String cp:childParent)
		{
			System.out.println(cp);
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
