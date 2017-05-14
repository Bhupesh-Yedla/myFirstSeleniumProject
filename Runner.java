package automation.irctc.bookticket;

import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {
	@Before
	public static void browserSetup() throws Exception{
		System.out.println("starting with browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhupesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Initialise browser driver
		String url = "http://www.irctc.co.in";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
}
