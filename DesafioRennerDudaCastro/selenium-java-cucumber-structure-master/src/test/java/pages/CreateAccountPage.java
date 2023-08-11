package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends CreateAccountPageElmentMap {

    public CreateAccountPage(){
        PageFactory.initElements(driver, this);
    }

    public void selectGender() {
        mrsGenderSelectLocator.click();
    }

    public void inputPassword() {
        Faker senhaAleatoria = new Faker();
        passwordInputLocator.sendKeys(senhaAleatoria.gameOfThrones().toString());
    }

    public void inputFirstName() {
        Faker nome = new Faker();
        firstNameInputLocator.sendKeys(nome.gameOfThrones().character());
    }

    public void inputLastName() {
        Faker sobrenome = new Faker();
        lastNameInputLocator.sendKeys(sobrenome.superhero().name());
    }

    public void inputZipCode() {
        Faker zipCode = new Faker();
        zipCodeInputLocator.sendKeys(zipCode.number().digits(8));
    }

    public void inputAddress() {
        Faker endereco = new Faker();
        addressInputLocator.sendKeys(endereco.address().streetAddress());
    }

    public void selectCountry() {
        Select drpCountry = new Select(countryDropDownLocator);
        drpCountry.selectByVisibleText("Australia");
    }

    public void inputState() {
        Faker state = new Faker();
        stateInputLocator.sendKeys(state.address().state());
    }

    public void inputCity() {
        Faker city = new Faker();
        cityInputLocator.sendKeys(city.address().city());
    }

    public void inputMobileNumber() {
        Faker number = new Faker();
        mobileNumberInputLocator.sendKeys(number.phoneNumber().cellPhone());
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }
}
