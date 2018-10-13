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
        //choseDateBegin();
        //choseDateEnd();
       // choseTimeBegin();
       // choseTimeEnd();
        choseConfession();
        choseKitchen();
        fillWordsAboutEvent();
        saveEvent();


    }

    private void saveEvent() {
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    private void fillWordsAboutEvent() {
        driver.findElement(By.cssSelector("[formcontrolname='description']")).click();
        driver.findElement(By.cssSelector("[formcontrolname='description']")).clear();
        driver.findElement(By.cssSelector("[formcontrolname='description']")).sendKeys("welcome");

    }

    private void choseKitchen() {
        driver.findElement(By.cssSelector("[formcontrolname='food']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Kosher')]")).click();
    }

    private void choseConfession() {
        driver.findElement(By.cssSelector("[formcontrolname='confession']")).click();
        driver.findElement(By.xpath("//span[@class='mat-option-text'][contains(text(),'Irreligious')]")).click();
    }

    private void choseTimeEnd() {
        driver.findElement(By.cssSelector("[formcontrolname='timeOfEnd']")).click();
        driver.findElement(By.cssSelector("[formcontrolname='timeOfEnd']")).clear();
        driver.findElement(By.cssSelector("[formcontrolname='timeOfEnd']")).sendKeys("2000");
    }

    private void choseTimeBegin() {
        driver.findElement(By.cssSelector("[formcontrolname='timeOfStart']")).click();
        driver.findElement(By.cssSelector("[formcontrolname='timeOfStart']")).clear();
        driver.findElement(By.cssSelector("[formcontrolname='timeOfStart']")).sendKeys("1800");

    }

    private void choseDateBegin() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From:'])[1]/following::mat-icon[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='OCT'])[1]/following::div[14]")).click();
    }

    private void fillAddress() {
        driver.findElement(By.xpath("//input[@id='addressInput']")).click();
        driver.findElement(By.xpath("//input[@id='addressInput']")).clear();
        driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys("Allenby Street 70, Tel Aviv-Yafo, Israel");
       // driver.findElement(By.cssSelector("[placeholder='Address']")).sendKeys(Keys.ENTER);
    }
    private void selectHoliday() {
      /*  WebElement element = driver.findElement(By.cssSelector("[formcontrolname=\"holiday\"]"));
        Select oSelect = new Select(element);
        oSelect.selectByVisibleText("Shabbat");*/
     //   new Select(driver.findElement(By.cssSelector("[formcontrolname='holiday']"))).selectByVisibleText("Shabat");
        driver.findElement(By.cssSelector("[formcontrolname='holiday']")).click();
    }
    private void fillEventName() {
        driver.findElement(By.cssSelector("[formcontrolname=\"title\"]")).click();
        driver.findElement(By.cssSelector("[formcontrolname=\"title\"]")).clear();
        driver.findElement(By.cssSelector("[formcontrolname=\"title\"]")).sendKeys("newEventCreation");
    }

    private void initCreateEvent() {
        driver.findElement(By.cssSelector("[mattooltip='Add new Event']")).click();
    }


}
