package methodDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Point point =new Point (100,100);
		driver.manage().window().setPosition(point);
		

	}

}
