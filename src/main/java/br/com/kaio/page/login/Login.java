package br.com.kaio.page.login;

import br.com.kaio.core.DSL;

public class Login {

	public void escreverLogin(String credencial, String arg1) {
		DSL.getInstance().escrever("//input[@id='" + credencial + "']", arg1);
	}

	public void clicarLogin() {
		DSL.getInstance().clicar("//i[contains(text(),'Login')]");
	}

}
