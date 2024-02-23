import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class US_506_Test {
    Pages_505_506 pages = new Pages_505_506();

    @Test
    public void giftOption() {
        DriverClass_US505_506.getDriver().get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(DriverClass_US505_506.getDriver());
        pages.clickMethod(pages.giftCardsButton);
        pages.clickMethod(pages.viewModeList);
      Random random = new Random();
        for (int i = 0; i < pages.giftList.size(); i++) {
           int listSize = pages.giftList.size();
            int randomIndex = random.nextInt(listSize);
            pages.clickMethod(pages.giftList.get(i));





        }

    }
}






