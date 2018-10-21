package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import suporte.BaseTest;

public class Page extends BaseTest {
	

	/*************Incluir Funcionários******************/
	
	
	public void clicarMenu() {
		getDriver().findElement(By.linkText("PIM")).click();
	}
	
	public void PrimeiroNome(String primeiroNome) {
		getDriver().findElement(By.id("firstName")).sendKeys(primeiroNome);
		
	}
	public Page clicarMenuPIM() {
		getDriver().findElement(By.linkText("PIM")).click();
		return this;
	}

	
	public Page clicarAdicionarFuncionario() {
		getDriver().findElement(By.id("btnAdd")).click();
		return this;
	}
		
	public Page inserirPrimeiroNome(String primeiroNome) {
		getDriver().findElement(By.id("firstName")).sendKeys(primeiroNome);
		return this;
	}
	
	public Page inserirUltimoNome(String ultimoNome) {
		getDriver().findElement(By.id("lastName")).sendKeys(ultimoNome);
		return this;
	}
	
	public Page salvarCadastroFuncionario() {
		getDriver().findElement(By.id("btnSave")).click();
		return this;
	}
	
	public String conferirCadastroRealizado() {
		WebElement nomeCompleto = getDriver().findElement(By.xpath("//div[@id='profile-pic']//h1"));
		return nomeCompleto.getText();
		
	}
	
	public String conferirMensagemErro() {
		WebElement mensagemErro = getDriver().findElement(By.xpath("//span[@class='validation-error']"));
		return mensagemErro.getText();
	}
	
}
