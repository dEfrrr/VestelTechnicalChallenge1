import org.openqa.selenium.By;

public class SelectorsPage
{
    public static class LoginPage
    {
        public static final By USERNAME = By.name("user-name");
        public static final By PASSWORD = By.name("password");
        public static final By LOGIN_BUTTON = By.name("login-button");
    }

    public static class Inventory
    {
        public static final By INVENTORY_ITEMS = By.className("inventory_item");
        public static final By ADD_TO_CART = By.className("btn_inventory");
        public static final By CART_BUTTON = By.className("shopping_cart_badge");
    }

    public static class Cart
    {
        public static final By CART_ITEMS = By.className("inventory_item_name");
        public static final By CHECKOUT_BUTTON = By.className("checkout_button");
    }

    public static class Checkout
    {
        public static final By FIRST_NAME = By.name("firstName");
        public static final By LAST_NAME = By.name("lastName");
        public static final By POSTAL_CODE = By.name("postalCode");
        public static final By CONTINUE_CHECKOUT = By.name("continue");
    }

    public static class Homepage
    {
        public static final By HAMBURGER_MENU = By.id("react-burger-menu-btn");
        public static final By LOGOUT_BUTTON = By.linkText("Logout");
    }
}