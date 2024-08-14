package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {

    private WebDriver driver;

    public FirstPage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement getSearchField(){
        return driver.findElement(By.xpath("//*[@type='search']"));
    }

    private WebElement getSearchBTN(){
        return  driver.findElement(By.xpath("//*[@type='submit']"));
    }

    public WebElement getHelp(){
        return driver.findElement(By.xpath("(//*[@class='c-link c-link--current'])[1]"));
    }

    public SearchedPage search(String text){
        getSearchField().sendKeys(text);
        getSearchBTN().click();
        return new SearchedPage(driver);
    }

    public void open(String url){
        driver.get(url);
    }
    public HelpPage clickHelp(){
        getHelp().click();
        return new HelpPage(driver);
    }

}
