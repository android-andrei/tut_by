package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Logout extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.login("andrei.internet", "9664069", "Андрей Пульша");
		logger.step(3);
		home_page.logout();
		logger.step(4);
		home_page.assertSignIn();
		logger.step(5);
		
	}

}
