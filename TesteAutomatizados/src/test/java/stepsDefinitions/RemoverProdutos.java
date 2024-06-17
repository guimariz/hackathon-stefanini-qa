package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ComprarProdutos;

public class RemoverProdutos {



@Quando("^usuario acessar sistema e comprar (\\d+) produtos$")
public void usuarioAcessarSistemaEComprarProdutos(int arg1) throws Throwable {
	Na(ComprarProdutos.class).clicarnacompra();
}
    


@Quando("usuario remover um produto")
public void usuarioRemoverUmProduto() {
   Na(ComprarProdutos.class).clicarRemover();
}

@Entao("o produto e removido com sucesso")
public void oProdutoERemovidoComSucesso() {
	assertEquals("", driver.findElement(By.xpath("//div[@class='removed_cart_item']")).getText());
}


}
