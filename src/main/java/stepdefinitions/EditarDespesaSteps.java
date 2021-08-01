package stepdefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.EditarDespesaPage;

public class EditarDespesaSteps {
	
	EditarDespesaPage edp = new EditarDespesaPage(driver);

	@Quando("abrir o menu transacoes")
	public void abrirOMenuTransacoes() {
		edp.acionarMenuTransacoes();
	}

	@Quando("selecionar a despesa")
	public void selecionarADespesa() {
		edp.selecionarDespesa();
	}

	@Quando("acionar o botao Editar")
	public void acionarOBotaoEditar() {
		edp.acionarBotarEditar();
	}

	@Quando("aumentar o valor da despesa para {string}")
	public void aumentarOValorDaDespesaPara(String despesa) throws Exception {
		edp.editarValor(despesa);
	}

	@Quando("mudar a categoria de despesa para {string} e acionar o botao Salvar")
	public void mudarACategoriaDeDespesaParaEAcionarOBotaoSalvar(String categoria) throws Exception {
		edp.selecionarCategoria(categoria);
		edp.acionarBotaoSalvar();
	}

	@Entao("o sistema apresentara os detalhes da conta com o valor e categoria alterados")
	public void oSistemaApresentaraOsDetalhesDaContaComOValorECategoriaAlterados() {
		edp.validarEdicaoDespesa();
	}
	
}
