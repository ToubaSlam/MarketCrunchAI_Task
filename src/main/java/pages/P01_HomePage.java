package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.fail;
import static pages.PageBase.shortWait;

public class P01_HomePage {

    private final WebDriver driver;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By LOGO_VERIFY = By.xpath("//h3[@class='logo-desktop']");
    private final By PRODUCT = By.xpath("//a[@class='landing-tab'][normalize-space()='Product']");
    private final By HOW_IT_WORKS = By.xpath("//a[@class='landing-tab'][normalize-space()='How It Works']");
    private final By CASE_STUDY = By.xpath("//a[@class='landing-tab'][normalize-space()='Case Study']");
    private final By TESTIMONIALS = By.xpath("//a[@class='landing-tab'][normalize-space()='Testimonials']");
    private final By TEAM = By.xpath("//a[@class='landing-tab'][normalize-space()='Team']");
    private final By BLOG = By.xpath("//a[@class='landing-tab'][normalize-space()='Blog']");
    private final By FREE_LOGIN = By.xpath("//button[@class='signin-button']");
    private final By SEARCH_TEXTBOX = By.xpath("//input[@placeholder='Try Tesla, AAPL, GLD']");
    private final By TRY_IT_FREE_BTN = By.xpath("//button[@class='landing-search-button']                                                                                                                                                                                                                                                                                ");


    public String getLogoText() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(LOGO_VERIFY));
        } catch (TimeoutException exception) {
            fail("Logo element not found on Home page");
        }
        return driver.findElement(LOGO_VERIFY).getText().trim();
    }

    // instance method: is logo displayed?
    public boolean isLogoDisplayed() {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(LOGO_VERIFY));
            return driver.findElement(LOGO_VERIFY).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public P01_HomePage clickHomePageLogo() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(LOGO_VERIFY));
        } catch (TimeoutException exception) {
            fail("Logo element not clickable on Home page");
        }
        driver.findElement(LOGO_VERIFY).click();
        Thread.sleep(2000);
        return this;
    }

    // --------- Header navigation clicks ---------

    public P01_HomePage clickProductButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(PRODUCT));
        } catch (TimeoutException exception) {
            fail("Product tab not found on Home page");
        }
        driver.findElement(PRODUCT).click();
        Thread.sleep(2000);
        return this;
    }

    public P01_HomePage clickHowItWorksButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(HOW_IT_WORKS));
        } catch (TimeoutException exception) {
            fail("How It Works tab not found on Home page");
        }
        driver.findElement(HOW_IT_WORKS).click();
        Thread.sleep(2000);
        return this;
    }

    public P01_HomePage clickCaseStudyButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(CASE_STUDY));
        } catch (TimeoutException exception) {
            fail("Case Study tab not found on Home page");
        }
        driver.findElement(CASE_STUDY).click();
        Thread.sleep(2000);
        return this;
    }

    public P01_HomePage clickTestimonialsButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(TESTIMONIALS));
        } catch (TimeoutException exception) {
            fail("Testimonials tab not found on Home page");
        }
        driver.findElement(TESTIMONIALS).click();
        Thread.sleep(2000);
        return this;
    }

    public P01_HomePage clickTeamButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(TEAM));
        } catch (TimeoutException exception) {
            fail("Team tab not found on Home page");
        }
        driver.findElement(TEAM).click();
        Thread.sleep(2000);
        return this;
    }

    public P01_HomePage clickBlogButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(BLOG));
        } catch (TimeoutException exception) {
            fail("Blog tab not found on Home page");
        }
        driver.findElement(BLOG).click();
        Thread.sleep(2000);
        return this;
    }

    // --------- Login button ---------

    public P01_HomePage clickLoginButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(FREE_LOGIN));
        } catch (TimeoutException exception) {
            fail("Free Login button not found on Home page");
        }
        driver.findElement(FREE_LOGIN).click();
        Thread.sleep(2000);
        return this;
    }

    // --------- Search + Try it free ---------

    public P01_HomePage searchCompanyName(String text) throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(SEARCH_TEXTBOX));
        } catch (TimeoutException exception) {
            fail("Search textbox not found on Home page");
        }
        driver.findElement(SEARCH_TEXTBOX).clear();
        driver.findElement(SEARCH_TEXTBOX).sendKeys(text);
        Thread.sleep(2000);
        return this;
    }

    public P01_HomePage clickSearchButton() throws InterruptedException {
        try {
            shortWait(driver).until(ExpectedConditions.elementToBeClickable(TRY_IT_FREE_BTN));
        } catch (TimeoutException exception) {
            fail("'Try It Free' button not found on Home page");
        }
        driver.findElement(TRY_IT_FREE_BTN).click();
        Thread.sleep(2000);
        return this;
    }
//    public P01_LoginPage Insert_UserNAME_TXT(String email) {
//        try {
//            shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(UserNAME_TXT));
//        } catch (TimeoutException exception) {
//            fail("Element not found");
//        }
//        driver.findElement(this.UserNAME_TXT).sendKeys(email);
//        return this;
//    }
//    public static String getLogoText() {
//        return driver.findElement(LOGO_VERIFY).getText().trim();
//    }
//    public static boolean isLogoDisplayed() {
//        return driver.findElement(LOGO_VERIFY).isDisplayed();
//    }
//    public P01_HomePage clickHomePageLogo() {
//        driver.findElement(this.LOGO_VERIFY).click();
//        return this;
//    }
//
//    public P01_HomePage clickProductButton() {
//        driver.findElement(this.PRODUCT).click();
//        return this;
//    }
//
//    public P01_HomePage clickHowItWorksButton() {
//        driver.findElement(this.HOW_IT_WORKS).click();
//        return this;
//    }
//    public P01_HomePage clickCaseStudyButton() {
//        driver.findElement(this.CASE_STUDY).click();
//        return this;
//    }
//    public P01_HomePage clickTestimonialsButton() {
//        driver.findElement(this.TESTIMONIALS).click();
//        return this;
//    }
//    public P01_HomePage clickTeamButton() {
//        driver.findElement(this.TEAM).click();
//        return this;
//    }
//    public P01_HomePage clickBolgButton() {
//        driver.findElement(this.BLOG).click();
//        return this;
//    }
//    public P01_HomePage clickLoginButton() {
//        driver.findElement(this.FREE_LOGIN).click();
//        return this;
//    }
//
//    public P01_HomePage searchCompanyName(String email) {
//        driver.findElement(this.SEARCH_TEXTBOX).sendKeys(email);
//        return this;
//    }
//    public P01_HomePage clickSearchButton() {
//        driver.findElement(this.TRY_IT_FREE_BTN).click();
//        return this;
//    }

}






