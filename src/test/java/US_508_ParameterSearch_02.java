
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class US_508_ParameterSearch_02 {

        private WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demo.nopcommerce.com/");
        }

        @Test
        public void testParameterSearch() {
            WebElement searchBox = driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"));
            searchBox.sendKeys("Adobe Photoshop CS4");
            searchBox.submit();



            WebElement productTitleElement = driver.findElement(By.xpath("//div[@class='item-box']//h2[@class='product-title']/a"));
            String productTitle = productTitleElement.getText();
            System.out.println("Product Title: " + productTitle);


            Assert.assertTrue(productTitle.contains("Adobe Photoshop CS4"), "Product title does not contain the search term.");
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }


