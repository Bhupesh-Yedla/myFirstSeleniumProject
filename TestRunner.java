package automation.irctc.bookticket;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue;

public class TestRunner {
	
	WebDriver driver;
	String url;
	WebElement userID, password, Login, fromStation, toStation, jrnyDate, submit,tatkal,sleeper,booknow,passengerAge, passengerName,passengerGender;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("starting with browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhupesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Initialise browser driver
		driver = new ChromeDriver();
		url = "http://www.irctc.co.in";
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		System.out.println("Login");
		//fail("Not yet implemented");
		//System.out.println(driver.manage().window().getSize());
		userID = driver.findElement(By.id("usernameId"));
		userID.sendKeys("bhupesh266");
		password = driver.findElement(By.className("loginPassword"));
		password.sendKeys("bpf357");
		Thread.sleep(7000);
		Login = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		Login.click();
		fromStation = driver.findElement(By.xpath(".//*[@id='jpform:fromStation']"));
		fromStation.sendKeys("PUNE JN - PUNE");
		toStation = driver.findElement(By.xpath(".//*[@id='jpform:toStation']"));
		toStation.sendKeys("SECUNDERABAD JN - SC");
		jrnyDate = driver.findElement(By.xpath(".//*[@id='jpform:journeyDateInputDate']"));
		jrnyDate.sendKeys("15-05-2017");
		submit = driver.findElement(By.id("jpform:jpsubmit"));
		submit.click();
		tatkal = driver.findElement(By.xpath(".//*[@id='qcbd']/table/tbody/tr/td[5]/input"));
		//System.out.println(tatkal);
		System.out.println("selecting Tatkal");
		tatkal.click();
		Thread.sleep(5000);
		sleeper = driver.findElement(By.xpath(".//*[@id='cllink-17013-SL-2']"));
		System.out.println("selecting SL");
		sleeper.click();
		Thread.sleep(5000);
		booknow = driver.findElement(By.xpath(".//*[@id='17013-SL-TQ-0']"));
		booknow.click();
		System.out.println("Booking Now");
		Thread.sleep(5000);
		passengerName = driver.findElement(By.xpath(".//*[@id='addPassengerForm:psdetail:0:p1652270205']"));
		passengerName.sendKeys("Bhupesh Yedla");
		passengerAge = driver.findElement(By.xpath(".//*[@id='addPassengerForm:psdetail:0:psgnAge']"));
		passengerAge.sendKeys("27");
		passengerGender = driver.findElement(By.xpath(".//*[@id='addPassengerForm:psdetail:0:psgnGender'])"));
		Select dropdown = new Select(passengerGender);
		dropdown.selectByIndex(1);
		
		}

	private By ByValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Terminating browser");
		//Thread.sleep(7000);
		//driver.close();
	}

	
}
