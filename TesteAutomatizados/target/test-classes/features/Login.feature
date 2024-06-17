#language: pt
#encoding: UTF-8
@login
Funcionalidade: Login
@loginInvalido
Cenario: usuario invalido
Quando eu informar o usuario "ad"
E informar a senha "ad"
E clicar no botao login
Entao o sistema exibe a mensagem usuario invalido

@loginSucesso
Cenario: Realizar login
Quando eu informar o usuario "standard_user"
E informar a senha "secret_sauce"
E clicar no botao login
Entao o sistema exibe PRODUCTS