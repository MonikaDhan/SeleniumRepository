package windowHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHAndlesMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
	
		// get the handle or address of current or parent window
		String parentHandle = driver.getWindowHandle();
		System.out.println("Address of Parent Window:"+parentHandle);
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		Set<String> allHandle = driver.getWindowHandles();
		
		// read address by looping staetement
		
		for(String wh: allHandle)
		{
			System.out.println(wh);
		}
		//System.out.println("Address of Child Window:"+childHandle);
	
	}

}
