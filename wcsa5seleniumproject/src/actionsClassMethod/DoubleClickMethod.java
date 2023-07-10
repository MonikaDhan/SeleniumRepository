package actionsClassMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {
		static WebDriverWait wait;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-c5d7g85/login.do");
		 wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleContains(null));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//home page
		wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(null));
		// click on setting module
		driver.findElement(By.xpath("//a[.='Logo&color scheme']")).click();
		Thread.sleep(2000);
		// click on custome logo
		driver.findElement(By.id("")).click();
		//click on button to select the file
		// incomplete script
		}

}