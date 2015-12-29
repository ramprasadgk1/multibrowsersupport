package org.ram.testingtools.test.webdriver.sample;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;


public class TestSimpleWebDriver {
	@Test
	public  void testWe(){
		org.openqa.selenium.WebDriver wd = new FirefoxDriver();
		wd.get("www.google.com");
		wd.quit();
	}
}
