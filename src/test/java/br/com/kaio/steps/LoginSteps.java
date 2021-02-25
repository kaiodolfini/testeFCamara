package br.com.kaio.steps;

import static br.com.kaio.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.kaio.page.login.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

	private LoginPage loginPage;
	private WebDriverWait wait;

	public LoginSteps() {
		loginPage = new LoginPage();
		wait = new WebDriverWait(getDriver(), 30);
	}

	@Dado("que estou acessando a aplicacao Login")
	public void queEstouAcessandoAAplicaO() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='username']")));
		Assert.assertEquals("Login Page", loginPage.obterPaginaInicial());
	}

	@Quando("informar o login {string}")
	public void informarOLogin(String user) {
		loginPage.escreverLogin("username", user);
	}

	@Quando("informar a senha {string}")
	public void informoASenha(String pass) throws Throwable {
		loginPage.escreverLogin("password", pass);
	}

	@Quando("clicar em Login")
	public void clicarNoLogin() {
		loginPage.clicarLogin();
	}

	@Entao("recebo a mensagem {string}")
	public void receboAMensagem(String arg1) throws Throwable {
		Assert.assertTrue(loginPage.obterMsg().contains(arg1));
	}

}
