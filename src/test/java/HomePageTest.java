import Generic.BaseTest;
import PageObject.HomePage.HomePage;
import org.asynchttpclient.util.Assertions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends BaseTest {

//Open Myntra
    //Verify Myntra is Opened
    //Hover On Profile Icon
    // Click On Login/Signup Button
    //Login Screen will Open
    // ENter the Mobile no. 8340420757
    //Click On Continue
    //click on Login using Password
    //Enter the Password Myntra@00
    //Click on Continue

    private HomePage homePage;

    @BeforeClass
    public void Setup() {
        homePage = new HomePage(driver);
        log.info("before Class in Test class");
    }

    @Test
    public void testHomePage() {
        log.info("Main test execution");
        OpenUrl("https://www.flipkart.com/");
        homePage.switchToPage();
        refresh();

        // Verify all the header menu List in Home page
        List<String> listOfMenuItems = homePage.getListOfHeaderMenuItems();

        Assert.assertTrue(listOfMenuItems.contains("Grocery"), "Grocery Not found on the list");
        Assert.assertTrue(listOfMenuItems.contains("Mobiles"), "Mobiles Not found on the list");
        Assert.assertTrue(listOfMenuItems.contains("Fashion"), "Fashion Not found on the list");
        Assert.assertTrue(listOfMenuItems.contains("Home"), "Home Not found on the list");

        // Verify all the header menu List in Home page
        List<String> listOfCategoryMenuItems = homePage.getListOfCategoryMenuItems();

        Assert.assertTrue(listOfCategoryMenuItems.contains("Soft Toys"), "Soft Toys Not found on the list");



    }

    @Test
    public void testJome2() {
        log.info("Main test execution method 2");
        driver.close();
    }

}


