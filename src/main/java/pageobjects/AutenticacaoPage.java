package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.esperarAlgunsSegundos;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AutenticacaoPage {

	public AutenticacaoPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "Continuar sem criar uma conta")
	private MobileElement botaoContinuarSemCriarConta;

	@AndroidFindBy(accessibility = "Começar")
	private MobileElement botaoComecar;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Buscar']")
	private MobileElement botaoBuscar;

	@AndroidFindBy(className = "android.widget.EditText")
	private MobileElement inserirSaldoEmContaPrincipal;

	@AndroidFindBy(accessibility = "Próximo")
	private MobileElement botaoProximo;

	@AndroidFindBy(accessibility = "Começar")
	private MobileElement botaoDeComecar;
	
	@AndroidFindBy(xpath = "//android.view.View[@index='0']")
	private MobileElement telaBoasVindas;
	
	@AndroidFindBy(accessibility =  "Inscreva-se para salvar suas informações")
	private MobileElement telaAutenticacao;

	public boolean validarTelaDeAutenticacao() throws Exception {
		if (telaAutenticacao.isDisplayed()) {
			esperarAlgunsSegundos(2000L);
			return true;
			
		}
		return false;
	}
	
	public void acionarBotaoContinuarSemCriarConta() throws Exception {
		botaoContinuarSemCriarConta.click();
		esperarAlgunsSegundos(2000L);
	}

	public void acionarBotaoComecar() throws Exception {
		botaoComecar.click();
		esperarAlgunsSegundos(2000L);
	}

	public void interagindoComCampoDeBusca(String moeda) throws Exception {
		botaoBuscar.click();
		esperarAlgunsSegundos(2000L);

		driver.getKeyboard().sendKeys(moeda);
		esperarAlgunsSegundos(1000L);
	}

	public void adicionandoSaldoPrincipal(String valor) throws Exception {

		driver.getKeyboard().sendKeys(valor);
		esperarAlgunsSegundos(2000L);

	}

	public void acionarBotaoProximo() throws Exception {
		botaoProximo.click();
		esperarAlgunsSegundos(2000L);
	}

	public void acionarBotaoDeComecar() throws Exception {
		botaoDeComecar.click();
		esperarAlgunsSegundos(2000L);
	}

	public void validarTelasBoasVindas() throws Exception {
		assertTrue(telaBoasVindas.isDisplayed());
		esperarAlgunsSegundos(2000L);
	}
	
//	public void selecionarMoeda(String valor) {
//		botaoBuscar.sendKeys(valor);
//	}

}
