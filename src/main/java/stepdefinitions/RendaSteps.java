package stepdefinitions;

import static utils.Utils.driver;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.RendaPage;

public class RendaSteps {

	RendaPage rp = new RendaPage(driver);

	@Quando("clicar no menu renda")
	public void clicarNoMenuRenda() throws Exception {
		rp.acionarMenuRenda();
	}

	@Quando("inserir o valor {string} como renda")
	public void inserirOValorComoRenda(String renda) throws Exception {
		rp.adicionarSaldoRenda(renda);
	}

	@Quando("escolher a categoria de renda como Salario")
	public void escolherACategoriaDeRendaComoSalario() throws Exception {
		rp.selecionarCategoria("Salário");
	}

	@Entao("o aplicativo devera apresentar a nova renda")
	public void oAplicativoDeveraApresentarANovaRenda() throws Exception {
		rp.validacaoRenda();
	}

}
