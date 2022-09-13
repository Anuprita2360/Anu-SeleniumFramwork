package org.tyss.genericUsability;

import org.openqa.selenium.WebDriver;

public class UtilityObjectClass 
{
   
	private static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	private static ThreadLocal<ExcelFileUsability> excelfileusability=new ThreadLocal<ExcelFileUsability>();
	private static ThreadLocal<PropertyFileUsability> propertyfileusability=new ThreadLocal<PropertyFileUsability>();
	private static ThreadLocal<JavaUsability> javausability=new ThreadLocal<JavaUsability>();
	private static ThreadLocal<SeleniumUsability> seleniumusability=new ThreadLocal<SeleniumUsability>();
	private static ThreadLocal<JavaScriptExcecutorUtility>JavaScriptExcecutorUtility=new ThreadLocal<JavaScriptExcecutorUtility>();
	public static WebDriver getDriver() {
		return driver.get();
	}
	public static void setDriver(WebDriver actdriver) {
		driver.set(actdriver);
	}
	public static ExcelFileUsability getExcelfileusability() {
		return excelfileusability.get();
	}
	public static void setExcelfileusability(ExcelFileUsability actexcelfileusability) {
		excelfileusability.set(actexcelfileusability);
	}
	public static PropertyFileUsability getPropertyfileusability() {
		return propertyfileusability.get();
	}
	public static void setPropertyfileusability(PropertyFileUsability actpropertyfileusability) {
		propertyfileusability.set(actpropertyfileusability);
	}
	public static JavaUsability getJavausability() {
		return javausability.get();
	}
	public static void setJavausability(JavaUsability actjavausability) {
		javausability.set(actjavausability);
	}
	public static JavaScriptExcecutorUtility getJavaScriptExcecutorUtility() {
		return JavaScriptExcecutorUtility.get();
	}
	public static void setJavaScriptExcecutorUtility(JavaScriptExcecutorUtility actjavaScriptExcecutorUtility) {
		JavaScriptExcecutorUtility.set(actjavaScriptExcecutorUtility);
	}
	public static SeleniumUsability getSeleniumusability() {
		return seleniumusability.get();
	}
	public static void setSeleniumusability(SeleniumUsability actseleniumusability) {
	seleniumusability.set(actseleniumusability);
	}
		
}
