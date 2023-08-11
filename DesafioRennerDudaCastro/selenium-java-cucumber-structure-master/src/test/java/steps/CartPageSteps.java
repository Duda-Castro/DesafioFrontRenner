package steps;

import cucumber.api.java.pt.Entao;
import org.junit.Assert;
import pages.CartPage;

public class CartPageSteps {

    @Entao("^o carrinho deve conter (\\d+) unidades do produto \"([^\"]*)\"$")
    public void oCarrinhoDeveConterUnidadesDoProduto(String quantidade, String produto){
        CartPage cartPage = new CartPage();
        Assert.assertTrue(cartPage.verificaSeFoiAdicionado(quantidade, produto));
    }
}
