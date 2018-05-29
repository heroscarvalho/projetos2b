package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.LoginTask;


public class LoginTestCase {
	private WebDriver driver;
	private LoginTask login;
	
	
	
	@Before
	public void SetUp() {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.get("https://www.grupogreencard.com.br/sysweb/site/loginEstabelecimento");
		this.login = new LoginTask(driver);	
	}
	
	@Test
	public void testMain() {
		this.login.PreencherLogin("20474874000198", "10dhsp");
		this.login.logar();
	}
	

	@After
	public void tearDown() {
		//this.driver.quit();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}