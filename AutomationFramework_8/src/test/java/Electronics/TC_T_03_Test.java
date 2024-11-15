package Electronics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;


@Listeners(ListenerUtility.class)
public class TC_T_03_Test extends BaseClass {
	//Changes to appear in Github
	public void clickOnElectronics() throws EncryptedDocumentException, IOException {
		ExtentTest test = extReport.createTest("clickOnElectronics");
		hp = new HomePage(driver);
		hp.getElectronicsLink().click();
		Assert.assertEquals(driver.getTitle(), eLib.getStringDataFromExcel("Electronics", 1, 0),
				"Electronics page is not displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}
}
