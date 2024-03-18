import Generic.BaseTest;
import PageObject.PayPalHomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PayPalLoginTest extends BaseTest {
    private static final String Email = "jaiswalrahulkr@gmail.com";
    private static final String PASSWORD = "jaiswalrahulkr@gmail.com";
    private PayPalHomePage payPalHomePage;

    @BeforeClass
    public void setUp() {
        payPalHomePage = new PayPalHomePage(driver);
        OpenUrl("https://www.paypal.com/in/");
    }

    @Test
    public void payPalLoginTest() {
        payPalHomePage.clickLoginButtonOnHeader();
        payPalHomePage.setEmailTextBox(Email);
        payPalHomePage.setEmailTextBox(PASSWORD);
        payPalHomePage.clickLoginButtonToSubmit();

    }
}
