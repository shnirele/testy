import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
  public ChromeDriver driver;
  public RegisterPageMethods rm;

    @BeforeTest
    public void invoking()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver = new ChromeDriver();
        rm= new RegisterPageMethods(driver);
    }
    @AfterTest
    public void closingBroser(){
        rm.quit();
    }
    @Test
    public void sth() throws InterruptedException {

        rm.goToFuturenet();
        rm.sendLogin();
        rm.scrolling();
        rm.waiting();

    }


}
