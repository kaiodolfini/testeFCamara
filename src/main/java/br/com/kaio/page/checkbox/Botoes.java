package br.com.kaio.page.checkbox;

import br.com.kaio.core.DSL;

public class Botoes {

	public void clicarBotao(String botao) {
		DSL.getInstance().clicar("//button[contains(text(),'" + botao + "')]");
	}

}
