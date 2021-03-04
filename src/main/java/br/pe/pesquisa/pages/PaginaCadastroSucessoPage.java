package br.pe.pesquisa.pages;

import org.openqa.selenium.By;

import br.pe.pesquisa.core.BasePage;

public class PaginaCadastroSucessoPage extends BasePage {
	
	public String obterMensagemSucessoCadastro(){
		return dsl.obterTexto(By.xpath("//p[contains(text(),'Your form has been successfully submitted.')]"));
	}
	
}
