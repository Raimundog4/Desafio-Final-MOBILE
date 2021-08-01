#language: pt
#enconding: UTF-8
@ExcluirDespesa @End2End
Funcionalidade: excluir Despesa

  Contexto: 
    Dado que o usuario esteja na tela de boas vindas
    E que tenha uma despesa adicionada
    
    Cenario: excluir despesa com sucesso
    Quando acionar o menu transacoes
    E acionar a despesa que deseja excluir
    E acionar a opcao excluir
    E confirmar a exclusao
    Entao o sistema mostrara o saldo total de despesas com o valor zero