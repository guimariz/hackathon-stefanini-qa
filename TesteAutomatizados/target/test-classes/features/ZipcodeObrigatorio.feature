#language: pt
#encoding: UTF-8
@Zip
Funcionalidade: Usuario loga em aplicativo e faz compras
Cenario: usuario finiliza a compra
Quando Usuario acessar a aba e selecionar barra menor para maior
E usuario clicar na compra de três itens
E usuario clicar no carrinho de compras
Quando usuario clicar no botao checkout
E usuario preencher First Name ""
E usuario preencher LastName "Cassiano"
E usuario preencher ZipCode "72225211"
Quando usuario clicar no botao continue
Entao ocorre erro por nao preencher o first name

 
Cenario: usuario finiliza a compra
Quando Usuario acessar a aba e selecionar barra menor para maior
E usuario clicar na compra de três itens
E usuario clicar no carrinho de compras
Quando usuario clicar no botao checkout
E usuario preencher First Name "lucas"
E usuario preencher LastName ""
E usuario preencher ZipCode "5734462234"
Quando usuario clicar no botao continue
Entao ocorre erro por nao preencher o LastName

 
Cenario: usuario finiliza a compra
Quando Usuario acessar a aba e selecionar barra menor para maior
E usuario clicar na compra de três itens
E usuario clicar no carrinho de compras
Quando usuario clicar no botao checkout
E usuario preencher First Name "Lucas"
E usuario preencher LastName "cassiano"
E usuario preencher ZipCode ""
Quando usuario clicar no botao continue
Entao ocorre erro pro não preencher o zipcode

