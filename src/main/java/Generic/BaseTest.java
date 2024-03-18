package Generic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class BaseTest {
    protected static WebDriver driver;
    ChromeOptions chromeOptions;
    protected WebDriverWait webDriverWait;
    protected List<String> failedTests = new ArrayList<>();
    protected Logger log = Logger.getLogger(String.valueOf(BaseTest.class));

    @BeforeClass(alwaysRun = true)
    public void setUp(ITestContext ctx) {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();

        log.info("before class");
        Reporter.log("Execution started");
        //log = Logger.getLogger(ctx.getCurrentXmlTest().getName());
        //log.info("opening Chrome browser");
        driver = new ChromeDriver(chromeOptions);
    }
    public void OpenUrl(String url) {
        driver.get(url);
        //webDriverWait=new WebDriverWait(driver, 40);
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        log.info("After method");
        if (result.getStatus() == ITestResult.FAILURE) {
            // Add failed test to the list of failed tests
            String methodName = result.getMethod().getMethodName();
            log.info("taking screenshot");
            UtilityClass.getScreenShot(driver, methodName);


        }
        /*}
        // Check if all the scheduled test methods have been executed
        ITestContext context = result.getTestContext();
        ITestNGMethod[] allTestMethods = context.getAllTestMethods();
        List<String> executedTestMethods = new ArrayList<>();
        for (ITestNGMethod testMethod : allTestMethods) {
            if (context.getFailedTests().getResults(testMethod).isEmpty()) {
                executedTestMethods.add(testMethod.getMethodName());
            }
        }
        if (executedTestMethods.size() == allTestMethods.length) {
            // Quit the WebDriver instance if all the tests have been executed
            driver.quit();

            // Take screenshots for all failed tests
            for (String methodName : failedTests) {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source = ts.getScreenshotAs(OutputType.FILE);
                String fileName = methodName + ".png";
                FileUtils.copyFile(source, new File(fileName));
                System.out.println("Screenshot taken: " + fileName);
            }
        }*/

    }


    public static void refresh() {
        driver.navigate().refresh();
    }
}
