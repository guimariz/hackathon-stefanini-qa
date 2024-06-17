package stepsDefinitions;

import static utils.Utils.acessarAndroid;
import static utils.Utils.driver;
import static utils.Utils.gerarScreenShot;

import java.net.MalformedURLException;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void acessarAplicativo() throws MalformedURLException {
        acessarAndroid();
        
        
    }

    @After
    public void fecharApplicativo(Scenario scenario) {
        gerarScreenShot(scenario);
        driver.quit();
    }
}