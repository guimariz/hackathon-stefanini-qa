package stepsDefinitions;

import static utils.Utils.Na;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ComprarProdutos;

public class ComprarProdutosSteps {

	@Quando("^Usuario acessar a aba e selecionar barra menor para maior$")
	public void usuarioAcessarAAbaESelecionarBarraMenorParaMaior() throws Throwable {
		Na(ComprarProdutos.class).acionarBotaoAbaMenorMaior();
	}
@Quando("usuario clicar na compra de três itens")
public void usuarioClicarNaCompraDeTrêsItens() {
	Na(ComprarProdutos.class).clicarnacompra();
}

@E("^usuario clicar no carrinho de compras$")
public void usuarioClicarNoCarrinhoDeCompras() throws Throwable {
	Na(ComprarProdutos.class).clicarCarrinho();
}

@Quando("usuario clicar no botao checkout")
public void usuarioClicarNoBotaoCheckout() {
	Na(ComprarProdutos.class).clicarCheckout();
}

@Quando("usuario preencher First Name {string}")
public void usuarioPreencherFirstName(String string) {
	Na(ComprarProdutos.class).escreverFirstName(string);
}

@Quando("usuario preencher LastName {string}")
public void usuarioPreencherLastName(String string) {
	Na(ComprarProdutos.class).escreverLastName(string);
}

@Quando("usuario preencher ZipCode {string}")
public void usuarioPreencherZipCode(String string) {
	Na(ComprarProdutos.class).escreverZipCode(string);
}

@Quando("usuario clicar no botao continue")
public void usuarioClicarNoBotaoContinue() {
	Na(ComprarProdutos.class).clicarContinue();
}

@Quando("usuario clicar no botao Finish")
public void usuarioClicarNoBotaoFinish() {
	Na(ComprarProdutos.class).clicarFinish();
}
@Entao("^o sistema aprensenta a tela THANK YOU FOR YOUR ORDER$")
public void oSistemaAprensentaATelaTHANKYOUFORYOURORDER() throws Throwable {
	Na(ComprarProdutos.class).menssagemFinal();


}



}










