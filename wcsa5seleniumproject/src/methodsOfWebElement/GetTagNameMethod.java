package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver.", "./drivers/chromediver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-c5d7g85/login.do");
		System.out.println(driver.findElement(By.id("LoginButton")).getTagName());
		// run
	}

}
