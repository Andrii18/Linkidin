package linkidin;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    protected HomePage homePage;

    protected static Client client;

    @BeforeClass
    public static void testBase() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andri\\Desktop\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");

        String actualTitle = driver.getTitle();

        String expectTitle = "LinkedIn: Log In or Sign Up";

        Assert.assertEquals(expectTitle, actualTitle);

        client = new Client("ustkos9@gmail.com", "********");

    }

//    @AfterClass
//    public static void teerDown() {
//        driver.quit();
//    }

}
