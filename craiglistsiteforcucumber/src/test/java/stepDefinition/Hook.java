package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base {
	
	@Before
	public void setUp() {
		ChromeOptions option = new ChromeOptions();
		option.setHeadless(false);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
	}
	
//	@After
//	public void close() {
//		driver.close();
//	}
}
