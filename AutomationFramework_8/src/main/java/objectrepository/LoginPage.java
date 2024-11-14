package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static final String getEmailTextField = null;

	// Declaration
	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(linkText = "Remember me?")
	private WebElement remembermeLink;

	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public Object getPasswordTextField;

	// Initalization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Getters
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRemembermeLink() {
		return remembermeLink;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public static String getGetemailtextfield() {
		return getEmailTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
