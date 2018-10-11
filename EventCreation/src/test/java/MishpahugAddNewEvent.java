package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MishpahugAddNewEvent {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMishpahugAddNewEvent() throws Exception {
    driver.get("https://mish.sheygam.com/#/add-event");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='More'])[5]/following::img[1]")).click();
    driver.findElement(By.id("mat-input-58")).click();
    driver.findElement(By.id("mat-input-58")).clear();
    driver.findElement(By.id("mat-input-58")).sendKeys("new");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Event'])[1]/following::div[11]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Event'])[1]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::span[1]")).click();
    driver.findElement(By.id("addressInput")).click();
    driver.findElement(By.id("addressInput")).clear();
    driver.findElement(By.id("addressInput")).sendKeys("70 Allenby");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From:'])[1]/following::mat-icon[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='OCT'])[1]/following::div[14]")).click();
    driver.findElement(By.id("mat-input-61")).click();
    driver.findElement(By.id("mat-input-62")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='To:'])[1]/following::mat-icon[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='OCT'])[1]/following::div[14]")).click();
    driver.findElement(By.id("mat-input-63")).click();
    driver.findElement(By.id("mat-input-61")).click();
    driver.findElement(By.id("mat-input-61")).clear();
    driver.findElement(By.id("mat-input-61")).sendKeys("18:00");
    driver.findElement(By.id("mat-input-63")).click();
    driver.findElement(By.id("mat-input-63")).clear();
    driver.findElement(By.id("mat-input-63")).sendKeys("21:00");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time:'])[2]/following::div[6]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Irreligious'])[1]/following::div[12]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Kosher'])[1]/following::div[10]")).click();
    driver.findElement(By.id("mat-input-64")).clear();
    driver.findElement(By.id("mat-input-64")).sendKeys("welcome");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Event'])[1]/following::div[15]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Purim'])[1]/following::span[1]")).click();
  }

  @AfterClass(alwaysRun = true)
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
