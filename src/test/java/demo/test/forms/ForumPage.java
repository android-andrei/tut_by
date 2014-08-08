package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class ForumPage extends BaseForm {
	
	private static String formlocator="//h1[.='Список форумов']";

	private TextBox txbSearch = new TextBox(By.name("str"),"Строка поиска");
	private Button btnSearch = new Button (By.name("search"),"Кнопка Найти");
	private Label lbAssert = new Label(By.xpath("//p[@class='description']//u"),"Ключевые слова");
	
	public ForumPage() {
		super(By.xpath(formlocator), "Форумы");
	}
	
	public void search(String text){
		txbSearch.type(text);
    	btnSearch.click();
	}
	
	public void searchAssert(){
		assert((lbAssert.getText()).equalsIgnoreCase("телевизор"));
	}
}
