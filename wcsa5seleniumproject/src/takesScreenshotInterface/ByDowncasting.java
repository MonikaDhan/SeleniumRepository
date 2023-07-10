package takesScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncasting {

	public static void main(String[] args) throws IOException {
		
		// screenshot by 2nd way
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;
		 File src=rwd.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./screenshot/google.jpg");
		 Files.copy(src, dest);
	}

}
