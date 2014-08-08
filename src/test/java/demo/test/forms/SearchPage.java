package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;

public class SearchPage extends BaseForm {
	
	private static String formlocator="//span[@class='name-resource' and .='ПОИСК']";

	private Label lbAssert = new Label(By.xpath("//a[contains(.,'Автоматизатор тестирования ПО')]"),"label testing");
	
	public SearchPage() {
		super(By.xpath(formlocator), "Страница поиска");
	}
	
	public void searchAssert(){
		assert(lbAssert.isPresent());
	}
}
