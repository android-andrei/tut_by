package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class ShopPage extends BaseForm {
	
	private static String formlocator="//span[@class='name-resource' and .='КУПИ']";
	
	private TextBox txbSearch = new TextBox(By.name("str"),"Строка поиска");
	private Button btnSearch = new Button (By.xpath("//input[@value='Найти']"),"Кнопка Найти");
	private Label lbAssert = new Label(By.xpath("//a[contains(.,'Apple')]"),"Проверка");
	
	public ShopPage() {
		super(By.xpath(formlocator), "Страница поиска");
	}
	
	public void search(String text){
    	txbSearch.type(text);
    	btnSearch.click();
	}
	
	public void searchAssert(){
		assert(lbAssert.isPresent());
	}
}
