package demo.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import demo.test.forms.HomePage;
import webdriver.BaseTest;

public class testparam extends BaseTest {
    private String VALUE;
     @Test
    @Parameters({"value"})
    public void readParams(String value) throws Throwable{
          this.VALUE = value;
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
  		home_page.enter_login(VALUE);
  		logger.step(4);
  		home_page.enter_password("kolya123");
  		logger.step(5);
  		home_page.sign_in_btn();
  		logger.step(6);
  		home_page.signAssert("Коля Викорин");
  		logger.step(7);
         
    }

}