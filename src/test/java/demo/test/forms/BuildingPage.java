package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;

public class BuildingPage extends BaseForm {
	
	private static String formlocator="//a[@class='name-resource' and .='ВАШ ДОМ']";
	
	private Label lbWindows = new Label(By.linkText("Окна"),"Окна");
	private Label lbAssert = new Label(By.xpath("//h1"),"Проверка");
	
	public BuildingPage() {
		super(By.xpath(formlocator), "Строительство");
	}
	
	public void navigate_windows(){
		lbWindows.click();
	}
	
	public void searchAssert(){
		assert((lbAssert.getText()).equalsIgnoreCase("Окна в Минске"));
	}
}
