package steps;

import cucumber.api.java.pt.Quando;
import pages.EcommerceMainPage;

public class EcommerceMainSteps {

    @Quando("^clico em ver mais detalhes do produto \"([^\"]*)\"$")
    public void clicoEmVerMaisDetalhesDoProduto(String produto) {
        EcommerceMainPage ecommerceMainPage = new EcommerceMainPage();
        ecommerceMainPage.clickMaisDetalhesProduto(produto);
        }

}
