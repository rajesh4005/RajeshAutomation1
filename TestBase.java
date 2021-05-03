package com.testscript;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.pages.AlibabaPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	WebDriver driver;
	SoftAssert SAssert;
	AlibabaPage alibaba;

	Actions action;

	@BeforeClass
	@Parameters({ "Url" })
	public void setUp(String Url) {

		System.setProperty("webdriver.chrome.driver", "F:\\Virtusa. softwares\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		alibaba = new AlibabaPage(driver);
		action = new Actions(driver);
		driver.get(Url);
		SAssert = new SoftAssert();

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
