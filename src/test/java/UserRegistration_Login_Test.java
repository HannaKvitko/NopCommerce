import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserRegistration_Login_Test {
    UserRegistration_Login_Page page = new UserRegistration_Login_Page();

    @BeforeMethod
    public void setUp(){
        DriverClassAliye.getDriver().get("https://demo.nopcommerce.com");
    }
    @Test
    public void aUserRegistration(){
        //------------US_401_Registration---------------------------
        page.registerButton.click();
        page.femaleRadioButton.click();
        page.firstNameTextBox.sendKeys("julia");
        page.lastNameTextBox.sendKeys("roberts");
        DriverClassAliye.waitInSeconds(2);
        DriverClassAliye.selectByVisibleText(page.dayList, "24");
        DriverClassAliye.waitInSeconds(1);
        DriverClassAliye.selectByVisibleText(page.monthList,"November");
        DriverClassAliye.waitInSeconds(2);
        DriverClassAliye.selectByVisibleText(page.yearList,"1990");
        DriverClassAliye.waitInSeconds(1);
        page.emailTextBox.sendKeys("julia3@roberts.com");
        DriverClassAliye.waitInSeconds(2);
        page.company.sendKeys("TechnoStudy");
        DriverClassAliye.waitInSeconds(1);
        page.newsLetter.click();
        DriverClassAliye.waitInSeconds(2);
        page.passWordTextBox.sendKeys("julia123");
        page.confirmPassWordTextBox.sendKeys("julia123");
        DriverClassAliye.waitInSeconds(1);
        page.signUpRegisterButton.click();
        DriverClassAliye.waitInSeconds(2);
        Assert.assertTrue(page.registrationMessage.isDisplayed());
        page.continueButton.click();
        }

    //------------US_402_Login---------------------------
    @Test
    public void login(){
        page.loginButtonHomePage.click();
        DriverClassAliye.waitInSeconds(1);
        page.emailTextBoxLogin.sendKeys("julia3@roberts.com");
        DriverClassAliye.waitInSeconds(1);
        page.passWordTextBoxLogin.sendKeys("julia123");
        DriverClassAliye.waitInSeconds(1);
        page.loginButton.click();
        //System.out.println(page.myAccount.getText());
        Assert.assertTrue(page.myAccount.isDisplayed());
        DriverClassAliye.waitInSeconds(1);
    }

    @AfterClass
    public void tearDown(){
            DriverClassAliye.closeDriver();
    }
}

