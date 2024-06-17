#language: pt
#encondig: utf-8

Funcionalidade: Notes mobile

  Eu como usuário gostaria de criar notas em um app para eu possa me organizar melhor no meu dia e também fazer todas
  as interações tradicionais que um app faz.

  @adicionarNotesSimples
  Cenario: criar nota simples
    Dado que o usuario acione botaoadd
    E clicar em adicionar texto
    E informar na nota "testando"
    E acionar o botao check
    E acionar botao voltar
    Entao o sistema mostra note criado "testando"
    
	@adicionarListaEMudarCor
  Cenario: criar lista com tres itens
    Dado que o usuario acione botaoadd
    E clicar em adicionar lista
    E clicar no botao adicionar item
    E informar o nome do item "xpo"
    E clicar no botao ok
    Dado clicar no botao adicionar item
		E informar o nome do item "xyz"
    E clicar no botao ok
    Dado clicar no botao adicionar item
		E informar o nome do item "qwe"
    E clicar no botao ok
    E acionar o botao check
    E acionar botao voltar
    Quando clicar na lista criada
    E clicar no editar
    E mudar o cor
    E acionar o botao check
    E acionar botao voltar
    Entao o sistema mostra lista criada
    
  @checkLista
  Cenario: check lista
  Dado que o usuario acione botaoadd
    E clicar em adicionar lista
    E clicar no botao adicionar item
    E informar o nome do item "xpo"
    E clicar no botao ok
    Dado clicar no botao adicionar item
		E informar o nome do item "xyz"
    E clicar no botao ok
    Dado clicar no botao adicionar item
		E informar o nome do item "qwe"
    E clicar no botao ok
    E acionar o botao check
    E acionar botao voltar
    Dado o clica na lista
    E o usuario clica no primeiro item
    E clica no segundo item
    E clica no terceiro item
    Entao o sistema apresentar os itens checkados
    
    
    @AtivandoLembreteLista
    Cenario: Usuario deseja criar uma lista e adicionar um lembrete para as mesmas.
    Dado que o usuario acione botaoadd
    E clicar em adicionar lista
    E clicar no botao adicionar item
    E informar o nome do item "xpo"
    E clicar no botao ok
    Dado clicar no botao adicionar item
		E informar o nome do item "xyz"
    E clicar no botao ok
    Dado clicar no botao adicionar item
		E informar o nome do item "qwe"
    E clicar no botao ok
    E acionar o botao check
    E acionar botao voltar
    Dado o clica na lista
    E clica nos tres pontinho no lado direito superior
    E clica em Lembrete
    E clica em tipo alarme com hora
    E clica na opção alarme com hora
    E clica em pronto
    Entao o lembrete é ativado
    
    @ApagarNotaEExcluirDaLixeira
    Cenario: usuario cria a nota em seguida apaga e deleta na lixera
    Dado que o usuario acione botaoadd
    E clicar em adicionar texto
    E informar na nota "testando"
    E acionar o botao check
    E acionar botao voltar
    E usuario segura o botao em qual a nota foi criada
    E aperta em botao remover
    E seleciona ok
    Quando clicar no submenu na esquerda parte inferior
    E clicar em lixeira
    E ao quanto superior clicar no botao remover
    E selecionar ok
    Entao a nota sera removidade com sucesso
    
    