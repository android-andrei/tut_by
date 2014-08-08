package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class PrivateOffice extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.login("andrei.internet", "9664069", "Андрей Пульша");
		logger.step(3);
		home_page.navigate_private_office();
		PrivateOfficePage private_office_page = new PrivateOfficePage();
		logger.step(4);
		private_office_page.assertProfile();
		logger.step(5);
		
	}

}
