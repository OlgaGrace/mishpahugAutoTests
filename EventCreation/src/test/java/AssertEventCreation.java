
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class AssertEventCreation extends TestBase{

    @Test

    public void AssertEventCreation() throws Exception{

        openMenu();
        openMyEvents();
    }

    private void openMyEvents() {
        driver.findElement(By.xpath("//span[contains(text(),'My events')]")).click();
    }

    private void openMenu() {
        driver.findElement(By.cssSelector("[mattooltip='Menu']")).click();
        // driver.findElement(By.cssSelector(".mat-icon-button")).click();
    }

}
