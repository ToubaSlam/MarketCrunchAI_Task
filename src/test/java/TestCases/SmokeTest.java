package TestCases;

import RetryAnalyser.MyRetry;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_AIPicks;
import pages.P04_MostViewd;
import pages.PageBase;

public class SmokeTest extends TestBase {

    // define test data
    String user = "islamtoba@gmail.com";
    String password = "P@ssw0rd";
    By byText = By.xpath("//li[contains(@class,'suggestion-item') and .//span[contains(normalize-space(.),'Apple iSports Group, Inc.')]]");

    // check login positive scenarios
    @Story("Home Page Logo")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Logo exist in Home Page")
    @Test(priority = 1, description = "Verify Logo exist in Home Page", retryAnalyzer = MyRetry.class, timeOut = 20000)
    public void Verify_Home_Page_P() {
        SoftAssert soft = new SoftAssert();
        // create the page object using the initialized driver
        P01_HomePage home = new P01_HomePage(driver);
        // call instance methods on the page object
        String logoText = home.getLogoText();
        // verify logo is visible
        soft.assertTrue(home.isLogoDisplayed(), "Logo should be displayed in the header");
        // verify text contains both main name and BETA
        soft.assertTrue(logoText.contains("MarketCrunch AI"),
                "Logo text should contain 'MarketCrunch AI' but was: " + logoText);
        soft.assertTrue(logoText.contains("BETA"),
                "Logo text should contain 'BETA' but was: " + logoText);
        soft.assertAll();
    }


    @Story("Main Functions")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Main Functions")
    @Test(priority = 2, description = "Test Main Functions",retryAnalyzer = MyRetry.class, timeOut = 50000)
    public void Try_all_Buttons() throws InterruptedException {
        new P01_HomePage(driver).clickProductButton();
        new P01_HomePage(driver).clickHowItWorksButton();
        new P01_HomePage(driver).clickCaseStudyButton();
        new P01_HomePage(driver).clickTestimonialsButton();
        new P01_HomePage(driver).clickTeamButton();
        new P01_HomePage(driver).clickBlogButton();
        new P01_HomePage(driver).clickHomePageLogo();
        new P01_HomePage(driver).searchCompanyName("Apple");
        PageBase page = new PageBase(driver);
        WebElement menu = driver.findElement(byText);
        page.hoverWebElement(driver, menu);
        new P01_HomePage(driver).clickSearchButton();
        new P03_AIPicks(driver).clickAIPicks();
        new P04_MostViewd(driver).clickMostViewedButton();
        new P04_MostViewd(driver).clickOnHomePageButton();

    }


}
