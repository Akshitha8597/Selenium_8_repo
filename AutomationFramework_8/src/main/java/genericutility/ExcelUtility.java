package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/*
 * @author Akshitha 
 */
public class ExcelUtility {
	/**
	 * This method is used to read string data from excel file
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resource/TrelloDataSpecificData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}

	/**
	 * This method is used to read boolean data from excel file
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis1 = new FileInputStream("./src/test/resource/TrelloDataSpecificData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis1);
		boolean value1 = workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		return value1;
	}

	/**
	 * This method is used to read numeric data from excel file
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public double getNumericDataFromExcel(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis2 = new FileInputStream("./src/test/resource/TrelloDataSpecificData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis2);
		double value2 = workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		return value2;
	}

	/**
	 * This method is used to read date from excel file
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public LocalDateTime getLocalDateFromExcel(String sheetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis3 = new FileInputStream("./src/test/resource/TrelloDataSpecificData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis3);
		LocalDateTime value3 = workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex)
				.getLocalDateTimeCellValue();
		return value3;
	}

}
