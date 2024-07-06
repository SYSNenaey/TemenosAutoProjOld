package TemenosHelperPages.Customers.IndCustomer;

import TemenosHelperPages.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizeIndCustomer {
    private static WebDriver cdriver = WebDriverFactory.getDriver();

    public static void AuthorizeIndCustomer() {
        WebElement authorizecustomermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > ul > li:nth-child(2) > ul > li:nth-child(12) > a"));
        authorizecustomermenuarrow.click();
    }
}
