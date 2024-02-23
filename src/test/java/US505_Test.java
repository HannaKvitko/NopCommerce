import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US505_Test {
    Pages_505_506 pages = new Pages_505_506();

    @Test
    public void controlOfProducts() {

        DriverClass_US505_506.getDriver().get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(DriverClass_US505_506.getDriver());
        actions.moveToElement(pages.computers).build().perform();
        pages.clickMethod(pages.noteBooks);
        pages.clickMethod(pages.viewModeList);
        actions.moveToElement(pages.searchTextBox).build().perform();
        pages.sendKeysMethod(pages.searchTextBox,"HP Spectre XT Pro UltraBook ");
        pages.clickMethod(pages.searchButton);



//actions.click(pages.noteBooks).build().perform();

    }
}

