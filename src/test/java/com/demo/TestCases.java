package com.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCases {
	WebDriver driver;
	
	@Before
	public void setup() {
		String driverPath = System.getProperty("user.dir") + "//src//test//resources//drivers//geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverPath);

		driver =new FirefoxDriver();
	}
	
	@After
	public void down() {
		driver.close();
	}

	@Test
	public void test() {
		driver.get("https://stackoverflow.com/");
		
		WebElement loginBtn = driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[2]/a[1]"));
		loginBtn.click();
		String title = driver.getTitle();
		
		Assert.assertEquals("Log In - Stack Overflow", title);
	}
	
	
}
