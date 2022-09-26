package org.tyss.genericUsability;

import org.openqa.selenium.WebDriver;

public class ThreadSafeClass 
{
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<>();
	private static ThreadLocal<SeleniumUsability> driver1=new ThreadLocal<>();
	private static ThreadLocal<JavaUsability> driver2=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}

	public static SeleniumUsability getDriver1() {
		return driver1.get();
	}

	public static JavaUsability getDriver2() {
		return driver2.get();
	}
	

	public static void setDriver2(JavaUsability javdriver) {
		driver2.set(javdriver);
	}
	
	public static void setDriver1(SeleniumUsability webdriver) {
		driver1.set(webdriver);
	}

	public static void setDriver(WebDriver actdriver) {
		driver.set(actdriver);
	}
	
}
