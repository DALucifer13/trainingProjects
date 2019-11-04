package main;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3 {

WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\git\\myStuff\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void register() throws InterruptedException {
		driver.get("https://www.youidraw.com/apps/painter/");
		Actions action = new Actions(driver);
		
		
		
		
		action.moveByOffset(512, 256).clickAndHold().moveByOffset(0, 60).release().perform();
		action.moveByOffset(30, -60).clickAndHold().moveByOffset(-30, 30).moveByOffset(30, 30).release().perform();
		
		action.moveByOffset(10, -60).clickAndHold().moveByOffset(15, 30).moveByOffset(15, -30).moveByOffset(-15, 30).moveByOffset(0,30).release().perform();
		
		action.moveByOffset(30, -60).clickAndHold().moveByOffset(0, 60).moveByOffset(30, 0).release().perform();
		
		action.moveByOffset(40, -60).clickAndHold().moveByOffset(-30, 0).moveByOffset(0, 60).moveByOffset(30, 0).release().perform();
		action.moveByOffset(0, -30).clickAndHold().moveByOffset(-30, 0).release().perform();
		
		
		Thread.sleep(3000);
		
	}
	
	
//	@After
//	public void tearDown() {
//		driver.close();
//	}
	
}
