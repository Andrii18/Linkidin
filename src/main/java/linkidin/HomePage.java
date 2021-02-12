package linkidin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, WebElement singInButton) {
        super(driver);
        this.singInButton = singInButton;
    }

    @FindBy(css = ".sign-in-card__dismiss-icon.onload.lazy-loaded")
    private WebElement closeElementButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickCloseElementButton() {
        wait.until(ExpectedConditions.elementToBeClickable(closeElementButton));
        closeElementButton.click();
    }

    @FindBy(css = ".nav__button-secondary")
    private WebElement singInButton;

    public SingInPage clickSingInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(singInButton));
        singInButton.click();
        return new SingInPage(driver);
    }
//    @FindBy(css = ".input__field.input__field--with-label")
//    private List<WebElement> signInFields;
//
//    public void inputLogInField(String logIn) {
//        wait.until(ExpectedConditions.elementToBeClickable(signInFields.get(0)));
//        signInFields.get(0).sendKeys(logIn);
//    }

//    public void inputPasswordField(String password) {
//        wait.until(ExpectedConditions.elementToBeClickable(signInFields.get(1)));
//        signInFields.get(1).sendKeys(password);
//    }

    }




