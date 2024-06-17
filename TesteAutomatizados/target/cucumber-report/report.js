$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BarraMaiorPreçoEMenorPreço.feature");
formatter.feature({
  "name": "Usuaria clica na barra de preço e filtra ela",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@BarraPreçoMenor"
    }
  ]
});
formatter.scenario({
  "name": "usuario interage com a barra de filtro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@BarraPreçoMenor"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario acessar a aba e selecionar barra menor para maior",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioAcessarAAbaESelecionarBarraMenorParaMaior()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "é confirmado que ele teve acesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "FiltroMenorMaior.validarOrdenacao()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/CancelarCompra.feature");
formatter.feature({
  "name": "usuario cancela a compra",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@CancelarCompra"
    }
  ]
});
formatter.scenario({
  "name": "usuario vai ate o passo final e cancela a compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@CancelarCompra"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario acessar a aba e selecionar barra menor para maior",
  "keyword": "Dado "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioAcessarAAbaESelecionarBarraMenorParaMaior()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clica na compra de três itens",
  "keyword": "Dado "
});
formatter.match({
  "location": "CancelarCompraSteps.usuarioClicaNaCompraDeTrêsItens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clica no carrinho de compras",
  "keyword": "Dado "
});
formatter.match({
  "location": "CancelarCompraSteps.usuarioClicaNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao checkout",
  "keyword": "Dado "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher First Name \"Lucas\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher LastName \"Cassiano\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher ZipCode \"72225211\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao continue",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clica no botao cancelar",
  "keyword": "E "
});
formatter.match({
  "location": "CancelarCompraSteps.usuarioClicaNoBotaoCancelar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a compra é cancelada",
  "keyword": "Entao "
});
formatter.match({
  "location": "CancelarCompraSteps.aCompraÉCancelada()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ComprarProdutos.feature");
formatter.feature({
  "name": "Usuario loga em aplicativo e faz compras",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@ComprarProdutos"
    }
  ]
});
formatter.scenario({
  "name": "usuario finiliza a compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ComprarProdutos"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario acessar a aba e selecionar barra menor para maior",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioAcessarAAbaESelecionarBarraMenorParaMaior()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar na compra de três itens",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNaCompraDeTrêsItens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao checkout",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher First Name \"Lucas\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher LastName \"Cassiano\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher ZipCode \"72225211\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao continue",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao Finish",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoFinish()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema aprensenta a tela THANK YOU FOR YOUR ORDER",
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprarProdutosSteps.oSistemaAprensentaATelaTHANKYOUFORYOURORDER()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "usuario invalido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginInvalido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"ad\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.euInformarOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"ad\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem usuario invalido",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeAMensagemUsuarioInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@loginSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"standard_user\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.euInformarOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"secret_sauce\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe PRODUCTS",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibePRODUCTS()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/RemoverProdutos.feature");
formatter.feature({
  "name": "usuario remover produto do carrinho",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Remover"
    }
  ]
});
formatter.scenario({
  "name": "remover compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Remover"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "usuario acessar sistema e comprar 3 produtos",
  "keyword": "Quando "
});
formatter.match({
  "location": "RemoverProdutos.usuarioAcessarSistemaEComprarProdutos(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario remover um produto",
  "keyword": "E "
});
formatter.match({
  "location": "RemoverProdutos.usuarioRemoverUmProduto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o produto e removido com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "RemoverProdutos.oProdutoERemovidoComSucesso()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/ZipcodeObrigatorio.feature");
formatter.feature({
  "name": "Usuario loga em aplicativo e faz compras",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Zip"
    }
  ]
});
formatter.scenario({
  "name": "usuario finiliza a compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Zip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario acessar a aba e selecionar barra menor para maior",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioAcessarAAbaESelecionarBarraMenorParaMaior()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar na compra de três itens",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNaCompraDeTrêsItens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao checkout",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher First Name \"\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher LastName \"Cassiano\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher ZipCode \"72225211\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao continue",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ocorre erro por nao preencher o first name",
  "keyword": "Entao "
});
formatter.match({
  "location": "ZipcodeSteps.ocorreErroPorNaoPreencherOFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "usuario finiliza a compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Zip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario acessar a aba e selecionar barra menor para maior",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioAcessarAAbaESelecionarBarraMenorParaMaior()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar na compra de três itens",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNaCompraDeTrêsItens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao checkout",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher First Name \"lucas\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher LastName \"\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher ZipCode \"5734462234\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao continue",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ocorre erro por nao preencher o LastName",
  "keyword": "Entao "
});
formatter.match({
  "location": "ZipcodeSteps.ocorreErroPorNaoPreencherOLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "usuario finiliza a compra",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Zip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Usuario acessar a aba e selecionar barra menor para maior",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioAcessarAAbaESelecionarBarraMenorParaMaior()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar na compra de três itens",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNaCompraDeTrêsItens()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no carrinho de compras",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoCarrinhoDeCompras()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao checkout",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoCheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher First Name \"Lucas\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher LastName \"cassiano\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario preencher ZipCode \"\"",
  "keyword": "E "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioPreencherZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "usuario clicar no botao continue",
  "keyword": "Quando "
});
formatter.match({
  "location": "ComprarProdutosSteps.usuarioClicarNoBotaoContinue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ocorre erro pro não preencher o zipcode",
  "keyword": "Entao "
});
formatter.match({
  "location": "ZipcodeSteps.ocorreErroProNãoPreencherOZipcode()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});