package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Forever21111 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://addons.mozilla.org/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testForever21111() throws Exception {
        driver.get(baseUrl + "chrome://fastdial/content/fastdial.html");
        driver.findElement(By.cssSelector("#6 > div.thumbnail > a > div.body > img.image")).click();
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("http://www.forever21.com/");
        driver.findElement(By.linkText("Shop Forever 21 for the latest trends and the best deals ...")).click();
        driver.findElement(By.cssSelector("span.global_cat > a > em")).click();
        driver.findElement(By.cssSelector("#divSubSale_Desktop > ul > li.sale-women > div.sub_sub > ul > li.sale-women-dresses > span > a")).click();
        driver.findElement(By.cssSelector("dt")).click();
        driver.findElement(By.linkText("price low to high")).click();
        driver.findElement(By.id("image_2000203408")).click();
        driver.findElement(By.cssSelector("li > label")).click();
        driver.findElement(By.id("span_qty")).click();
        driver.findElement(By.linkText("qty : 2")).click();
        driver.findElement(By.id("addtobag")).click();
        driver.findElement(By.cssSelector("button.btn_viewbag.gray_bg")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
