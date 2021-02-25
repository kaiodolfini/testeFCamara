package br.com.kaio.runners;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.com.kaio.core.URLs;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import static br.com.kaio.core.DriverFactory.getDriver;
import static  br.com.kaio.core.DriverFactory.killDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/TesteLogin.feature",
		glue = {"br.com.kaio.steps"},
		tags = {"@funcionais", "not @ignore"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false)

public class RunnerLogin {

	@BeforeClass
	public static void inicializa() {

		getDriver().get(URLs.LOGIN_URL);	
		
	}

	@AfterClass
	public static void finalizaTudo() {
		killDriver();
	}

}

