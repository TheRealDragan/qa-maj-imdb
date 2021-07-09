package test;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import browser.Browser;
import pages.Imdb;

public class BaseTest {
	
	protected static Imdb imdb;
	
	@BeforeClass
	public static void setUp() {
		imdb = new Imdb();
	}
	
	@AfterClass
	public static void cleanUp() {
		Browser.getBrowser().quit();
	}
	
	@Before
	public void before() {
		Browser.getBrowser().get("https://www.imdb.com/");

	}

}
