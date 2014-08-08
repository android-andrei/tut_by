package demo.test.forms;

import org.openqa.selenium.By;

import com.ibm.icu.text.SimpleDateFormat;

import webdriver.BaseForm;
import webdriver.elements.Label;

public class TVPage extends BaseForm {
	
	private static String formlocator="//span[@class='name-resource' and .='Программа ТВ']";
	
	private Label lbProgram = new Label(By.xpath("//h1[.='Программа передач']"),"Прграмма передач");
	private Label lbDate = new Label(By.xpath("//h2[@class='b-h2 b-h2-date']"),"День недели и дата");

	public void assert_program(){
		assert(lbProgram.isPresent());
	}
	
	@SuppressWarnings("deprecation")
	public void assert_date(){
		String date_program = lbDate.getText();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d ");
        String date_comp = dateFormat.format(java.util.Calendar.getInstance().getTime());
        String[] month = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        date_comp+=month[(java.util.Calendar.getInstance().getTime()).getMonth()];
        logger.info(date_program);
        logger.info(date_comp);
        assert(date_program.equalsIgnoreCase(date_comp));
	}
	
	public TVPage() {
		super(By.xpath(formlocator), "Программа ТВ");
	}
	

}
