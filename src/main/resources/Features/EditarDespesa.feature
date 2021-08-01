#language: pt
#enconding: UTF-8
@EditarDespesa @End2End
Funcionalidade: Editar Despesa

  Contexto: 
    Dado que o usuario esteja na tela de boas vindas
    E que tenha uma despesa adicionada

  @SmokeTest
  Cenario: Editar despesa da conta com sucesso
    Quando abrir o menu transacoes
    E acionar a despesa que deseja editar
    E acionar o botao Editar
    E aumentar o valor da despesa para "100"
    E mudar a categoria de despesa para "Transporte" e acionar o botao Salvar
    Entao o sistema apresentara os detalhes da conta com o valor e categoria alterados
