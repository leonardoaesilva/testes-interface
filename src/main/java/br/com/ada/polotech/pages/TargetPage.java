package br.com.ada.polotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class TargetPage extends SamplePage {
    public TargetPage(WebDriver driver) {
        super(driver);
        driver.get("https://www.ifood.com.br/");
    }

    private WebElement getBannerImage() {
        return getPage().findElement(By.className("highlights-carousel__figure"));
    }

    private WebElement getAddressButton() {
        return getPage().findElement(By.className("btn-address--full-size"));
    }

    private WebElement getSearchBar() {
        return getPage().findElement(By.className("search-input__field"));
    }

    private WebElement getItemsTab() {
        return getPage().findElement(By.id("marmita-tab1-1"));
    }

    public void accessMainPage() {
        WebElement redirectLink = this.getBannerImage();
        redirectLink.click();
    }

    public void clickToSetAddress() {
        WebElement addressButton = this.getAddressButton();
        addressButton.click();
    }

    public void search(String query) {
        WebElement searchBar = this.getSearchBar();
        searchBar.clear();
        searchBar.sendKeys(query);
        searchBar.submit();
    }

    public void selectItemsTab() {
        WebElement items = this.getItemsTab();
        items.click();
    }

    public void maximizeWindow() {
        getPage().manage().window().maximize();
    }

    public void wait(int delay) {
        getPage().manage().timeouts().implicitlyWait(Duration.ofSeconds(delay));
    }
}
