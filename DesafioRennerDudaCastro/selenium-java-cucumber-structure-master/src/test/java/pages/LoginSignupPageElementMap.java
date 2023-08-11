package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSignupPageElementMap extends CommonPage {

    @FindBy(xpath = "//a[@href='/login'][contains(.,'Signup / Login')]")
    protected WebElement signupLoginPage;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    protected WebElement nameInputLocator;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    protected WebElement emailInputLocator;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    protected WebElement signupButtonLocator;

    }

