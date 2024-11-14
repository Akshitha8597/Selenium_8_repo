package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test = extReport.createTest(result.getName());
	}

	public void onTestFailure(ITestResult result) {
		String methodName = result.getName();

		TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + methodName + jLib.getSystemTime() + ".png");
		stest.log(Status.FAIL, methodName + " is failed");
		stest.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
