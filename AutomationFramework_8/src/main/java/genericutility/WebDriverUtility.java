package genericutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * This method is used to maximize window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method performs mouseover action on web element
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method performs right click on web page
	 * 
	 * @param driver
	 */

	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	public void moveByOffSet(WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveByOffset(100, 100).perform();

	}

	public void scrollToElement1(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void scrollByElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollByAmount(100, 100);
	}

	/**
	 * This method is used to switch to frame by index
	 * 
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * This method is used to switch the frame based on name or id
	 * 
	 * @param driver
	 * @param nameorId
	 */
	public void switchToFrame(WebDriver driver, String nameorId) {
		driver.switchTo().frame(nameorId);
	}

	/**
	 * This method is used to switch the frame based on the element
	 * 
	 * @param driver
	 * @param frameElement
	 */
	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	/**
	 * This method is used to click on the element using javascriptexecutor
	 * 
	 * @param driver
	 * @param element
	 */
	public void jsClick(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	/**
	 * This method is used to scroll the webpage using java
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void jsScroll(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
	}

	/**
	 * This method is used to switch the driver control to alert
	 * 
	 * @param driver
	 * @return
	 */

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	/**
	 * This method is used to switch the driver control and accept the popups
	 * 
	 * @param driver
	 */

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method is used to switch the driver control to alter and dismiss
	 * 
	 * @param driver
	 */
	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method is used to switch the driver control to alter and send the data
	 * using sendKeys
	 * 
	 * @param driver
	 * @param data
	 */
	public void switchToAlertAndSendKeys(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);
	}

	/**
	 * This method is used to select the dropdown by using the index
	 * 
	 * @param element
	 * @param index
	 */

	public void selectDropdown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This method is used to select the dropdown by using the value
	 * 
	 * @param element
	 * @param value
	 */
	public void selectDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method is used to get the text from the popups
	 * 
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	/**
	 * This method used to switch driver control to window based on url
	 * 
	 * @param driver
	 * @param url
	 */

	public void switchToWindow(WebDriver driver, String url) {
		// Step 1: Capture windowIds
		Set<String> allWindowIds = driver.getWindowHandles();
		// Step 2: Travel through all the windows
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(url)) {
				break;
			}
		}
	}

	public void switchToAlertAndGetText(WebDriver driver, String data) {
		driver.switchTo().alert().getText();
	}
	/**
	 * This method is used to take screenshot
	 * @param driver
	 * @param file
	 * @throws IOException
	 */
	
	public void takeScreenshotWithTheTimeStamp(WebDriver driver, String timeStamp) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp =ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./screenshots/image"+timeStamp+ ".png");
		FileHandler.copy(temp, dest);	
	}
	
	public void getAllOptions(WebDriver driver, WebElement element, int index) {
	
}

	public void selectByIndex(int index) {
	}
	/**
	 * This method is used to navigate back to prevoius page
	 * @param driver
	 */
	
	public void navigateBack(WebDriver driver) {
		driver.navigate().back();
	}
	/**
	 * This method is used to navigate forword to next page
	 * @param driver
	 */
	
	public void navigateForword(WebDriver driver) {
		driver.navigate().forward();
	}
	/**
	 * This method is used to refresh the webpage
	 * @param driver
	 */
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	/**
	 * This method is used to scroll till bottom of the page
	 * @param driver
	 */
	
	public void scrollTillBottom(WebDriver driver) {
		
	}
	
	/**
	 * This method is used to get the color of the element
	 * @param driver
	 * @param color
	 * @param element
	 */
	public void getColor(WebDriver driver, String color, WebElement element) {
		driver.findElement((By) element);
		element.getCssValue(color);
	}
	
	/**
	 * This method is used to close the window
	 * @param driver
	 */
	public void closeWindow(WebDriver driver) {
		driver.close();
	}
	/**
	 * This method Implicitlywait is used to waiting time for the webdriver to wait for an element to appear on the page before throwing  NoSuchElementException
	 * @param driver
	 * @param duration
	 */
	
	public void implicitlyWait(WebDriver driver, Duration duration) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * This method ExplicitWait in selenium allows you to define a specific wait condition for a particular element.
	 * @param driver
	 */
	public void expliciltyWait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void explicitlyWait(WebDriver driver) {
		
	}
}
