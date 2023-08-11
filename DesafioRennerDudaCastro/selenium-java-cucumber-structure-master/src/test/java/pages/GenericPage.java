package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class GenericPage extends GenericPageElementMap {

    public GenericPage(){
        PageFactory.initElements(driver, this);
    }

    public void continuarComprando(){
            CommonPage commonPage = new CommonPage();
            commonPage.waitVisibilityOf(continuarComprandoButton);
            continuarComprandoButton.click();
            voltaHome.click();
    }

    public void acessaCarrinho() {
        acessaCart.click();
    }

    public void pageContainsText(String mensagem) {
        try { Thread.sleep (5000); } catch (InterruptedException ignored) {}
        String bodyText = driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(mensagem, bodyText.contains(mensagem));
    }
}
