package pageobjects;

import static utils.Utils.driver;
import static utils.Utils.esperarAlgunsSegundos;
import static utils.Utils.inputTextAppiumCommand;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EditarDespesaPage {

	public EditarDespesaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		@AndroidFindBy(xpath =  "//android.widget.ImageView[@index='2']")
		private MobileElement menuTransacoes;
		
		@AndroidFindBy(accessibility =  "Compras de mercado\nR$ 70,00\nPrincipal")
		private MobileElement despesaSelecionada;
		
		@AndroidFindBy(xpath =  "//android.widget.ImageView[@index='2']")
		private MobileElement botaoEditar;
	
		@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
		private MobileElement campoValor;
		
		@AndroidFindBy(accessibility = "Salvar")
		private MobileElement botaoSalvar;
		
		@AndroidFindBy(accessibility = "R$ 100,00")
		private MobileElement despesaEditada;
		
		@AndroidFindBy(accessibility = "Transporte")
		private MobileElement categoriaEditada;
		
		public void acionarMenuTransacoes() {
			menuTransacoes.click();
		}
		
		public void selecionarDespesa() {
			despesaSelecionada.click();
		}
		
		public void acionarBotarEditar() {
			botaoEditar.click();
		}
		
		public void editarValor(String valor) throws Exception {
			
			//Enquanto o valor no campoValor for diferente de zero o driver irá deletar os caracteres
			while (campoValor.getText().length() != 0) {
				driver.getKeyboard().sendKeys(Keys.BACK_SPACE);
			}
			inputTextAppiumCommand(campoValor, valor);
			esperarAlgunsSegundos(2000L);
			
		}
		
		public void selecionarCategoria(String categoria) throws Exception {
			MobileElement selecionarCategoria = (MobileElement) driver.findElement(MobileBy.AccessibilityId(categoria));
			selecionarCategoria.click();
			
		}
		
		public void acionarBotaoSalvar() {
			botaoSalvar.click();
		}
		
		public boolean validarEdicaoDespesa() {
			if (despesaEditada.isDisplayed() && categoriaEditada.isDisplayed()) {
				return true;
			}
			return false;
		}
}
