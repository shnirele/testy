
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;


public class    RegisterPageMethods {
    ChromeDriver driver;

    public RegisterPageMethods (ChromeDriver driver)
    {
        this.driver = driver;
    }


    public void sendLogin() {
        RegisterPage r = new RegisterPage(driver);
        r.login().sendKeys("cos");
    }
    public void goToFuturenet(){
        driver.get("https://futurenet.club:");
    }
    public void quit(){
        driver.quit();
    }
    public void scrolling() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)", "");
    }
    public void waiting() throws InterruptedException {
       Thread.sleep(5000);
    }
}
