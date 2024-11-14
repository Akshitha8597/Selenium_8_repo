package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Declaration
	@FindBy(id = "small-searchterms")
	private WebElement searchField;

	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;

	@FindBy(linkText = "BOOKS")
	private WebElement booksLink;

	@FindBy(linkText = "COMPUTERS")
	private WebElement computersLink;

	@FindBy(linkText = "ELECTRONICS")
	private WebElement electronicsLink;

	@FindBy(linkText = "APPAREL & SHOES")
	private WebElement apparelAndShoesLink;

	@FindBy(linkText = "DIGITAL DOWNLOADS")
	private WebElement digitalDownloadsLink;

	@FindBy(linkText = "JEWELRY")
	private WebElement jewelryLink;

	@FindBy(linkText = "GIFT CARDS")
	private WebElement giftCards;

	@FindBy(linkText = "Log out")
	private WebElement logoutLink;

	// Initilization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Getters
	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
