package br.pe.pesquisa.test;

import static br.pe.pesquisa.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import com.github.javafaker.Faker;

import br.pe.pesquisa.core.BaseTeste;
import br.pe.pesquisa.page.CadastroPesquisaQaPage;

public class CadastroPesquisaQaTest extends BaseTeste {

	private CadastroPesquisaQaPage page;
	
	@Before
	public void inicializa(){
		getDriver().get("http://www.lourencodemonaco.com.br/vvtest/");
		page = new CadastroPesquisaQaPage();
	}
	
	@Test
	public void acessarCadastro(){
		page.acessarCadastroPesquisaQA();
	}
	
	
	@Test
	public void cadastroSucessoPesquisaQa(){
		page.acessarCadastroPesquisaQA();
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
	}
	
}
