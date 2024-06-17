package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {

	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String usuario) {
		Na(LoginPage.class).informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem usuario invalido")
	public void oSistemaExibeAMensagemUsuarioInvalido() {
		assertEquals("Epic sadface: Username and password do not match any user in this service", driver.findElement(By.xpath("//h3[@data-test='error']")).getText());
	}

		@Entao("^o sistema exibe PRODUCTS$")
		public void oSistemaExibePRODUCTS() throws Throwable {
			assertEquals("PRODUCTS", driver.findElement(By.xpath("//span[@class='title']")).getText());
		}

}
