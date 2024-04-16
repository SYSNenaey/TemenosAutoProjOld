package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomeMenuNav {
    private static WebDriver cdriver = WebDriverFactory.getDriver();

    public static void MenuCreateIndCustomer ()
    {
    WebElement frameElement2 = cdriver.findElements(By.tagName("frame")).get(1);
        cdriver.switchTo().frame(frameElement2);
    WebElement usermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > span"));
        usermenuarrow.click();
        WebElement customermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > ul > li:nth-child(2) > span"));
        customermenuarrow.click();
}

    public static void MenuAuthorizeCustomer ()
    {

    }

}