package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P04_MostViewd {

    private final WebDriver driver;

    public P04_MostViewd(WebDriver driver) {
        this.driver = driver;
    }

    private final By MOST_VIEWED_BTN = By.xpath("//button[normalize-space()='Most Viewed']");
    private final By HOMEPAGE_LOGO = By.xpath("//div[@class='brand-main']");

    public P04_MostViewd clickMostViewedButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(MOST_VIEWED_BTN));
        } catch (TimeoutException exception) {
            fail("Logo element not clickable on Home page");
        }
        driver.findElement(MOST_VIEWED_BTN).click();
        Thread.sleep(2000);
        return this;
    }
    public P04_MostViewd clickOnHomePageButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(HOMEPAGE_LOGO));
        } catch (TimeoutException exception) {
            fail("Logo element not clickable on Home page");
        }
        driver.findElement(HOMEPAGE_LOGO).click();
        Thread.sleep(2000);
        return this;
    }

}






