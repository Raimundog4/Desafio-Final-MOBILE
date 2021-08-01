#language: pt
#enconding: UTF-8
@Renda @End2End
Funcionalidade: Renda

  Contexto: 
    Dado que o usuario esteja na tela de boas vindas

  @AdicionarRenda @SmokeTest
  Cenario: Adicionar Renda
    Quando clicar no menu renda
    E clicar no botao adicionar
    E passar pelo tutorial
    E inserir o valor "100" como renda
    E escolher a categoria de renda como Salario
    E adicionar um comentario "Renda" e acionar o botao adicionar
    Entao o aplicativo devera apresentar a nova renda
