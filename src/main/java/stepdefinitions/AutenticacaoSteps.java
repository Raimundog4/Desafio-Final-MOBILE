package stepdefinitions;

import static utils.Utils.driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.AutenticacaoPage;

public class AutenticacaoSteps {

	AutenticacaoPage aut = new AutenticacaoPage(driver);

	@Dado("que o usuario esteja na pagina de autenticacao")
	public void queOUsuarioEstejaNaPaginaDeAutenticacao() throws Exception {
		aut.validarTelaDeAutenticacao();
	}
	
	@Dado("que o usuario esteja na tela de boas vindas")
	public void queOUsuarioEstejaNaTelaDeBoasVindas() throws Exception {
		aut.acionarBotaoContinuarSemCriarConta();
		aut.acionarBotaoComecar();
		aut.interagindoComCampoDeBusca("br");
		aut.acionarBotaoProximo();
		aut.adicionandoSaldoPrincipal("200");
		aut.acionarBotaoProximo();
		aut.validarTelasBoasVindas();
		
	}

	@Quando("clicar no botao Continuar sem criar uma conta")
	public void clicarNoBotaoContinuarSemCriarUmaConta() throws Exception {
		aut.acionarBotaoContinuarSemCriarConta();
	}

	@Quando("clicar no botao Comecar")
	public void clicarNoBotaoComecar() throws Exception {
		aut.acionarBotaoComecar();
	}

	@Quando("escolher a moeda {string} e clicar em proximo")
	public void escolherAMoedaEClicarEmProximo(String moeda) throws Exception {
		aut.interagindoComCampoDeBusca(moeda);
		aut.acionarBotaoProximo();
	}

	@Quando("inserir o saldo no valor de {string} e clicar em proximo")
	public void inserirOSaldoEClicarEmProximo(String valor) throws Exception {
		aut.adicionandoSaldoPrincipal(valor);
		aut.acionarBotaoProximo();
	}

	@Entao("o sistema devera exibir tela de boas vindas")
	public void oSistemaDeveraExibirTelaDeBoasVindas() throws Exception {
		aut.validarTelasBoasVindas();
	}

}