package tasks;

import org.openqa.selenium.WebDriver;

import appobject.LoginAppObject;

public class LoginTask {
	private LoginAppObject loginAppObject;
	
	public LoginTask(WebDriver driver) {
		this.loginAppObject = new LoginAppObject(driver);	
	}
	
	public void PreencherLogin(String cnpj, String codigodeacesso) {
		this.loginAppObject.getCNPJTextField().sendKeys(cnpj);
		this.loginAppObject.getCodigoDeAcessoTextField().sendKeys(codigodeacesso);
		this.loginAppObject.getCaixaDeSegurançaTextField().click();
		
	}
	
	public void logar() {
		this.loginAppObject.getAcessarButton().click();
		
	}
	
}
