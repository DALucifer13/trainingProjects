package main;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\git\\myStuff\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void cart() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php");
		WebElement webele1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"));
		webele1.sendKeys("Dress");
		WebElement button1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button"));
		button1.submit();
		
		
		List<WebElement> wes = driver.findElements(By.tagName("a"));
		for(WebElement w : wes) {
			if(w.getText().contains("Chiffon")) {
				w.click();
				break;
			} 
		}
		Thread.sleep(3000);
		WebElement button2 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
		button2.click();
		Thread.sleep(3000);
		WebElement result1 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2"));
		assertEquals("error", result1.getText().contains("Product successfully added"), true);
		
		
	}
	
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
