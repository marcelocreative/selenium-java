package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void testeTextField() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Escrita de texto");
		Assert.assertEquals("Escrita de texto", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		driver.quit();
		
	}
	
	@Test
	public void deveInteragirComTextArea() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Texto no textArea");
		Assert.assertEquals("Texto no textArea", driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		
		driver.quit();
	}


}
