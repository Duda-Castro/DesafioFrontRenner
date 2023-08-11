package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcommerceMainPageElementMap extends CommonPage {

    @FindBy(xpath = "(//a[contains(@href,'details/4')])[1]")
    protected WebElement stylishDressDetails;

    @FindBy(xpath = "//a[@href='/product_details/41'][contains(.,'View Product')]")
    protected WebElement beautifulPeacockBlueCottonLinenSareeDetails;

    @FindBy(xpath = "//a[@href='/product_details/2'][contains(.,'View Product')]")
    protected WebElement menTshirtDetails;

}
