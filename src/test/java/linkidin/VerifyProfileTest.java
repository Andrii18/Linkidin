package linkidin;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.Thread.*;

public class VerifyProfileTest extends BaseTest {

    @Test
    public void testVerifyProfile() {
        HomePage homePage = new HomePage(driver);
        SingInPage singInPage = homePage.clickSingInButton();
        singInPage.EmailOrPhoneFields(client.getEmail());
        singInPage.passwordField(client.getPassword());
        ProfileHomePage profileHomePage = singInPage.clickSingInButton1();
        String profile = profileHomePage.firstLastNameField();
        Assert.assertEquals("Andrii Vorona", profile);


    }
}
