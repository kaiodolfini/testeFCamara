package br.com.kaio.core;

import static br.com.kaio.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		findElement(locator).click();
	}

	public String obterTexto(String locator) {
		return findElement(locator).getText();
	}

	public boolean isSelected(String locator) {
		return findElement(locator).isSelected();
	}

	public boolean isDisplayed(String locator) {
		return findElement(locator).isDisplayed();
	}

	public String escrever(String locator, String texto) {
		findElement(locator).clear();
		findElement(locator).sendKeys(texto);
		return texto;
	}
	
	
	private WebElement findElement(String locator) {
		return getDriver().findElement((By.xpath(locator)));
	}

}
