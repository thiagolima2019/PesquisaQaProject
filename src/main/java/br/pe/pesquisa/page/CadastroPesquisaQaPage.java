package br.pe.pesquisa.page;

import br.pe.pesquisa.core.BasePage;

public class CadastroPesquisaQaPage extends BasePage{

	
	public void acessarCadastroPesquisaQA(){
		dsl.clicarBotao("menu-item-226");
	}
	
	public void setNomeCadastro(String nome){
		dsl.escrever("nf-field-5", nome);
	}
	
	public void setSobrenomeCadastro(String sobrenome){
		dsl.escrever("nf-field-6", sobrenome);
	}
	
	public void setEmailCadastro(String email){
		dsl.escrever("nf-field-7", email);
	}
	
	public void setEmailConfirmadoCadastro(String email){
		dsl.escrever("nf-field-8", email);
	}
	
	public void setRadioDezoitoATrintaCadastro(){
		dsl.clicarRadio("nf-label-class-field-10-0");
	}
	
	public void setRadioTrintaAQuarentaCadastro(){
		dsl.clicarRadio("nf-label-class-field-10-1");
	}
	
	public void setRadioQuarentaEmDianteCadastro(){
		dsl.clicarRadio("nf-label-class-field-10-2");
	}
	
	public void setCombotempoQaCadastro(String texto){
		dsl.selecionarCombo("nf-field-11", texto);
	}
	
	public void setComboAtracaoQaCadastro(String texto){
		dsl.selecionarCombo("nf-field-12", texto);
	}

	
	public void setRadioTecnicoCadastro(){
		dsl.clicarRadio("nf-label-class-field-13-0");
	}
	
	public void setRadioNegocioCadastro(){
		dsl.clicarRadio("nf-label-class-field-13-1");
	}
	
	public void setRadioComunicacaoCadastro(){
		dsl.clicarRadio("nf-label-class-field-13-2");
	}
	
	public void setRadioLiderancaCadastro(){
		dsl.clicarRadio("nf-label-class-field-13-3");
	}
	
	public void setRadioTodasAsAterioresCadastro(){
		dsl.clicarRadio("nf-label-class-field-13-4");
	}
	
	public void setLinguagemProgramacaoInteresseCadastro(String texto){
		dsl.escrever("nf-field-14", texto);
	}
	
	public void setEnviarFinalizacaoCadastro(){
		dsl.clicarBotao("nf-field-16");
	}

}
