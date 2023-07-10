package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("take dropdown url");
		// identify dropdown
		
		WebElement dropdownElement = driver.findElement(By.id(""));
		
		//handle the dropdown
		 Select sel = new Select(dropdownElement);
	
		 //select multiple options from dropdown
		 for(int i=2; i<=5; i++)
		 {
			 Thread.sleep(2000);
			 sel.selectByIndex(i);
			 
		 }
		 //to read all selected options from dropdown
		 List<WebElement> allOps = sel.getAllSelectedOptions();
		 
		 // to read the list of webelement on console  we use loop ...
		 // for each loop
		 for(WebElement op:allOps)
		 {
			 Thread.sleep(2000);
			 System.out.println(op.getText());
		 }
		 
		 //  by using for loop
		 for(int i=0; i<allOps.size(); i++)
		 {
			 Thread.sleep(2000);
			 System.out.println(allOps.get(i).getText());
		 }
		 
		 
	}

}
