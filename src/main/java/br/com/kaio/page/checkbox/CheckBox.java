package br.com.kaio.page.checkbox;

import br.com.kaio.core.DSL;

public class CheckBox {

	private static final String LOCATOR_CHECKBOX = "//body/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]";

	public void clicarCheckBox() {
		DSL.getInstance().clicar(LOCATOR_CHECKBOX);
	}

	public boolean checkBoxSelected(boolean b) {
		return DSL.getInstance().isSelected(LOCATOR_CHECKBOX);
	}

}
