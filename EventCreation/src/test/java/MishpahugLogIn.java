import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MishpahugLogIn extends TestBase {


    @Test
    public void testMishpahug() throws Exception {
        initCreateEvent();
        fillEventName();
        selectHoliday();
        fillAddress();
        choseDateBegin();
       /* choseDateEnd();
        choseTimeBegin();
        choseTimeEnd();
        choseConfession();
        choseKitchen();
*/

    }
    private void selectHoliday() {
        WebElement element = driver.findElement(By.xpath("//mat-select[@id='mat-select-5']"));
        Select oSelect = new Select(element);
        oSelect.selectByVisibleText("Shabbat");
      //  new Select(driver.findElement(By.xpath("//mat-select[@id='mat-select-5']").selectByVisibleText("Shabat")));
    }
    private void choseDateBegin() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From:'])[1]/following::mat-icon[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='OCT'])[1]/following::div[14]")).click();
    }

    private void fillAddress() {
        driver.findElement(By.id("addressInput")).click();
        driver.findElement(By.id("addressInput")).clear();
        driver.findElement(By.id("addressInput")).sendKeys("70 Allenby Street, Tel Aviv-Yafo, Israel");
        driver.findElement(By.id("addressInput")).sendKeys(Keys.ENTER);
    }

    private void fillEventName() {
        driver.findElement(By.xpath("//input[@id='mat-input-7']")).click();
        driver.findElement(By.xpath("//input[@id='mat-input-7']")).clear();
        driver.findElement(By.xpath("//input[@id='mat-input-7']")).sendKeys("newEventCreation");
    }

    private void initCreateEvent() {
        driver.findElement(By.cssSelector("[mattooltip='Add new Event']")).click();
    }


}
