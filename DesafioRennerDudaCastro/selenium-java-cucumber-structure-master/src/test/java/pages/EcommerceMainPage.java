package pages;

import org.openqa.selenium.support.PageFactory;

public class EcommerceMainPage extends EcommerceMainPageElementMap {

    public EcommerceMainPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickMaisDetalhesProduto(String produto) {
        CommonPage commonPage = new CommonPage();
        switch (produto){
            case "Stylish Dress":
                commonPage.waitVisibilityOf(stylishDressDetails);
                stylishDressDetails.click();
                break;
            case "Beautiful Peacock Blue Cotton Linen Saree":
                commonPage.waitVisibilityOf(beautifulPeacockBlueCottonLinenSareeDetails);
                beautifulPeacockBlueCottonLinenSareeDetails.click();
                break;
            case "Men Tshirt":
                commonPage.waitVisibilityOf(menTshirtDetails);
                menTshirtDetails.click();
                break;
            default:
                System.out.println("Insira um produto válido.");

        }
    }
}
