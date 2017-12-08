import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class    RegisterPage {
    ChromeDriver driver;

    public RegisterPage(ChromeDriver driver)
    {
        this.driver = driver;
    }

    By login = By.id("email");

    public WebElement login() {
        return driver.findElement(login);
    }
}
