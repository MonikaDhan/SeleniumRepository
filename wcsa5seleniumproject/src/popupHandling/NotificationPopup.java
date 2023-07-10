package popupHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//handle notification popup
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://easemytrip.com/");
		
		driver.quit();
		
		// successfully run
	}

}
