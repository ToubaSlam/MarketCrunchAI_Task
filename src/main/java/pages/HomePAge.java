package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class HomePAge {
    private final WebDriver driver;

    public HomePAge(WebDriver driver) {
        this.driver = driver;
    }

    private final By PRODUCT_BUTTON = By.xpath("//a[@class='landing-tab'][normalize-space()='Product']");

    public HomePAge clickOnProductButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(PRODUCT_BUTTON));
        } catch (TimeoutException exception) {
            fail("Logo element not clickable on Home page");
        }
        driver.findElement(PRODUCT_BUTTON).click();
        Thread.sleep(2000);
        return this;
    }
}
