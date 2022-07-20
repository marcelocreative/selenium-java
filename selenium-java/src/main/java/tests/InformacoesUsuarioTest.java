package tests;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {

    private  WebDriver navegador;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marce\\drivers\\chromedriver.exe");
        navegador= new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();
        navegador.get("http://www.juliodelima.com.br/taskit");

    }

    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){

        navegador.findElement(By.linkText("Sign in")).click();

        WebElement formularioSignInbox = navegador.findElement(By.id("signinbox"));
        formularioSignInbox.findElement(By.name("login")).sendKeys("marcelocreative");
        formularioSignInbox.findElement(By.name("password")).sendKeys("g18m23");

        navegador.findElement(By.linkText("SIGN IN")).click();

        WebElement me= navegador.findElement(By.className("me"));
        String textoNoElementoMe= me.getText();

        assertEquals("Hi, Marcelo de Oliveira",textoNoElementoMe);

    }

    @After
    public void tearDown(){
        navegador.quit();
    }

}
