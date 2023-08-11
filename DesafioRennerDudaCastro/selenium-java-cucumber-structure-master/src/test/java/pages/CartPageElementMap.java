package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageElementMap extends CommonPage {

    @FindBy(xpath = "//*[@id=\"product-4\"]/td[4]/button")
    protected WebElement quantityStylishDress;

    @FindBy(xpath = "//*[@id=\"product-2\"]/td[4]/button")
    protected WebElement quantityMenTshirt;
    @FindBy(xpath = "//*[@id=\"product-41\"]/td[4]/button")
    protected WebElement quantityBeautifulPeacockBlueCottonLinenSaree;

    @FindBy(xpath = "//a[@href='/product_details/4'][contains(.,'Stylish Dress')]")
    protected WebElement cartStylishDress;

    @FindBy(xpath = "//a[@href='/product_details/2'][contains(.,'Men Tshirt')]")
    protected WebElement cartMenTshirt;
    @FindBy(xpath = "//a[@href='/product_details/41'][contains(.,'Beautiful Peacock Blue Cotton Linen Saree')]")
    protected WebElement cartBeautifulPeacockBlueCottonLinenSaree;

}
