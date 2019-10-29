package main;

import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class sTester {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\git\\myStuff\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	@Ignore
	public void testOne() throws InterruptedException {
		System.out.println("Test 001");
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	}
	
	@Test
	
	public void testTwo() {
		driver.get("https://www.google.com");
		WebElement webele1 = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		webele1.sendKeys("Halloween");
		WebElement submit1 = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]"));
		submit1.submit();
		
		WebElement result1 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div/div/div/div/span/div/div/div"));
		assertEquals("error", result1.getText().equals("Thursday, 31 October"), true);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}