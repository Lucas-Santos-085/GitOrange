package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import pages.Page;
import suporte.BaseTest;
import static suporte.Screenshot.*;

public class TesteInclusaoFuncionario extends BaseTest {

	private Page page = new Page();
	
	@Rule
	public TestName test = new TestName();
	

	@Test
	public void adicionarFuncionarioSemSobrenome() {


		page.clicarMenuPIM();
		page.clicarAdicionarFuncionario();
		page.inserirPrimeiroNome("Git3");
		page.salvarCadastroFuncionario();

		assertEquals("Required", page.conferirMensagemErro());
		
		printScreen(getDriver(), "C:\\Users\\Lucas\\Documents\\SELENIUM\\Evidencias\\OrangeHRM\\Cadastro Funcionario\\"
				+ test.getMethodName() + ".png");

	}

	@Test
	public void adicionarFuncionarioComSucesso() {

		page.clicarMenuPIM();
		page.clicarAdicionarFuncionario();
		page.inserirPrimeiroNome("Git4");
		page.inserirUltimoNome("Teste");
		page.salvarCadastroFuncionario();

		assertEquals("Arya2 Stark", page.conferirCadastroRealizado());
		
		printScreen(getDriver(), "C:\\Users\\Lucas\\Documents\\SELENIUM\\Evidencias\\OrangeHRM\\Cadastro Funcionario\\"
				+ test.getMethodName() + ".png");
	}

}
