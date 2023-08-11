# Projeto Base Automação Web - Selenium, Java & Cucumber

## Ferramentas utilizadas:
- [Maven](https://maven.apache.org/ "Maven")
- [Java](https://www.java.com/pt_BR/ "Java")
- [JUnit](https://junit.org/junit4/ "JUnit")
- [Selenium](https://www.seleniumhq.org/ "Selenium")
- [ChromeDriver](https://chromedriver.chromium.org/downloads "ChromeDriver")
- [Cucumber](https://cucumber.io/ "Cucumber")
- [PageFactory](https://github.com/SeleniumHQ/selenium/wiki/PageFactory "PageFactory")
- [PageObject (pattern)](https://martinfowler.com/bliki/PageObject.html "PageObject")

## Arquitetura:

```
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        ├── java
        │   ├── pages
        │   │   ├── CartPage.java
        │   │   ├── CartPageElementMap.java
        │   │   ├── CommonPage.java
        │   │   ├── CreateAccountPage.java
        │   │   ├── CreateAccountPageElementMap.java
        │   │   ├── EcommerceMainPage.java
        │   │   ├── EcommerceMainPageElementMap.java
        │   │   ├── GenericPage.java
        │   │   ├── GenericPageElementMap.java
        │   │   ├── LoginSignupPage.java
        │   │   ├── LoginSignupPageElementMap.java
        │   │   ├── ProductPage.java
        │   │   └── ProductPageElementMap.java
        │   ├── steps
        │   │   ├── CartPageSteps.java
        │   │   ├── CommonSteps.java
        │   │   ├── CreateAccountSteps.java
        │   │   ├── EcommerceMainSteps.java
        │   │   ├── GenericSteps.java
        │   │   ├── LoginSignupSteps.java
        │   │   └── ProductPageSteps.java
        │   ├── tests
        │   │   └── RunTest.java
        │   └── util
        │       ├── TestRule.java
        │       └── Utils.java
        └── resources
            ├── drivers
            │   ├── chromedriver.exe
            │   └── READ.txt
            ├── extensions
            │   ├── AdBlock.crx
            │   └── READ.txt
            └── features
                ├── AdicionaAoCarrinho.feature
                └── CadastrarConta.feature
```


### Arquitetura - Bibliotecas utilizadas

Neste projeto foram utilizadas 4 bibliotecas:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java "selenium-java")
- [junit](https://mvnrepository.com/artifact/junit/junit "junit")
- [cucumber-java](https://mvnrepository.com/artifact/info.cukes/cucumber-java "cucumber-java")
- [cucumber-junit](https://mvnrepository.com/artifact/info.cukes/cucumber-junit "cucumber-junit")

A biblioteca selenium-java possui as implementações de: *WebDriver, DesiredCaps, ChromeDriver, ExpectedConditions, WebDriverWait, Actions, WebElement, FindBy, PageFactory*, utilizadas no projeto.

A biblioteca junit possui as implementações de: *TestWatcher, Description, ClassRule, RunWith, Assert*, utilizadas no projeto.

A biblioteca cucumber-java possui as implementações de: *Scenario, Before, After, Dado, E, Entao, CucumberOptions*, utilizadas no projeto.

A biblioteca cucumber-junit possui a implementação da classe *Cucumber.class*, utilizada da classe RunTest como ferramenta de execução.

### Arquitetura - Mapeamento dos elementos
Para mapear os elementos utilizamos a biblioteca do selenium PageFactory, responsável por abstrair os elementos para uma classe única e para facilitar a escrita e manutenção. Por padrão os elementos são armazenados nas classes com o padrão <NomeClasse>PageElementMap. Detalhes da implementação e exemplos:
- WebElement - responsável por identificar os elementos como Web;
- FindBy - responsável por mapear, através de anotações, os seletores dos WebElements
- CommonPage - responsável por abstrair ações comuns a todas as classes de Page e PageElementMap

Após mapeados, é necessário "inicializar" os elementos na classe em que serão utilizadas. Por padrão, os elementos são utilizados nas classe <NomeDaClasse>Page correspondentes. Para inicializar os elementos, siga o exemplo abaixo:

`PageFactory.initElements(driver, classe)`


### Arquitetura - Execução dos testes
Para execução dos testes, utilizamos classe JUnit, em conjunto com anotações do CucumberOptions para facilitar a criação de suítes de testes com diferentes configurações.

Para executar o teste, basta abrir o diretório "selenium-java-cucumber-structure-master" no terminal e usar o comando `mvn test`. 

### Arquitetura - ChromeDriver

Por conveniência, faça o download do chromedriver adequado para o seu sistema operacional e substitua o arquivo chromedriver.exe no diretório resources/drivers.
Local para download: https://chromedriver.chromium.org/downloads

### Arquitetura - AdBlock

Para a execução dos testes sem anuncios, foi utilizado a extensão AdBlock.


------------

