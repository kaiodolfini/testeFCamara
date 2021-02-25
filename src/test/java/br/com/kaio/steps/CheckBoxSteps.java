package br.com.kaio.steps;

import static br.com.kaio.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.kaio.page.checkbox.CheckBoxPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CheckBoxSteps {

	private CheckBoxPage checkboxPage;
	private WebDriverWait wait;

	public CheckBoxSteps() {
		checkboxPage = new CheckBoxPage();
		wait = new WebDriverWait(getDriver(), 30);
	}

	@Dado("que estou acessando a aplicacao")
	public void queEstouAcessandoAAplicaO() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkbox-example")));
		Assert.assertEquals("Dynamic Controls", checkboxPage.obterPaginaInicial());
	}

	@Quando("clicar no checkbox")
	public void clicarNoCheckbox() {
		checkboxPage.clicarCheckBox();
	}

	@Entao("o checkbox estara selecionado")
	public void oCheckboxEstaraSelecionado() {
		Assert.assertTrue(checkboxPage.checkBoxSelected(true));
	}

	@Entao("o checkbox estara deselecionado")
	public void oCheckboxEstaraDeselecionado() throws InterruptedException {
		Assert.assertFalse(checkboxPage.checkBoxSelected(false));
	}

	@Quando("clicar em Remover")
	public void clicarEmRemover() {
		checkboxPage.clicarBotao("Remove");
	}

	@Entao("o checkbox sera removido")
	public void oCheckboxSeraRemovido() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='message']")));
		Assert.assertEquals("It's gone!", checkboxPage.obterMsg());
	}

	@Quando("clicar em Add")
	public void clicarEmAdd() {
		checkboxPage.clicarBotao("Add");
	}

	@Entao("o checkbox sera adicionado")
	public void oCheckboxSeraAdicionado() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='message']")));
		Assert.assertEquals("It's back!", checkboxPage.obterMsg());
	}

}
