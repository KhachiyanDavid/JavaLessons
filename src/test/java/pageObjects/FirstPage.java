package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FirstPage {

    private WebDriver driver;

    public FirstPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//*[@type='search']"));
    }

    public WebElement getSearchBTN(){
        return  driver.findElement(By.xpath("//*[@type='submit']"));
    }

    public SearchedPage search(String text){
        getSearchField().sendKeys(text);
        getSearchBTN().click();
        return new SearchedPage(driver);
    }

    public void open(String url){
        driver.get(url);
    }

}
