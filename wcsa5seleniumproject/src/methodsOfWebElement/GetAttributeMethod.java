package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("")// orange hrm
		//driver.findElement(By.xpath()).getAttribute("id");// take username path
	//	System.out.println(driver.findElement(By.xpath()).getAttribute("id"););
		 WebElement classAtttributrValue = driver.findElement(By.xpath("")); //pass xpath 
		String classValue = classAtttributrValue.getAttribute("class");
		 System.out.println(classValue);
		
	

	}

}
