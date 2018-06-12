package extentrpt04;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {
@Test
	public void ExtentReport()
	
	{
		
ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/SampleReportSunil_1.html");
ExtentReports extent = new ExtentReports();
extent.attachReporter(reporter);
ExtentTest logger =extent.createTest("Login Test");
logger.log(Status.INFO, "Login To Amazon.com");
logger.log(Status.PASS,"Title Verified");
extent.flush();

	}

}
