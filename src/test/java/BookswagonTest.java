import com.bridgelabz.data.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import sun.jvm.h2otspot.runtime.Thread;

import java.io.IOException;

public class BookswagonTest extends TestBase {


@Test
public void data()  {

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    loginPage.clickLoginButton();

    loginPage.setUserName("asaschoudhary49@gmail.com");


    loginPage.setPassword("ashish@123shi");
    loginPage.clickLogin();

}
}