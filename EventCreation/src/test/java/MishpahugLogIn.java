import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MishpahugLogIn extends TestBase {


    @Test
    public void testMishpahug() throws Exception {

        initCreateEvent();
        fillEventName();
        selectHoliday();
        fillAddress();
        choseDate();




    }

    private void choseDate() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From:'])[1]/following::mat-icon[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='OCT'])[1]/following::div[14]")).click();
    }

    private void fillAddress() {
        driver.findElement(By.id("addressInput")).click();
        driver.findElement(By.id("addressInput")).clear();
        driver.findElement(By.id("addressInput")).sendKeys("70 Allenby Street, Tel Aviv-Yafo, Israel");
        driver.findElement(By.id("addressInput")).sendKeys(Keys.ENTER);
    }

    private void selectHoliday() {
        new Select (driver.findElement(By.xpath(//mat-select[@id='mat-select-37']//div[@class='mat-select-value']).
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Event'])[1]/following::span[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::span[1]")).click();


    }

    private void fillEventName() {
        driver.findElement(By.id("mat-input-44")).click();
        driver.findElement(By.id("mat-input-44")).clear();
        driver.findElement(By.id("mat-input-44")).sendKeys("newEventCreation");
    }

    private void initCreateEvent() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Event'])[1]/following::div[5]")).click();
    }


}
