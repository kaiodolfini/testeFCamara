package br.com.kaio.core;

import static br.com.kaio.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {

	private static DSL instance;

	private DSL() {
	}

	public static DSL getInstance() {
		if (instance == null) {
			synchronized (DSL.class) {
				if (instance == null) {
					instance = new DSL();
				}
			}
		}
		return instance;
	}

	public void clicar(String locator) {
		getDriver().findElement((By.xpath(locator))).click();
	}

	public String obterTexto(String locator) {
		return getDriver().findElement((By.xpath(locator))).getText();
	}

	public boolean isSelected(String locator) {
		return getDriver().findElement((By.xpath(locator))).isSelected();
	}

	public boolean isDisplayed(String locator) {
		return getDriver().findElement((By.xpath(locator))).isDisplayed();
	}

	public String escrever(String locator, String texto) {
		getDriver().findElement((By.xpath(locator))).clear();
		getDriver().findElement((By.xpath(locator))).sendKeys(texto);
		return texto;
	}

}
