package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;
public class LoginSignupPage extends LoginSignupPageElementMap {

    public LoginSignupPage(){
        PageFactory.initElements(driver, this);
    }

    public void clicarEmSignUpLogin() {
        signupLoginPage.click();
    }

    public void adicionarNome() {
        Faker faker = new Faker();
        String nomeAleatorio = faker.name().firstName();
        nameInputLocator.sendKeys(nomeAleatorio);
    }
    public void adicionarEmail() {
        Faker faker = new Faker();
        String emailAleatorio = faker.internet().emailAddress();
        emailInputLocator.sendKeys(emailAleatorio);
    }

    public void clickSignup() {
        signupButtonLocator.click();
    }
}
