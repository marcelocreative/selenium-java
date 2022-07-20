package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteGoogle {
	
	@Test
	public void teste() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		Assert.assertEquals("Google", driver.getTitle());
		
		driver.quit();
		
	}

}
