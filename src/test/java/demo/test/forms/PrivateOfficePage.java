package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;

public class PrivateOfficePage extends BaseForm {
	
	private static String formlocator="//h2[.='Редактирование профиля ']";

	private Label lbAssert = new Label(By.xpath(formlocator),"Редактирование профиля");
	
	public PrivateOfficePage() {
		super(By.xpath(formlocator), "Редактирование профиля");
	}
	
	public void assertProfile(){
		assert(lbAssert.isPresent());
	}
}
