package stepdefinitions;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.DespesaPage;

public class DespesaSteps {

	DespesaPage despesaPage = new DespesaPage(driver);

	@Quando("clicar no botao adicionar")
	public void clicarNoBotaoAdicionar() throws Exception {
		despesaPage.acionarBoatoAdicionarDespesa();
	}
	
	@Dado("que tenha uma despesa adicionada")
	public void queTenhaUmaDespesaAdicionada() throws Exception {
		despesaPage.acionarBoatoAdicionarDespesa();
		despesaPage.passarTutorial();
		despesaPage.adicionarSaldoDespesa("70");
		despesaPage.escolherCategoria("Compras de mercado");
		despesaPage.acionarBotaoAdicionar();
	}


	@Quando("passar pelo tutorial")
	public void passarPeloTutorial() throws Exception {
			despesaPage.passarTutorial();
	}

	@Quando("inserir o valor {string} como despesa")
	public void inserirOValorComoDespesa(String despesa) throws Exception {
		despesaPage.adicionarSaldoDespesa(despesa);
	}

	@Quando("escolher a categoria de despesa como {string}")
	public void escolherACategoriaDeDespesaComo(String categoria) throws Exception {
		despesaPage.escolherCategoria(categoria);
	}

	@Quando("adicionar um comentario {string} e acionar o botao adicionar")
	public void adcionarUmComentarioEAcionarOBotaoAdicionar(String comentario) throws Exception {
		despesaPage.adicionarComentario(comentario);
		despesaPage.acionarBotaoAdicionar();
	}

	@Entao("o aplicativo deve apresentar a nova")
	public void oAplicativoDeveApresentarANova() {
		despesaPage.validarAdicaoDespesa();
	}

}