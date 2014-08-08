package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Comment extends BaseTest {

	public void runTest() {

		String text = "Правительству также рекомендовано при необходимости вносить предложения об изменении срока действия запрета, предусмотренного указом.";
		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.login("kolya.vykoryn", "kolya123", "Коля Викорин");
		logger.step(3);
		home_page.navigate_news_first();
		logger.step(4);
		NewsPage news_page = new NewsPage();
		news_page.comment_add(text);
		logger.step(5);
		news_page.assertComment("kolya.vykoryn",text);
		logger.step(6);
	}

}
