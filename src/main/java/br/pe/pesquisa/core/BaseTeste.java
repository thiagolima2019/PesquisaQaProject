package br.pe.pesquisa.core;

import static br.pe.pesquisa.core.DriverFactory.killDriver;

import org.junit.After;

public class BaseTeste {

	@After
	public void finaliza(){
		killDriver();
	}
	
}
