package methodDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSwitchTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		driver.navigate().back();
		driver.close();

	}

}
