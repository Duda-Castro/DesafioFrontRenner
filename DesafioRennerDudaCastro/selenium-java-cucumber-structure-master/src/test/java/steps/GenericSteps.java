package steps;

import cucumber.api.java.pt.Entao;
import pages.GenericPage;

public class GenericSteps {

    @Entao("^devo receber a mensagem \"([^\"]*)\"$")
    public void devoReceberAMensagem(String mensagem) {
        GenericPage genericPage = new GenericPage();
        genericPage.pageContainsText(mensagem);
    }
}
