package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Shop extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.navigate_shop();
		logger.step(3);
		ShopPage shop_page = new ShopPage();
		shop_page.search("apple");
		logger.step(4);
		shop_page.searchAssert();
		logger.step(5);
		
	}

}
