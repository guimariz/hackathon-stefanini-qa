#language: pt
#encoding: UTF-8
@ComprarProdutos
Funcionalidade: Usuario loga em aplicativo e faz compras
Cenario: usuario finiliza a compra
Quando Usuario acessar a aba e selecionar barra menor para maior
E usuario clicar na compra de três itens
E usuario clicar no carrinho de compras
Quando usuario clicar no botao checkout
E usuario preencher First Name "Lucas"
E usuario preencher LastName "Cassiano"
E usuario preencher ZipCode "72225211"
Quando usuario clicar no botao continue
E usuario clicar no botao Finish
Entao o sistema aprensenta a tela THANK YOU FOR YOUR ORDER