package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(//plugin = {"html:target/cucumber-report"},
        features = "src/test/resources/features/",
        glue = "stepsDefinitions",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "  @ApagarNotaEExcluirDaLixeira",
        monochrome = true,
        plugin = {"pretty"} //tem tambem o "usage". plugins para gerar relatorios
)
public class RunnerTest {
}


