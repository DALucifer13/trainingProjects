package main;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4 {

WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\git\\myStuff\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void market() throws InterruptedException {
		driver.get("https://www.hl.co.uk/shares/stock-market-summary/ftse-100");
		Thread.sleep(1000);
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
        Scrool.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		WebElement button1 = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[4]/div[1]/ul/li[2]/a/strong"));
		button1.click();
		Thread.sleep(1000);
		WebElement highestp = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]/a"));
		String highest = highestp.getText();

		WebElement button2 = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[1]/ul/li[3]/a/strong"));
		button2.click();
		Thread.sleep(1000);
		WebElement lowestp = driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div[4]/div[1]/div[2]/table/tbody/tr[1]/td[2]/a"));
		String lowest = lowestp.getText();

		System.out.println(highest + "\n" + lowest);

//		WebElement result1 = driver.findElement(By.xpath("//*[@id=\"content_div_40583\"]/ul/li[2]/a/strong"));
//		assertEquals("error", result1.getText().contains(""), true);
		
		
	}
	
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
