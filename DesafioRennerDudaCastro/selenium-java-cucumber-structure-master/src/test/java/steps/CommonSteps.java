package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pages.GenericPage;
import util.TestRule;

public class CommonSteps {

    @Dado("que acesso o ecommerce")
    public void acessarEcommerce(){
        String ecommerceUrl = "https://automationexercise.com/";
        TestRule.abrirNavegadorComAdBlock(ecommerceUrl);
    }
    @E("^que acesso o carrinho$")
    public void queAcessoOCarrinho() {
        GenericPage genericPage = new GenericPage();
        genericPage.acessaCarrinho();
        }
}
