package pageobjects;

import static utils.Utils.driver;
import static utils.Utils.esperarAlgunsSegundos;
import static utils.Utils.inputTextAppiumCommand;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DespesaPage {

	public DespesaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@index='5']")
	private MobileElement botaoAdicionarDespesa;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
	private MobileElement botaoTela;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	private MobileElement campoValor;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Comentário']")
	private MobileElement campoComentario;
	
	@AndroidFindBy(accessibility = "Adicionar")
	private MobileElement botaoAdicionar;
	
	@AndroidFindBy(accessibility = "R$ 70,00")
	private MobileElement despesaAdicionada;
	
	@AndroidFindBy(accessibility = "Total\nR$ 130,00")
	private MobileElement saldoTotal;
	
	public void acionarBoatoAdicionarDespesa() throws Exception {
		botaoAdicionarDespesa.click();
	}
	
	public void passarTutorial() throws Exception {
		for (int i = 1; i <= 9; i++) {
			botaoTela.click();
		}
	}
	
	public void adicionarSaldoDespesa(String depesa) throws Exception {
		inputTextAppiumCommand(campoValor, depesa);
		esperarAlgunsSegundos(2000L);
	}
	
	public void escolherCategoria(String categoria) throws Exception {
		MobileElement botaoCategoria = (MobileElement) driver.findElement(MobileBy.AccessibilityId(categoria));
		botaoCategoria.click();
	}
	
	public void adicionarComentario(String comentario) throws Exception {
		inputTextAppiumCommand(campoComentario, comentario);
		esperarAlgunsSegundos(2000L);
	}
	
	public void acionarBotaoAdicionar() throws Exception {
		botaoAdicionar.click();
	}
	
	public boolean validarAdicaoDespesa() {
		
		if (despesaAdicionada.isDisplayed() && saldoTotal.isDisplayed()) {
			return true;
		}
		return false;
	}
}
