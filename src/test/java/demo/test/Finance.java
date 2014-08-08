package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Finance extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		String kurs_home = home_page.kurs();
		home_page.navigate_finance();
		logger.step(3);
		FinancePage finance_page = new FinancePage();
		finance_page.set_nbrb();
		logger.step(4);
		finance_page.assert_kurs(kurs_home);
		
	}

}
