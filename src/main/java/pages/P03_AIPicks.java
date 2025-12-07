package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P03_AIPicks {

    private final WebDriver driver;

    public P03_AIPicks(WebDriver driver) {
        this.driver = driver;
    }

    private final By AI_PICKS_BTN = By.xpath("//button[@class='active-tab']");

    public P03_AIPicks clickAIPicks() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(AI_PICKS_BTN));
        } catch (TimeoutException exception) {
            fail("Logo element not clickable on Home page");
        }
        driver.findElement(AI_PICKS_BTN).click();
        Thread.sleep(2000);
        return this;
    }


}






