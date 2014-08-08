package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class TVset extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.navigate_tv();
		logger.step(3);
		TVPage tv_page = new TVPage();
		tv_page.assert_program();
		logger.step(4);
		tv_page.assert_date();
	}

}
