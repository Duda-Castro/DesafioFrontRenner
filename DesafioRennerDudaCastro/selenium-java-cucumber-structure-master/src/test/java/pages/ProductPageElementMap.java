package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageElementMap extends CommonPage {

    @FindBy(id = "quantity")
    protected WebElement quantity;

    @FindBy(xpath = "//button[contains(.,'Add to cart')]")
    protected WebElement addButton;

}
