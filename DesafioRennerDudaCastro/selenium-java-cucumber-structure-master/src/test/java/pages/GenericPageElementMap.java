package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GenericPageElementMap extends CommonPage {

    @FindBy(xpath = "//button[contains(.,'Continue Shopping')]")
    protected WebElement continuarComprandoButton;
    @FindBy(xpath = "//a[@href='/'][contains(.,'Home')]")
    protected WebElement voltaHome;
    @FindBy(xpath = "(//a[@href='/view_cart'][contains(.,'Cart')])[1]")
    protected WebElement acessaCart;

}
