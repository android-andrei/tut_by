package demo.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import demo.test.forms.HomePage;
import webdriver.BaseTest;

public class Login extends BaseTest {
    private String user;
    private String password;
    private String username;
    @Test
    @Parameters({"user","password","username"})
    public void readParams(String value1, String value2, String value3) throws Throwable{
          this.user = value1;
          this.password = value2;
          this.username = value3;
          xTest();
    }
    
    @Override

	public void runTest() {
    	
    	logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.sign_in();
		logger.step(3);
		home_page.enter_login(user);
		logger.step(4);
		home_page.enter_password(password);
		logger.step(5);
		home_page.sign_in_btn();
		logger.step(6);
		home_page.signAssert(username);
		logger.step(7);
	}

}
