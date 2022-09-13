package org.tyss.genericUsability;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	private ExtentReports report;
	private ExtentTest test;
	public static  ExtentTest testlog;
	//@BeforeTest
	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./extentreport-output/emailable-extentreport.html");
		spark.config().setDocumentTitle("Document title");
		spark.config().setReportName("Report Name");
		spark.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Browser Name", "Chrome");
		report.setSystemInfo("Browser Version", "103.11.234");
		
			
	}

	@Override
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getClass().getSimpleName());
		test.assignAuthor("Anuprita Raut");
		test.assignCategory("smoke");
		testlog=test;	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass(result.getMethod().getMethodName()+" is pass");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getMethod().getMethodName()+" is failed");
		test.fail(result.getThrowable());
		 String pathOfScreenshort = UtilityObjectClass.getSeleniumusability().takeScreenShotPage();
		//SeleniumUsability s=new SeleniumUsability();
		//String pathOfScreenshort=s.takeScreenShotPage();
		 test.addScreenCaptureFromBase64String(pathOfScreenshort,result.getMethod().getMethodName());
		 //test.addScreenCaptureFromPath(pathOfScreenshort);		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.skip(result.getMethod().getMethodName()+" is skipped");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();			
	}
		

	}
