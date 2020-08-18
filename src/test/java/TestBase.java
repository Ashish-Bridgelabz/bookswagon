import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {
     public static WebDriver driver =null ;

@BeforeSuite
//    @Test(priority = 1)
    public void browser()  {

         WebDriverManager.chromedriver().setup();
    System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"ture");
    //WebDriverManager.chromedriver().version("").setup();

    WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

         driver.get("https://www.bookswagon.com");



     }
   //  @AfterSuite
  //  public void logOut(){
     //    TestBase.driver.close();
    // }


}
