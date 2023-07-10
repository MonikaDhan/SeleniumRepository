package javaScriptExecutorInterface;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollLeftThePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");//to launch browser
		WebDriver driver=new ChromeDriver();//
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.ScrollBy(-5000,0)");

	}

}
