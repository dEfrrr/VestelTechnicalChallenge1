import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

public class InventoryPage
{
    WebDriver driver;

    public InventoryPage(WebDriver driver)
    {
    this.driver = driver;
    }

    public void addToCartItem(String productName)
    {
        WebElement productElement = driver.findElements(SelectorsPage.Inventory.INVENTORY_ITEMS).stream()
                .filter(el -> el.getText().contains(productName))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Product not found: " + productName));
                productElement.findElement(SelectorsPage.Inventory.ADD_TO_CART).click();
    }

    public void goToCart(){
        driver.findElement(SelectorsPage.Inventory.CART_BUTTON).click();
    }
}