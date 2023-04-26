package br.com.ada.polotech.pages;

import org.junit.jupiter.api.*;
import org.openqa.selenium.edge.EdgeDriver;

public class TargetPageTest {
    EdgeDriver browser;
    TargetPage browserPage;

    @BeforeAll
    public static void driverSetup() {
        System.setProperty("webdriver.edge.driver", ".\\msedgedriver.exe");
    }

    @BeforeEach
    public void testSetup() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");

        // para impedir o navegador de abrir, remova os caracteres /* */ do bloco abaixo
        /* EdgeOptions opt = new EdgeOptions();
        opt.addArguments("headless");
        browser = new EdgeDriver(opt); */
        browser = new EdgeDriver();
        browserPage = new TargetPage(browser);
        browserPage.maximizeWindow();
    }

    @Test
    public void accessMainPageTest() {
        browserPage.accessMainPage();
    }

    @Test
    public void buttonClickToSetAddressByActualLocationTest() {
        browserPage.accessMainPage();
        browserPage.wait(15);
        browserPage.clickToSetAddress();
    }

    @Test
    public void searchProductTest() {
        browserPage.accessMainPage();
        browserPage.wait(15);
        browserPage.clickToSetAddress();
        browserPage.wait(15);
        browserPage.search("pizza");
    }

    @Test
    public void filterSearchResultsByItemsTest() {
        browserPage.accessMainPage();
        browserPage.wait(15);
        browserPage.clickToSetAddress();
        browserPage.wait(15);
        browserPage.search("pizza");
        browserPage.wait(15);
        browserPage.selectItemsTab();
    }
}
