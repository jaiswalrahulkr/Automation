package Practice;

import Generic.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestClass extends BaseTest {




    public void OpenUrl() {
        driver.get("https://www.myntra.com/");
        //driver.quit();
    }

    @Test(dependsOnMethods = "OpenUrl")
    public void CloseUrl() {
        driver.quit();
    }

}
