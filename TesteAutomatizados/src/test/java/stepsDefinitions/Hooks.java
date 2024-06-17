package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {
@Before(value = "@login")
public void login() {
	acessarSistema();
}
@Before(value = "not @login")
public void setUp() {
	acessarSistema();
	Na(LoginPage.class).realizarLogin("standard_user", "secret_sauce");
}

@After
public void tearDown() {
        driver.quit();
    }
	

}
