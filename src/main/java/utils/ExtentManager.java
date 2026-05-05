package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static ExtentReports getReport() {

        ExtentSparkReporter reporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        reporter.config().setReportName("Automation Report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }
}
