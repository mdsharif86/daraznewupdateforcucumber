package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public void setUp() {
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver(options);
		
	}
	
	

	
	public void navigateUrl(String url) {
		driver.get(url);
	}
	public void sendKeys(By by, String keyValue) {
		
	}
	public void click(By by) {
		driver.findElement(by).click();
	}
	public String getText (By by) {
		return driver.findElement(by).getText();
	}
	
}
