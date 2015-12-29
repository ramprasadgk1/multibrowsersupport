package org.ram.testingtools.webdriver.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleWebDriver {
	public static void main (String args[]){
		WebDriver wd = new FirefoxDriver();
		wd.get("www.google.com");
		wd.quit();
	}

}
