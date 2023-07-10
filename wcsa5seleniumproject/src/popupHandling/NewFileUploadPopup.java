package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NewFileUploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//handle notification popup
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement uploadButton = driver.findElement(By.id("uploadfile"));
		Thread.sleep(2000);
		act.doubleClick(uploadButton).perform();
		//File file = new File("./autoitPrograms/Autoit.exe");
		Thread.sleep(2000);
		//String path = file.getAbsolutePath();
		//Runtime.getRuntime().exec(path);
		//Thread.sleep(4000);
		//Runtime.getRuntime().exec(path);
	}

}
