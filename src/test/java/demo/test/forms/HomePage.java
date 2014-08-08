package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class HomePage extends BaseForm {
	
	private static String formlocator="//body[@class='main-page']";

	private Label lbFinance = new Label(By.xpath("//div[@class='b-topbar-h']//a[.='Финансы']"),"Финансы");
	private Label lbKurs = new Label(By.xpath("//div[@class='b-topbar-h']//span[@class='green']"),"Курс на главной странице");
	private Label lbTV = new Label(By.linkText("ТВ-программа"),"ТВ-программа");
	private Label lbShop = new Label(By.linkText("Магазины"),"Магазины");
	private Label lbAllResources = new Label(By.xpath("//span[.='Все ресурсы']"),"Все ресурсы");
	private Label lbForum = new Label(By.linkText("Форумы"),"Форумы");
	private Label lbBuilding = new Label(By.linkText("Строительство"),"Строительство");
	private Label lbSignIn = new Label(By.linkText("Войти"),"Вход");
	private Label lbUsername = new Label(By.xpath("//a[@class='enter logedin']"),"Имя пользователя");
	private Label lbPrivateOffice = new Label(By.linkText("Личный кабинет"),"Личный кабинет");
	private Label lbNews1 = new Label(By.xpath("//a[@data-atom-target='main_news_2']"),"Первая новость");
	private Label lbExit = new Label(By.xpath("//a[@class='gray-link exit']"),"Выход");
	private TextBox txbSearch = new TextBox(By.id("search_from_str"),"Строка поиска");
	private TextBox txbLogin = new TextBox(By.name("login"),"Поле логина");
	private TextBox txbPassword = new TextBox(By.name("password"),"Поле пароля");
	private Button btnSearch = new Button (By.name("search"),"Кнопка Найти");
	private Button btnSignIn = new Button (By.xpath("//input[@value='Войти']"),"Кнопка Войти");

	public HomePage() {
		super(By.xpath(formlocator), "Главная страница");
	}
	
	public void navigate_finance(){
		lbFinance.click();
	}
	
	public void navigate_tv(){
		lbTV.click();
	}
	
	public void navigate_shop(){
		lbShop.click();
	}
	
	public void navigate_forum(){
		lbAllResources.click();
		lbForum.click();
	}
	
	public void navigate_building(){
		lbAllResources.click();
		lbBuilding.click();
	}
	
	public void navigate_private_office(){
		lbUsername.click();
		lbPrivateOffice.click();
	}
	
	public void navigate_news_first(){
		lbNews1.click();
	}
	
	public void sign_in(){
		lbSignIn.click();
	}
	
	public void search(String text){
    	txbSearch.type(text);
    	btnSearch.click();
	}
	
	public String kurs(){
		return lbKurs.getText();
	}
	
	public void enter_login(String text){
		txbLogin.type(text);
	}
	
	public void enter_password(String text){
		txbPassword.type(text);
	}
	
	public void sign_in_btn(){
		btnSignIn.click();
	}
	
	public void signAssert(String text){
		assert((lbUsername.getText()).equalsIgnoreCase(text));
	}
	
	public void login(String user, String pass, String name){
		sign_in();
		enter_login(user);
		enter_password(pass);
		sign_in_btn();
	}
	
	public void logout(){
		lbExit.click();
	}
	
	public void assertSignIn(){
		assert(lbSignIn.isPresent());
	}
	
}
