package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageElmentMap extends CommonPage {
    @FindBy(xpath = "//input[@type='radio'][contains(@id,'gender2')]")
    protected WebElement mrsGenderSelectLocator;

    @FindBy(xpath = "//input[@id='password']")
    protected WebElement passwordInputLocator;

    @FindBy(xpath = "//input[@data-qa='first_name']")
    protected WebElement firstNameInputLocator;

    @FindBy(xpath = "//input[@data-qa='last_name']")
    protected WebElement lastNameInputLocator;

    @FindBy(xpath = "//input[@data-qa='address']")
    protected WebElement addressInputLocator;

    @FindBy(xpath = "//select[@data-qa='country']")
    protected WebElement countryDropDownLocator;

    @FindBy(xpath = "//input[@data-qa='state']")
    protected WebElement stateInputLocator;

    @FindBy(xpath = "//input[@data-qa='city']")
    protected WebElement cityInputLocator;

    @FindBy(xpath = "//input[@data-qa='zipcode']")
    protected WebElement zipCodeInputLocator;

    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    protected WebElement mobileNumberInputLocator;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    protected WebElement createAccountButton;

    }
