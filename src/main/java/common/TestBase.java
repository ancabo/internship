package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void quitDriver() {
	//	if (driver != null)
	//		driver.quit();
	}
	

}
