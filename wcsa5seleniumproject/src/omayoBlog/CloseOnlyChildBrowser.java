package omayoBlog;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		
	    // open both browsers
		//get address or parent window
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		// get the address or handle of parent and child window
		Set<String> childParent = driver.getWindowHandles();
		
		// how to close only child browser
		
		for(String cp: childParent)
		{
			if(!parent.equals(cp))
			{
				Thread.sleep(2000);
				driver.switchTo().window(cp).close();
				break;
			}
		}
		
	

	}

}
