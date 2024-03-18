package PageObject;

import Generic.BasePageObject;
import Generic.Helper;
import PageObject.HomePage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayPalHomePage  extends Helper {

    private static final By Login=By.cssSelector("div#_header-buttons_dp4vo_1133 a#_ul-btn_dp4vo_1316");
    private static final By EmailTextBox=By.cssSelector("input#email");
    private static final By PasswordTextBox=By.cssSelector("input#password");
    private static final By Login_Button=By.cssSelector("button#btnLogin");

    public PayPalHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginButtonOnHeader()
    {
        findElement(Login);
    }


    public void setEmailTextBox(String email)
    {
        setTextBox(EmailTextBox,email);
    }

    public void setPasswordTextBox(String password)
    {
        setTextBox(EmailTextBox,password);
    }

    public void clickLoginButtonToSubmit()
    {
        findElement(Login_Button);
    }

    @Override
    protected String getPartialPageTitle() {
        return null;
    }
}
