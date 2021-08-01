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

public class RendaPage {

	public RendaPage(AppiumDriver<?> driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath =  "//android.view.View[@index='4']")
	private MobileElement menuRenda;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	private MobileElement campoValor;
	
	@AndroidFindBy(accessibility = "R$ 100,00")
	private MobileElement rendaAdicionada;
	
	@AndroidFindBy(accessibility = "Total\nR$ 300,00")
	private MobileElement totalSaldo;
	
	public void acionarMenuRenda() throws Exception {
		menuRenda.click();
	}
	
	public void adicionarSaldoRenda(String renda) throws Exception {
		inputTextAppiumCommand(campoValor, renda);
		esperarAlgunsSegundos(2000L);
	}
	
	public void selecionarCategoria(String categoria) throws Exception {
		MobileElement selecionarCategoria = (MobileElement) driver.findElement(MobileBy.AccessibilityId(categoria));
		selecionarCategoria.click();
	}
	
public boolean validacaoRenda() throws Exception {
		
		if (rendaAdicionada.isDisplayed() && totalSaldo.isDisplayed()) {
			return true;
		}
		return false;
	}
}
