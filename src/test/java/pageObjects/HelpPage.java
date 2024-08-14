package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

    private WebDriver driver;
    public HelpPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getIncludeText(){
        return driver.findElement(By.xpath("//*[@class='text-content']"));
    }

    public void textFromIncludeText(){
        System.out.println(getIncludeText().getText());
    }




}
