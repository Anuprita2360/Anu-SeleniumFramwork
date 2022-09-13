package org.vtiger.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodOverriding {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
public static void main(String []arg) {
	WebDriver driver=new ChromeDriver();
	driver.get(null);
}
}
