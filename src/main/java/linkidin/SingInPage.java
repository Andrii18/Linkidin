package linkidin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SingInPage extends BasePage {

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".form__input--floating'")
    private List<WebElement> SingInPageFields;

    public void EmailOrPhoneFields(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(SingInPageFields.get(0)));
        SingInPageFields.get(0).sendKeys(email);
    }

    public void PasswordField(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(SingInPageFields.get(1)));
        SingInPageFields.get(1).sendKeys(password);
    }

    @FindBy(css = ".login__form_action_container")
    private WebElement singInButton1;

    public ProfileHomePage clickSingInButton1() {
        wait.until(ExpectedConditions.elementToBeClickable(singInButton1));
        singInButton1.click();
        return new ProfileHomePage(driver);
    }

}
