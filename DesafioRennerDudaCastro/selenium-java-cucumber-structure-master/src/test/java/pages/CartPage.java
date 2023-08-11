package pages;

import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class CartPage extends CartPageElementMap {

    public CartPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean verificaSeFoiAdicionado(String quantidade, String produto) {
        String produtoCarrinho = "0";
        switch (produto){
            case "Stylish Dress":
                produtoCarrinho = cartStylishDress.getText();
                break;
            case "Beautiful Peacock Blue Cotton Linen Saree":
                produtoCarrinho = cartBeautifulPeacockBlueCottonLinenSaree.getText();
                break;
            case "Men Tshirt":
                produtoCarrinho = cartMenTshirt.getText();
                break;
            default:
                System.out.println("Produto não existe no carrinho.");
        }
        String quantityByProduct = null;
        switch (produto){
            case "Stylish Dress":
                quantityByProduct = quantityStylishDress.getText();
                break;
            case "Beautiful Peacock Blue Cotton Linen Saree":
                quantityByProduct = quantityBeautifulPeacockBlueCottonLinenSaree.getText();
                break;
            case "Men Tshirt":
                quantityByProduct = quantityMenTshirt.getText();
                break;
            default:
                System.out.println("Produto não existe no carrinho.");
        }

        if(Objects.equals(quantidade, quantityByProduct) && Objects.equals(produto, produtoCarrinho)){
            return true;
        }else{return false;}
    }
}
