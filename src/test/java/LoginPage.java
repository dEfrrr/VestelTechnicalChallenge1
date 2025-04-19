import org.openqa.selenium.WebDriver;

public class LoginPage
{
    SelectorsPage selectors;

    WebDriver driver;

    public LoginPage(WebDriver driver, SelectorsPage selectors)
    {
        this.driver = driver;
        this.selectors = selectors;
    }

    public void loginProcess()
    {
        driver.findElement(SelectorsPage.LoginPage.USERNAME).sendKeys("standard_user");
        driver.findElement(SelectorsPage.LoginPage.PASSWORD).sendKeys("secret_sauce");
        driver.findElement((SelectorsPage.LoginPage.LOGIN_BUTTON)).click();
    }

    public void logoutProcess(){
        driver.findElement(SelectorsPage.Homepage.HAMBURGER_MENU).click();
        driver.findElement(SelectorsPage.Homepage.LOGOUT_BUTTON).click();
    }
}