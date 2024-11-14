package giftCards;

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
public class TC_T_04_Test extends BaseClass {
	public void clickOnGiftCards() throws EncryptedDocumentException, IOException {
		ExtentTest test = extReport.createTest("clickOnGiftCards");
		hp = new HomePage(driver);
		hp.getGiftCards().click();
		Assert.assertEquals(driver.getTitle(), eLib.getStringDataFromExcel("Giftcards", 1, 0),
				"GiftCards page is not displayed");
		test.log(Status.PASS, "Giftcards page is displayed");
	}
}
