package stepdefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.DespesaPage;

public class DespesaSteps {

	DespesaPage dp = new DespesaPage(driver);

	@Quando("clicar no botao adicionar")
	public void clicarNoBotaoAdicionar() throws Exception {
		dp.acionarBoatoAdicionarDespesa();
	}

	@Quando("passar pelo tutorial")
	public void passarPeloTutorial() throws Exception {
		for (int i = 1; i <= 9; i++) {
			dp.passarTutorial();
		}
	}

	@Quando("inserir o valor {string} como despesa")
	public void inserirOValorComoDespesa(String despesa) throws Exception {
		dp.adicionarSaldoDespesa(despesa);
	}

	@Quando("escolher a categoria de despesa como {string}")
	public void escolherACategoriaDeDespesaComo(String categoria) throws Exception {
		dp.escolherCategoria(categoria);
	}

	@Quando("adcionar um comentario e acionar o botao adicionar")
	public void adcionarUmComentarioEAcionarOBotaoAdicionar() throws Exception {
		dp.adicionarComentario("GBarbosa");
		dp.acionarBotaoAdicionar();
	}

	@Entao("o aplicativo deve apresentar a nova")
	public void oAplicativoDeveApresentarANova() {
//		dp.validarAdicaoDespesa("Compras de mercado");
		dp.validacaoDespesa();
	}

}