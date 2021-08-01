#language: pt
#enconding: UTF-8
@Despesa @End2End
Funcionalidade: Despesa

  Contexto: 
    Dado que o usuario esteja na tela de boas vindas

  @AdicionarDespesa @SmokeTeste
  Cenario: Adicionar despesa
    Quando clicar no botao adicionar
    E passar pelo tutorial
    E inserir o valor "70" como despesa
    E escolher a categoria de despesa como "Compras de mercado"
    E adcionar um comentario e acionar o botao adicionar
    Entao o aplicativo deve apresentar a nova
