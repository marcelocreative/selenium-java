package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void teste() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		
		
	}

}
