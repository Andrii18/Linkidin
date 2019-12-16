package linkidin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav__button-secondary")
    private WebElement singInButton;

    public SingInPage clickSingInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(singInButton));
        singInButton.click();
        return new SingInPage(driver);
    }
}
