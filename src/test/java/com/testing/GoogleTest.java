package com.testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest{
	
	@Test
	public void testGoogle() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.quit();
		
		
	}

}
