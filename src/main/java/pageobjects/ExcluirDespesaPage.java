package pageobjects;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExcluirDespesaPage {

	public ExcluirDespesaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath =  "//android.widget.ImageView[@index='2']")
	private MobileElement menuTransacoes;
	
	@AndroidFindBy(accessibility =  "Compras de mercado\nR$ 70,00\nPrincipal")
	private MobileElement despesaSelecionada;
	
	@AndroidFindBy(accessibility =  "EXCLUIR")
	private MobileElement botaoExcluir;
	
	@AndroidFindBy(accessibility =  "SIM")
	private MobileElement botaoSim;
	
	@AndroidFindBy(accessibility =  "Total: R$ 0,00")
	private MobileElement saldoDespesa;
	
	public void acionarMenuTransacoes() {
		menuTransacoes.click();
	}
	
	public void selecionarDespesa() {
		despesaSelecionada.click();
	}
	
	public void acionarBotarExcluir() {
		botaoExcluir.click();
	}
	
	public void escolherOpcaoSim() {
		botaoSim.click();
	}
	
	public void validarExclusao() {
		assertTrue(saldoDespesa.isDisplayed());
	}
}
