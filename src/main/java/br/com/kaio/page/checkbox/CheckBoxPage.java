package br.com.kaio.page.checkbox;

import br.com.kaio.page.Page;

public class CheckBoxPage extends Page {

	private CheckBox checkbox;
	private Botoes botoes;

	public CheckBoxPage() {
		checkbox = new CheckBox();
		botoes = new Botoes();
	}

	public void clicarCheckBox() {
		checkbox.clicarCheckBox();
	}

	public boolean checkBoxSelected(boolean b) {
		return checkbox.checkBoxSelected(b);
	}

	public String obterPaginaInicial() {
		return super.obterPaginaInicial("//h4[contains(text(),'Dynamic Controls')]");
	}

	public void clicarBotao(String botao) {
		botoes.clicarBotao(botao);
	}

	public String obterMsg() {
		return super.obterMsg("//p[@id='message']");
	}

}
