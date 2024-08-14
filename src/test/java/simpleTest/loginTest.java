package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20,200);

    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test
    public void googleTest(){

        String searchWord = "Java";

        driver.get("https://google.com");

        By searchLocator = new By.ByCssSelector(".gLFyf");
        WebElement search = driver.findElement(searchLocator);

        search.sendKeys(searchWord);

        search.sendKeys(Keys.ENTER);

        System.out.println("start search textJava");

        By textJava = By.xpath("//*[contains(text(),'Java | Oracle')]");
        WebElement text = driver.findElement(textJava);

        wait.until(ExpectedConditions.visibilityOf(text));

        System.out.println("text java founded");

        System.out.println(text.getText());

        Assert.assertEquals(text.getText(), "Java | Oracle");

    }


    @Test
    public void ifDisplayed(){

        String url = "https://www.drive2.ru/";
        String textMustBe = "Человеческие ответы на автомобильные вопросы";

        driver.get(url);

        By textLocator = new By.ByCssSelector(".c-index-title");
        WebElement text = driver.findElement(textLocator);

        Assert.assertEquals(text.getText(), textMustBe);

    }

    @Test
    public void googleTestSupportPage() throws InterruptedException {

        driver.get("https://www.google.com/");

        By aboutLocator = By.xpath("(//*[@class='pHiOh'])[1]");
        WebElement about = driver.findElement(aboutLocator);

        about.click();

        By windowLocator = By.xpath("//*[@class='glue-footer__logo-img']");
        WebElement window = driver.findElement(windowLocator);

        Assert.assertTrue(window.isDisplayed());
    }

}
