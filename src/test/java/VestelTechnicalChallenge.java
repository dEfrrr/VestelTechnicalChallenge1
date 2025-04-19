import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class VestelTechnicalChallenge {

    WebDriver driver;

    SelectorsPage selectors;

    LoginPage loginPage;

    InventoryPage inventory;

    CartPage cart;

    CheckoutPage checkoutPage;

    String page_Link = "https://www.saucedemo.com";

    String product_name = "Test.allTheThings() T-Shirt (Red)";


    @BeforeMethod
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        selectors = new SelectorsPage();
        loginPage = new LoginPage(driver, selectors);
        inventory = new InventoryPage(driver);
        checkoutPage = new CheckoutPage(driver, selectors);
        cart = new CartPage(driver);
    }

    @Test
    public void vestelTechnicalChallenge() {
        driver.get(page_Link);
        loginPage.loginProcess();
        inventory.addToCartItem(product_name);
        inventory.goToCart();
        String cartProductText = driver.findElement(SelectorsPage.Cart.CART_ITEMS).getText();
        Assert.assertTrue(cartProductText.contains(product_name), "Product not found in cart!");
        cart.goToCheckout();
        checkoutPage.continueCheckout();
        String checkoutProductText = driver.findElement((SelectorsPage.Cart.CART_ITEMS)).getText();
        Assert.assertTrue(checkoutProductText.contains(product_name), "Product not found on checkout page!");
        loginPage.logoutProcess();
    }


    @AfterMethod
    public void TearDown() {
        driver.quit();
    }
}