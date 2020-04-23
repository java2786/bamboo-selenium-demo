package com.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCases {
	WebDriver driver;
	
	@Before
	public void setup() {
		String driverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverPath);

		driver =new FirefoxDriver();
	}
	
	@After
	public void down() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

	@Test
	public void test() {
		driver.get("http://localhost:8888/web/index.jsp");
		
		Assert.assertTrue(true);
	}
	
	
}
