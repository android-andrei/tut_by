package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;

public class FinancePage extends BaseForm {
	
	private static String formlocator="//span[@class='name-resource' and .='ФИНАНСЫ']";
	
	private Label lbNBRB = new Label(By.linkText("НБРБ"),"Курс НБРБ");
	private Label lbKursNBRB = new Label(By.xpath("//table[@class='k-table']//a[.='Доллар США']/../..//span"),"Курс даллара НБРБ на станице финансов");
	
	public FinancePage() {
		super(By.xpath(formlocator), "Финансы");
	}
	
	public void set_nbrb(){
		lbNBRB.click();
	}
	
	public void assert_kurs( String kurs_home ){
		assert(("$"+(lbKursNBRB.getText()).replaceAll(" ", "")).equalsIgnoreCase(kurs_home));
	}
}
