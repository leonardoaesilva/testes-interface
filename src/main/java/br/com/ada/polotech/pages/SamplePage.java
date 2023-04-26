package br.com.ada.polotech.pages;

import org.openqa.selenium.WebDriver;

public class SamplePage {
    private final WebDriver driver;

    public SamplePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getPage() {
        return driver;
    }
}
