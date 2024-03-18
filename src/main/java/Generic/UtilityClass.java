package Generic;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class UtilityClass {

    public static String getProperty(String path, String key) {
        String v = "";

        try {
            Properties p = new Properties();
            p.load(new FileInputStream(path));
            v = p.getProperty(key);
        } catch (Exception var4) {
        }

        return v;
    }

    public static int getRowCount(String path, String sheet) {
        int rc = 0;

        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(path));
            rc = wb.getSheet(sheet).getLastRowNum();
        } catch (Exception var4) {
        }

        return rc;
    }

    public static String getCellValue(String path, String sheet, int r, int c) {
        String s = "";

        try {
            Workbook wb = WorkbookFactory.create(new FileInputStream(path));
            s = wb.getSheet(sheet).getRow(r).getCell(c).toString();
            wb.close();
        } catch (Exception var6) {
        }

        return s;
    }

    public static void getScreenShot(WebDriver driver, String methodName) {
        Reporter.log("taking screenshot");
        String dateTime = (new Date()).toString().replaceAll(":", "_");
        TakesScreenshot t = (TakesScreenshot) driver;
        File srcFile = t.getScreenshotAs(OutputType.FILE);

        String destFile =  "C:\\Users\\rahul.chaudhary\\RahulAutomation\\Automation\\src\\main\\resources\\Screenshot\\"+methodName + dateTime + ".jpeg";

        try {
            FileUtils.copyFile(srcFile, new File(destFile));
            System.setProperty("org.uncommons.reportng.escape-output","false");
            Reporter.log("<img src=\"C:\\Users\\rahul.chaudhary\\RahulAutomation\\Automation\\src\\main\\resources\\Screenshot\\"+methodName + dateTime +".jpeg\"/>");

        } catch (IOException var8) {
        }

    }
}


