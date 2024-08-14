package pageObjectsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.FirstPage;
import pageObjects.HelpPage;
import pageObjects.SearchedPage;

public class Searching {

    private String url = "https://www.drive2.ru/";
    private WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void Search_Mercede_Ok(){
        FirstPage firstPage = new FirstPage(driver);
        firstPage.open(url);
        SearchedPage searchedPage = firstPage.search("Mercedes");
        Assert.assertTrue(searchedPage.isSearchedPageOpened());
    }
    @Test
    public void getHelp_click_opened(){
        FirstPage firstPage = new FirstPage(driver);
        firstPage.open(url);
        Actions action = new Actions(driver);
        action.moveToElement(firstPage.getHelp());
        action.perform();
        HelpPage helpPage = firstPage.clickHelp();
        helpPage.textFromIncludeText();

    }


}
