import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistration_Login_Page {
    public UserRegistration_Login_Page() {
        PageFactory.initElements(DriverClassAliye.getDriver(),this);
    }

    //------------US_401_Registration---------------------------
    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//input[@id='gender-female']")
    public WebElement femaleRadioButton;
    @FindBy(xpath = "//input[@id='FirstName']")
    public WebElement firstNameTextBox;
    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastNameTextBox;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    public WebElement dayList;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    public WebElement monthList;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    public WebElement yearList;
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailTextBox;
    @FindBy(xpath = "//input[@id='Company']")
    public WebElement company;
    @FindBy(xpath = "//input[@id='Newsletter']")
    public WebElement newsLetter;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passWordTextBox;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    public WebElement confirmPassWordTextBox;
    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement signUpRegisterButton;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement registrationMessage;
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    public WebElement continueButton;

    //------------US_402_Login---------------------------

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    public WebElement loginButtonHomePage;
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailTextBoxLogin;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passWordTextBoxLogin;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement myAccount;
}
