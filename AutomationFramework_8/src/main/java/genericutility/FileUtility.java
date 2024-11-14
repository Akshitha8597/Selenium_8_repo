package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Akshitha M
 */

public class FileUtility {
	/**
	 * This method is used to read data from property file User must pass key this
	 * method returns value
	 * 
	 * @param key
	 * @return value
	 * @throws IOException
	 */

	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TrelloCommonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);

	}

	public void getDataFromExcel(String key) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/TrelloDataSpecificData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);

	}
}
