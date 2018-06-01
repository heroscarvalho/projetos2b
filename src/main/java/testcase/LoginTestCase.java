package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.CadastroTask;

public class CadastroTestCase {
	
	private WebDriver driver;
	private CadastroTask cadastro;
	
	
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.get("https://www.grupogreencard.com.br/sysweb/site/loginEstabelecimento");
		this.driver.manage().window().maximize();
		this.cadastro = new CadastroTask(driver);
	}
	
	@Test
	public void testMain() {
		
		this.cadastro.preencherCadastro("20474874000198", "10dhsp");
		
			
		this.cadastro.Captcha();
		this.cadastro.enviarFormulario();
				
	}
	
//	@After
//	public void tearDown() {
//			this.driver.quit();
//	
	
	//}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
