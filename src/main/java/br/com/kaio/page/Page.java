package br.com.kaio.page;

import br.com.kaio.core.DSL;

public class Page {

	public String obterPaginaInicial(String locator) {
		return DSL.getInstance().obterTexto(locator);
	}

	public String obterMsg(String locator) {
		return DSL.getInstance().obterTexto(locator);
	}

}
