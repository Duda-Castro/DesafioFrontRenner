package steps;

import cucumber.api.java.pt.E;
import pages.CreateAccountPage;

public class CreateAccountSteps {

    @E("^eu preencher os campos vazios obrigatórios da página Enter Account Information$")
    public void euPreencherOsCamposVaziosObrigatoriosDaPaginaEnterAccountInformation() {
        CreateAccountPage createAccountPage = new CreateAccountPage();
        createAccountPage.selectGender();
        createAccountPage.inputPassword();
        createAccountPage.inputFirstName();
        createAccountPage.inputLastName();
        createAccountPage.inputAddress();
        createAccountPage.selectCountry();
        createAccountPage.inputState();
        createAccountPage.inputCity();
        createAccountPage.inputZipCode();
        createAccountPage.inputMobileNumber();

    }

    @E("^eu clicar no botão Create Account$")
    public void euClicarNoBotaoCreateAccount() {
        CreateAccountPage createAccountPage = new CreateAccountPage();
        createAccountPage.clickCreateAccount();
    }
}
