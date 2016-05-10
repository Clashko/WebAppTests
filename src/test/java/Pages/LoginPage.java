package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{
    private final String BASE_URL = "https://ru.ogame.gameforge.com";

    @FindBy(id="loginBtn")
    private WebElement loginButton;

    @FindBy(id = "usernameLogin")
    private WebElement inputLogin;

    @FindBy(id = "passwordLogin")
    private WebElement inputPassword;

    @FindBy(id="loginSubmit")
    private WebElement buttonSubmit;

    @FindBy(linkText="Выход")
    private WebElement btnLogOut;

    @FindBy(id="playerName")
    private WebElement linkLoggedInUser;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void logIn(String username, String password)
    {
        loginButton.click();
        inputLogin.sendKeys(username);
        inputPassword.sendKeys(password);
        buttonSubmit.click();
    }

    public String getLoggedInUserName()
    {
        return linkLoggedInUser.getText();
    }

    public void logOut(){
        btnLogOut.click();
    }

    public boolean isLogOut(){
        boolean logOutIsTrue=false;
        if(buttonSubmit.isDisplayed()) logOutIsTrue=true;
        return  logOutIsTrue;
    }
}
