package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Jobs extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.search("Автоматизатор тестирования ПО");
		logger.step(3);
		SearchPage search_page = new SearchPage();
		search_page.searchAssert();
		logger.step(4);
	}

}
