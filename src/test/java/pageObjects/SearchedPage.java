package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchedPage {
    private WebDriver driver;

    public SearchedPage(WebDriver driver){

        this.driver = driver;
    }

    public boolean isSearchedPageOpened(){
        By PoiskTextLocatro = By.xpath("//*[@class='x-title']");
        WebElement PoiskText = driver.findElement(PoiskTextLocatro);

        if(PoiskText.isDisplayed()){
            return true;
        } else return false;
    }


}
