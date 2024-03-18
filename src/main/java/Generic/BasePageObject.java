package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BasePageObject<T> {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;

    protected BasePageObject(WebDriver driver) {
        this.driver = driver;
        // webDriverWait=new WebDriverWait(driver,Duration.ofSeconds(40));
    }
    public WebElement findElement(By element) {
        return driver.findElement(element);
    }


    public List<WebElement> findElements(By element) {
        return driver.findElements(element);
    }



    public void waitForPage() {
        int attempts = 0;
        while (attempts < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")), 200);

            } catch (Exception e) {

            }
        }
    }

    public void waitFor(ExpectedCondition<WebElement> conditions, Integer timeOutSeconds) {
        timeOutSeconds = timeOutSeconds != null ? timeOutSeconds : 30;
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds));
        webDriverWait.until(conditions);
    }



    public List<String> getListOfMenuItems(By element) {

        List<WebElement> headerMenuItems = findElements(element);

        List<String> menuItemsList = new LinkedList<>();
        for (WebElement elemnt : headerMenuItems) {
            menuItemsList.add(elemnt.getText());

        }
        return menuItemsList;
    }
}
