package linkidin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileHomePage extends BasePage {

    public ProfileHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".profile-rail-card__actor-link.t-16.t-black.t-bold")
    private WebElement profileField;

    public String  firstLastNameField() {
        wait.until(ExpectedConditions.elementToBeClickable(profileField));
        return profileField.getText();
    }
}
