import org.openqa.selenium.WebDriver;


public class CartPage
{
    WebDriver driver;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goToCheckout()
    {
        driver.findElement(SelectorsPage.Cart.CHECKOUT_BUTTON).click();
    }
}