import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators3 {

    public static void main(String[] args) throws InterruptedException {

        //Create Driver object  for chrome browser
        //implicit wait - 5 seconds timeout

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting for objects to show

        chromeDriver.get("http://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(chromeDriver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
    }
}

