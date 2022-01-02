import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowsActivities {
    public static void main(String[] args) throws InterruptedException {

        //Create Driver object  for chrome browser
        //implicit wait - 5 seconds timeout
        String name = "rahul";

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting for objects to show
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://google.com");
        chromeDriver.navigate().to("https://rahulshettyacademy.com");
        chromeDriver.navigate().back();
    }


}
