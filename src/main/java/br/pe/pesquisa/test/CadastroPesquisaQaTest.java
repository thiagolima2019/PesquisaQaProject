package br.pe.pesquisa.test;

import static br.pe.pesquisa.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import br.pe.pesquisa.core.BaseTeste;
import br.pe.pesquisa.pages.CadastroPesquisaQaPage;
import br.pe.pesquisa.pages.PaginaCadastroSucessoPage;
import br.pe.pesquisa.pages.PaginaInicialPage;

public class CadastroPesquisaQaTest extends BaseTeste {

	private CadastroPesquisaQaPage page;
	private PaginaInicialPage pageInicial;
	private PaginaCadastroSucessoPage pageSucesso;
	
	@Before
	public void inicializa(){
		getDriver().get("http://www.lourencodemonaco.com.br/vvtest/");
		page = new CadastroPesquisaQaPage();
		pageInicial = new PaginaInicialPage();
		pageSucesso = new PaginaCadastroSucessoPage();
	}
	
	@Test
	public void acessarCadastro(){
		pageInicial.acessarCadastroPesquisaQA();
		Assert.assertEquals("Pesquisa – QA", page.obterTituloPaginaPesquisaQa());
	}
	
	
	@Test
	public void cadastroSucessoPesquisaQa(){
		pageInicial.acessarCadastroPesquisaQA();
		page.setNomeCadastro("Thiago");
		page.setSobrenomeCadastro("Lima");
		String fake = new Faker().internet().emailAddress();
		page.setEmailCadastro(fake);
		page.setEmailConfirmadoCadastro(fake);
		page.setRadioDezoitoATrintaCadastro();
		page.setCombotempoQaCadastro("Menos de 5 anos");
		page.setComboAtracaoQaCadastro("Desafio");
		page.setRadioNegocioCadastro();
		page.setLinguagemProgramacaoInteresseCadastro("Java, JavaScript, Ruby");
		page.setEnviarFinalizacaoCadastro();
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.textToBe(By.xpath("//p[contains(text(),'Your form has been successfully submitted.')]"),
				"Your form has been successfully submitted."));
		Assert.assertEquals("Your form has been successfully submitted.", pageSucesso.obterMensagemSucessoCadastro());
	}
	
}
