package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import pages.LoginSignupPage;

public class LoginSignupSteps {

    @Quando("^clico em Signup/Login$")
    public void clicoEmSignupLogin() {
        LoginSignupPage loginSignupPage = new LoginSignupPage();
        loginSignupPage.clicarEmSignUpLogin();
    }

    @E("^eu inserir um nome em New User Signup!$")
    public void euInserirUmNomeEmNewUserSignup() {
        LoginSignupPage loginSignupPage = new LoginSignupPage();
        loginSignupPage.adicionarNome();
    }

    @E("^eu inserir um email em Email Address$")
    public void euInserirUmEmailEmEmailAddress() {
        LoginSignupPage loginSignupPage = new LoginSignupPage();
        loginSignupPage.adicionarEmail();
    }

    @E("^eu clicar no botão Signup")
    public void euClicarNoBotaoSignup(){
        LoginSignupPage loginSignupPage = new LoginSignupPage();
        loginSignupPage.clickSignup();
    }


}
