package TemenosHelperPages.MenuNav;

import TemenosHelperPages.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomeMenuNav {
    private static WebDriver cdriver = WebDriverFactory.getDriver();

    public static void MenuCreateIndCustomer ()
    {
    // Accesssing second frame in HP
        WebElement frameElement2 = cdriver.findElements(By.tagName("frame")).get(1);
        cdriver.switchTo().frame(frameElement2);
        // Locate Menu Items
    WebElement usermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > span"));
        usermenuarrow.click();
        // Open Customer Menu Item
        WebElement customermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > ul > li:nth-child(2) > span"));
        customermenuarrow.click();
}

    public static void MenuAuthorizeCustomer ()
    {
// Accesssing second frame in HP
        WebElement frameElement2 = cdriver.findElements(By.tagName("frame")).get(1);
        cdriver.switchTo().frame(frameElement2);
        // Locate Menu Items
        WebElement usermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > span"));
        usermenuarrow.click();
        WebElement customermenuarrow = cdriver.findElement(By.cssSelector("#pane_ > ul:nth-child(1) > li > ul > li:nth-child(2) > span"));
        customermenuarrow.click();
    }
    public static void MenuCreateCorp ()
    {

    }
}