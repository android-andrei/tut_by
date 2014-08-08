package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Forum extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.navigate_forum();
		logger.step(3);
		ForumPage forum_page = new ForumPage();
		forum_page.search("телевизор");
		logger.step(4);
		forum_page.searchAssert();
	}

}
