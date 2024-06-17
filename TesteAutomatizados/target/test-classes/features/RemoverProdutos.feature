#language: pt
#encoding: UTF-8
@Remover
Funcionalidade: usuario remover produto do carrinho
Cenario: remover compra
Quando usuario acessar sistema e comprar 3 produtos
E usuario clicar no carrinho de compras
E usuario remover um produto
Entao o produto e removido com sucesso

