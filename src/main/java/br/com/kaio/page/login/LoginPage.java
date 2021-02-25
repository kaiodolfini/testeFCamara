package br.com.kaio.page.login;

import br.com.kaio.page.Page;

public class LoginPage extends Page {

	private Login login;

	public LoginPage() {
		login = new Login();
	}

	public String obterPaginaInicial() {
		return super.obterPaginaInicial("//h2[contains(text(),'Login Page')]");
	}

	public void escreverLogin(String credencial, String arg1) {
		login.escreverLogin(credencial, arg1);
	}

	public void clicarLogin() {
		login.clicarLogin();
	}

	public String obterMsg() {
		return super.obterMsg("//div[@id='flash']");
	}

}
