package tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	
	@Test
	public void deveInteragirComRadioButton() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		
		driver.quit();
	}
	
	@Test
	public void deveInteragirComCheckbox() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		driver.findElement(By.id("elementosForm:comidaFavorita:2")).click();
		
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:2")).isSelected());
		
		driver.quit();
	}
	
	@Test
	public void deveInteragirComCombobox() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo= new Select(element);
		combo.selectByVisibleText("2o grau completo");
		
		Assert.assertEquals("2o grau completo", combo.getFirstSelectedOption().getText());
		
		driver.quit();
		
	}
	
	@Test
	public void deveVerificarValoresCombobox() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"/src/main/resources//componentes.html");
		
		WebElement element = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo= new Select(element);
		
		combo.selectByVisibleText("Mestrado");
		
		List<WebElement> options= combo.getOptions();
		
		Assert.assertEquals(8, options.size());
		
		Boolean encontrou= false;
		
		for(WebElement option : options) {
			
			if(option.getText().equals("Mestrado")) {
				encontrou= true;
				break;
			}
			
		}
		
		Assert.assertTrue(encontrou);
		
	}


}
