package main;

import org.openqa.selenium.WebElement;

import browser.Browser;

public class CheckSelenium {

	public static void main(String[] args) {
		Browser.getBrowser().get("https://www.google.com/");
		WebElement searchBar = Browser.getBrowser().findElementByXPath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
		searchBar.sendKeys("Hello world!");

	}

}
