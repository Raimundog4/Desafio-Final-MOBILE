package pageobjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;
import static utils.Utils.esperarAlgunsSegundos;

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
	private MobileElement campoSaldo;

//	@AndroidFindBy(accessibility = "Compras de mercado")
//	private MobileElement botaoCategoria;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Comentário']")
	private MobileElement campoComentario;
	
	@AndroidFindBy(accessibility = "Adicionar")
	private MobileElement botaoAdicionar;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='0']")
	private MobileElement despesaAdicionada;
	
	@AndroidFindBy(accessibility = "R$ 70,00")
	private MobileElement despesaAdicionada2;
	
	public void acionarBoatoAdicionarDespesa() throws Exception {
		botaoAdicionarDespesa.click();
		esperarAlgunsSegundos(2000L);
	}
	
	public void passarTutorial() throws Exception {
		botaoTela.click();
		esperarAlgunsSegundos(2000L);
	}
	
	public void adicionarSaldoDespesa(String depesa) throws Exception {
		driver.getKeyboard().sendKeys(depesa);
		esperarAlgunsSegundos(2000L);
	}
	
	public void escolherCategoria(String categoria) throws Exception {
		MobileElement botaoCategoria = (MobileElement) driver.findElement(MobileBy.AccessibilityId(categoria));
		botaoCategoria.click();
		esperarAlgunsSegundos(2000L);
	}
	
	public void adicionarComentario(String comentario) throws Exception {
		campoComentario.click();
		driver.getKeyboard().sendKeys(comentario);
		esperarAlgunsSegundos(2000L);
	}
	
	public void acionarBotaoAdicionar() throws Exception {
		botaoAdicionar.click();
		esperarAlgunsSegundos(2000L);
	}
	
	public void validarAdicaoDespesa(String categoria) {
//		assertEquals("true", despesaAdicionada.getAttribute("clickable"));
		MobileElement validacao = (MobileElement) driver.findElement(MobileBy.xpath("//*[contains(@content-desc, '"+categoria+"')]"));
		assertTrue(validacao.isDisplayed());
	}
	
	public boolean validacaoDespesa() {
		
		if (despesaAdicionada2.isDisplayed()) {
			return true;
		}
		return false;
	}
}
