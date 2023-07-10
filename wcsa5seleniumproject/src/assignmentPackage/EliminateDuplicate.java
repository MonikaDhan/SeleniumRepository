package assignmentPackage;

import java.time.Duration;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("take dropdown url");
		// identify dropdown
		
		WebElement dropdownElement = driver.findElement(By.id(""));
		
		//handle the dropdown
		 Select sel = new Select(dropdownElement);
		HashSet<String> hs = new HashSet<String>();
		
		
		
		 
	}

}
