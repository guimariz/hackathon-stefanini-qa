#language: pt
#encoding: UTF-8
@CancelarCompra
Funcionalidade: usuario cancela a compra
Cenario: usuario vai ate o passo final e cancela a compra 
Dado Usuario acessar a aba e selecionar barra menor para maior
Dado usuario clica na compra de três itens
Dado usuario clica no carrinho de compras
Dado usuario clicar no botao checkout
E usuario preencher First Name "Lucas"
E usuario preencher LastName "Cassiano"
E usuario preencher ZipCode "72225211"
Quando usuario clicar no botao continue
E usuario clica no botao cancelar
Entao a compra é cancelada
