import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RahulShettyLogin {


    public static void main(String[] args) throws InterruptedException{

        //Create Driver object  for chrome browser
        //implicit wait - 5 seconds timeout

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting for objects to show

        chromeDriver.get("http://rahulshettyacademy.com/locatorspractice");
        chromeDriver.findElement(By.id("inputUsername")).sendKeys("rahul");
        chromeDriver.findElement(By.name("inputPassword")).sendKeys("hello123");
        chromeDriver.findElement(By.className("signInBtn")).click();


        System.out.println(chromeDriver.findElement(By.cssSelector("p.error")).getText());

        chromeDriver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); //something to wait in the stable state
        chromeDriver.findElement(By.xpath("//input[@placeholder ='Name']")).sendKeys("JOHN");
        chromeDriver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rosh@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='text'][2]")).clear();  //clearingEmail value
        chromeDriver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("roshe@gmail.com");  //adding email again
        chromeDriver.findElement(By.xpath("//form/input[3]")).sendKeys("1212121");
        chromeDriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(chromeDriver.findElement(By.cssSelector("form p")).getText());

        chromeDriver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000); //something to wait in the stable state
        chromeDriver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        chromeDriver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.id("chkboxOne")).click();
        chromeDriver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
