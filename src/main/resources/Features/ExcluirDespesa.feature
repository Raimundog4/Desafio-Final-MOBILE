#language: pt
#enconding: UTF-8
@ExcluirDespesa @End2End
Funcionalidade: Excluir Despesa

  Contexto: 
    Dado que o usuario esteja na tela de boas vindas
    E que tenha uma despesa adicionada
    
    Cenario: Excluir despesa com sucesso
    Quando acionar o menu Transacoes
    E acionar a despesa que deseja excluir
    E acionar a opcao Excluir
    E confirmar a exclusao
    Entao o sistema mostrara o saldo total de despesas com o valor zero