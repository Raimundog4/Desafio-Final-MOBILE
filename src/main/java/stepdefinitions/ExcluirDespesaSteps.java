package stepdefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.ExcluirDespesaPage;

public class ExcluirDespesaSteps {

	ExcluirDespesaPage edp = new ExcluirDespesaPage(driver);
	
	@Quando("acionar o menu transacoes")
	public void acionarOMenuTransacoes() {
		edp.acionarMenuTransacoes();
	}

	@Quando("acionar a despesa que deseja excluir")
	public void acionarADespesaQueDesejaExcluir() {
		edp.selecionarDespesa();
	}

	@Quando("acionar a opcao excluir")
	public void acionarAOpcaoExcluir() {
		edp.acionarBotarExcluir();
	}

	@Quando("confirmar a exclusao")
	public void confirmarAExclusao() {
		edp.escolherOpcaoSim();
	}

	@Entao("o sistema mostrara o saldo total de despesas com o valor zero")
	public void oSistemaMostraraOSaldoTotalDeDespesasComOValorZero() {
		edp.validarExclusao();
	}


	
}
