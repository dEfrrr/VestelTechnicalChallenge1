import org.openqa.selenium.WebDriver;

public class CheckoutPage
{
    SelectorsPage selectors;

    WebDriver driver;

    public CheckoutPage(WebDriver driver, SelectorsPage selectors)
    {
        this.driver = driver;
        this.selectors = selectors;
    }

    public void continueCheckout()
    {
        driver.findElement(SelectorsPage.Checkout.FIRST_NAME).sendKeys("Dimitar");
        driver.findElement(SelectorsPage.Checkout.LAST_NAME).sendKeys("Efremovski");
        driver.findElement(SelectorsPage.Checkout.POSTAL_CODE).sendKeys("1220");
        driver.findElement(SelectorsPage.Checkout.CONTINUE_CHECKOUT).click();
    }
}