import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String[] args) {

        //Create Driver object  for chrome browser

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("http://facebook.com");
//        chromeDriver.findElement(By.id("email")).sendKeys("roshenikhka");
//        chromeDriver.findElement(By.name("pass")).sendKeys("XV9ijSoC1234!");
//        chromeDriver.findElement(By.linkText("Forgot Password")).click();

        chromeDriver.findElement(By.cssSelector("#email")).sendKeys("roshenikhka");
        chromeDriver.findElement(By.xpath("//*[@id='pass']")).sendKeys("XV9ijSoC");
       // chromeDriver.findElement(By.cssSelector("#u_0_d_EG")).click();
        chromeDriver.findElement(By.xpath("//*[@id='u_0_a_Wu']/div[3]/a")).click();


    }
}

