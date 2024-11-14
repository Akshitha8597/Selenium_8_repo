package computers;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_T_02_Test extends BaseClass {

	public void clickOnComputers() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), eLib.getStringDataFromExcel("Computers", 1, 0),
				"Computers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");

	}
}
