package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class NewsPage extends BaseForm {
	
	private static String formlocator="//a[.='Новость дня']";
	
	private TextBox txbComment = new TextBox(By.id("post"),"Поле для комментария");
	private Button btnAddComment = new Button(By.xpath("//input[@name='textcont']"),"Добавить комментарий");
	
	public NewsPage() {
		super(By.xpath(formlocator), "Первая новость");
	}
	
	public void comment_add( String text ){
		txbComment.type(text);
		btnAddComment.click();
	}
	
	public void assertComment(String author, String text){
		String author_locator = "//a[.='"+author+"']/../../div[@class='comment_txt']";
		logger.info(author_locator);
		Label lbAssert = new Label(By.xpath(author_locator),"Добавленный комментарий");
		logger.info(lbAssert.getText());
		assert((lbAssert.getText()).equalsIgnoreCase(text));
	}
}
