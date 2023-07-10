package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElementMethod {

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
		 
		//  List<WebElement> allOps = sel.getAllSelectedOptions();
		 
		 // to read the list of webelement on console  we use loop ...
		 // for each loop
	//	 for(WebElement op:allOps)
	//	 {
	//		 System.out.println(op.getText());
	//	 }
		 WebElement allOps = sel.getWrappedElement();
		 System.out.println(allOps.getText());
	
	}

}
