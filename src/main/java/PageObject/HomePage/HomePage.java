package PageObject.HomePage;

import Generic.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Helper {

    private static final String PAGE_TITLE = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
    private static final By HEADER_MENUITEM = By.cssSelector("._37M3Pb>div");

    private static final By CATEGORY_MENUITEM = By.cssSelector("._3YgSsQ");


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getPartialPageTitle() {
        return PAGE_TITLE;
    }

    public List<String> getListOfHeaderMenuItems() {
        return super.getListOfMenuItems(HEADER_MENUITEM);
    }

    public List<String> getListOfCategoryMenuItems() {
        return super.getListOfMenuItems(CATEGORY_MENUITEM);
    }
}
