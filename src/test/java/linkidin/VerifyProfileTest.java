package linkidin;

import org.junit.Test;

public class VerifyProfileTest extends BaseTest {

    @Test
    public void testVerifyProfile() {

        homePage = new HomePage(driver);

        homePage.clickSingInButton();

        SingInPage singInPage = new SingInPage(driver);

        singInPage.EmailOrPhoneFields("ustkos9@gmail.com");

        singInPage.passwordField("*******");
//
//        ProfileHomePage profileHomePage = singInPage.clickSingInButton1();
//
//        String profile = profileHomePage.firstLastNameField();
//
//        Assert.assertEquals("Andrii Vorona", profile);

    }
}
