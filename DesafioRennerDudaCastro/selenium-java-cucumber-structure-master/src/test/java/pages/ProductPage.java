package pages;

import org.openqa.selenium.support.PageFactory;
public class ProductPage extends ProductPageElementMap {

    public ProductPage(){
        PageFactory.initElements(driver, this);
    }

    public void additens(String quantidade) {
        quantity.clear();
        quantity.sendKeys(quantidade);
        addButton.click();
    }
}
