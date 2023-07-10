package takesScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotByBrowserSpecificClassesWay3rd {

	public static void main(String[] args) throws IOException {
		
		// Screenshot by 3rd way
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cdriver.get("https://www.selenium.dev");
		File src = cdriver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/seleniumpage.jpg");
		
		Files.copy(src, dest);
		
	}

}
