package appobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
		private WebDriver driver;
		
		public CadastroAppObject(WebDriver driver) {
			this.driver = driver;
}
	
		//MAPEANDO
		
		
		public WebElement getCNPJTextField() {     
			
			return this.driver.findElement(By.id("cnpjJ"));		
		}
		
		public WebElement getCodigoAcessoTextField() {
			
			return this.driver.findElement(By.id("senha"));
		}
		
		public WebElement getCaptcha() {
			
			String valor = this.driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[2]/div[6]/div[1]/p/strong")).getText();	
		
			if(valor.equals("Clips")==true) return this.driver.findElement(By.id("vc-clip"));
			else if(valor.equals("Carro")==true) return this.driver.findElement(By.id("vc-car"));
			else if(valor.equals("Avião")==true) return this.driver.findElement(By.id("vc-airplane"));
			else if(valor.equals("Arvore")==true) return this.driver.findElement(By.id("vc-tree"));
			else if(valor.equals("Relógio")==true) return this.driver.findElement(By.id("vc-clock"));
			else if(valor.equals("Grafico")==true) return this.driver.findElement(By.id("vc-graph"));
			else if(valor.equals("Cadeira")==true) return this.driver.findElement(By.id("vc-chair"));
			else if(valor.equals("Pegada")==true) return this.driver.findElement(By.id("vc-foot"));
			else if(valor.equals("Gato")==true) return this.driver.findElement(By.id("vc-cat"));
			else if(valor.equals("Lupa")==true) return this.driver.findElement(By.id("vc-magnifyng-glass"));
			else if(valor.equals("Tesoura")==true) return this.driver.findElement(By.id("vc-scissors"));
			else if(valor.equals("Mulher")==true) return this.driver.findElement(By.id("vc-woman"));
			else if(valor.equals("Caminhão")==true) return this.driver.findElement(By.id("vc-truck"));
			else if(valor.equals("Casa")==true) return this.driver.findElement(By.id("vc-house"));
			else if(valor.equals("Computador")==true) return this.driver.findElement(By.id("vc-computer"));
			else if(valor.equals("Lampada")==true) return this.driver.findElement(By.id("vc-lightbulb"));
			else if(valor.equals("Camera")==true) return this.driver.findElement(By.id("vc-camera"));
			else if(valor.equals("Guarda-Chuva")==true) return this.driver.findElement(By.id("vc-umbrella"));
			else if(valor.equals("Bandeira")==true) return this.driver.findElement(By.id("vc-flag"));
			else if(valor.equals("Lapis")==true) return this.driver.findElement(By.id("vc-pencil"));
			else if(valor.equals("Cadeado")==true) return this.driver.findElement(By.id("vc-lock"));
			else if(valor.equals("Balões")==true)return this.driver.findElement(By.id("vc-baloons"));
			else if(valor.equals("Chave")==true) return this.driver.findElement(By.id("vc-key"));
			else if(valor.equals("Nuvem")==true) return this.driver.findElement(By.id("vc-cloud"));
			else if(valor.equals("Envelope")==true) return this.driver.findElement(By.id("vc-envelope"));
			else return this.driver.findElement(By.id("vc-robot"));
				
		
		}
		
		public WebElement getCadastrarButton() {
			
			return this.driver.findElement(By.xpath("//*[@id=\"formLogin\"]/div[2]/div[8]/a/span"));
		
		}
		
}
