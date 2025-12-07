package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P02_Stocks {

    private final WebDriver driver;

    public P02_Stocks(WebDriver driver) {
        this.driver = driver;
    }

    private final By LOGO_VERIFY = By.xpath("//h3[@class='logo-desktop']");
    public String getLogoText() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(LOGO_VERIFY));
        } catch (TimeoutException exception) {
            fail("Logo element not found on Home page");
        }
        return driver.findElement(LOGO_VERIFY).getText().trim();
    }

}






