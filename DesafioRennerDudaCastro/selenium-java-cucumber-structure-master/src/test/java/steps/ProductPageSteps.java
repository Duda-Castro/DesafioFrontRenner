package steps;

import cucumber.api.java.pt.E;
import pages.GenericPage;
import pages.ProductPage;

public class ProductPageSteps {

    @E("eu adicionar (\\d+) unidade\\(s\\) no carrinho$")
    public void euAdicionarUnidadeSNoCarrinho(String quantidade) {
        GenericPage genericPage = new GenericPage();
        ProductPage productPage = new ProductPage();
        productPage.additens(quantidade);
        genericPage.continuarComprando();
        }
}
