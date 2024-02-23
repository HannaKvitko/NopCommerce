import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pages_505_506 extends Methods_505_506 {
    public Pages_505_506() {
        PageFactory.initElements(DriverClass_US505_506.getDriver(),this);
    }

   // @FindBy(xpath = "(//ul[@class='top-menu notmobile']//ul)[1]//a")
   // public List<WebElement> computerList;
    @FindBy(xpath ="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    public WebElement computers;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    public WebElement noteBooks;

    @FindBy(xpath = "//a[@title='List']")
    public WebElement viewModeList;
    @FindBy(xpath = "//input[@id='small-searchterms']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;


    // 506

    @FindBy(xpath = "(//a[normalize-space()='Gift Cards'])[1]")
    public  WebElement giftCardsButton;


    @FindBy(xpath = "//a[text()='product-title']//a")
    public List<WebElement> giftList ;



    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'$25 Virtual Gift Card')]")
    public WebElement physicalGifCard25 ;

    //a[contains(text(),'$25 Virtual Gift Card')])[2]
}
//h2[@class='product-title']//a