package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("asdf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("asd");//disable= false n asdfgh enable=true
		boolean loginbutton = driver.findElement(By.xpath("//button[contains(@class,'_acap')]")).isEnabled();
		System.out.println(loginbutton );
		//run successfully
	}

}
