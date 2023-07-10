package popupHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopupHandleInDifferentBrowser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Browser!");
		String browserValue=sc.next();
		if (browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//handle notification popup
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://easemytrip.com/");
		}
		else if (browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			//handle notification popup
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			WebDriver driver = new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://easemytrip.com/");
		}
		else if (browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
			//handle notification popup
			EdgeOptions co = new EdgeOptions();
			co.addArguments("--disable-notifications");
			WebDriver driver = new EdgeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://easemytrip.com/");
			Thread.sleep(2000);
		}
		else
		{
			System.out.println("Enter valid Browser!");
		}
	

	}

}
