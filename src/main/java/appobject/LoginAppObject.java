package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginAppObject {
	private WebDriver driver;
	
	public LoginAppObject(WebDriver driver) {
		
		this.driver = driver;
}

	//MAPEANDO
	
	public WebElement getCNPJTextField(){             
		return this.driver.findElement(By.id("cnpjJ"));		
	}
	

	public WebElement getCodigoDeAcessoTextField() {
		return this.driver.findElement(By.id("senha"));		
	}
	
	public WebElement getCaixaDeSegurançaTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"vc-tree\"]"));
	}
	
	
	
	public WebElement getAcessarButton() {
		//return this.driver.findElement(By.className("btn btn-success")); 
		
		//USAR O CODIGO DE CIMA OU ENTÃO USAR O XPATH, IGUAL EXEMPLO A BAIXO
		
		return this.driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[2]/div[8]/a"));
	
	}
}
