import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLogin {

    public static void main(String[] args) {

        //Create Driver object  for chrome browser

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("http://login.salesforce.com");
        chromeDriver.findElement(By.id("username")).sendKeys("roshdeguzman");
        chromeDriver.findElement(By.name("pw")).sendKeys("123456");
       // chromeDriver.findElement(By.className("button r4 wide primary")).click();   //Error
        chromeDriver.findElement(By.xpath("//*[@id='Login']")).click();

    }


}