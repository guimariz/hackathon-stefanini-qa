package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report"},
		features = "src/test/resources/features",
		tags = "",
		glue = "stepsDefinitions",
		//snippets serve para encurtar o metodo sem colocar undercore ou underline
		snippets = SnippetType.CAMELCASE,
		// monochrome deixa o console branco
		monochrome = true,
		dryRun = false
		)
public class RunnerTest {

}
