package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public abstract class Helper extends BasePageObject<Helper> {


    protected Helper(WebDriver driver) {
        super(driver);
    }

    protected abstract String getPartialPageTitle();

    public boolean isPageTitleMatches() {
        return driver.getTitle().equals(getPartialPageTitle());
    }

    public void switchToPage() {
        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            WebDriver window = driver.switchTo().window(handle);
            if (window.getTitle().equals(getPartialPageTitle())) {
                driver.manage().window().setSize(new Dimension(1440, 900));
            }
        }
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public void setTextBox(By locator, String text) {
        findElement(locator).sendKeys(text);
    }
}
