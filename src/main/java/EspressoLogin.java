import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspressoLogin {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://origin-secure.stg3.cruisingpower.com/SecureLogin.do");

        chromeDriver.findElement(By.id("j_username")).sendKeys("CMOUSA");
        chromeDriver.findElement(By.id("j_password")).sendKeys("TESTING123");
        chromeDriver.findElement(By.className("loginButton")).click();
    }
}

