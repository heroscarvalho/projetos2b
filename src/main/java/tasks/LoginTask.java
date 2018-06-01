package tasks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appobject.CadastroAppObject;
public class CadastroTask {
	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);
	}
	
	public void preencherCadastro(String nome, String codacesso) {
		this.cadastroAppObject.getCNPJTextField().sendKeys(nome);
		this.cadastroAppObject.getCodigoAcessoTextField().sendKeys(codacesso);
	
	}
	
	public void Captcha() {
		this.cadastroAppObject.getCaptcha().click();	
		
	}
	
	public void enviarFormulario() {
		this.cadastroAppObject.getCadastrarButton().click();
			
	}

}
