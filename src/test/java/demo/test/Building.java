package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Building extends BaseTest {

	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.tut.by/");
		logger.step(2);
		HomePage home_page = new HomePage();
		home_page.navigate_building();
		logger.step(3);
		BuildingPage building_page = new BuildingPage();
		building_page.navigate_windows();
		logger.step(4);
		building_page.searchAssert();
	}

}
