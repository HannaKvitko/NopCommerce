import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class US_504_TabMenuControl {
    Pages_505_506 pages = new Pages_505_506();

    @Test
    public void createListOfElements(){
        DriverClass_US505_506.getDriver().get("https://demo.nopcommerce.com/");
        Actions actions = new Actions(DriverClass_US505_506.getDriver());
        actions.moveToElement(pages.computer).build().perform();

        for (int i = 0; i < pages.computerList.size(); i++) {
            pages.scrollToElement(pages.computer);
            actions.moveToElement(pages.computer).build().perform();
            pages.clickMethod(pages.computerList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < pages.electronicsList.size(); i++) {
            pages.scrollToElement(pages.electronics);
            actions.moveToElement(pages.electronics).build().perform();
            pages.clickMethod(pages.electronicsList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < pages.apparelList.size(); i++) {
            pages.scrollToElement(pages.apparel);
            actions.moveToElement(pages.apparel).build().perform();
            pages.clickMethod(pages.apparelList.get(i));

        }



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DriverClass_US505_506.quitDriver();

    }
}
