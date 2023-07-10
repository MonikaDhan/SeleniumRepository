package takesScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotBy4thWay {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver rdriver = new ChromeDriver();
		rdriver.manage().window().maximize();
		rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		rdriver.get("https://www.instagram.com/");
		File src = rdriver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/insta.jpg");
		
		Files.copy(src, dest);
		
	}

}
