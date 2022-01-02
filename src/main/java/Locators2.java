import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

public class Locators2 {

    public static void main(String[] args) throws InterruptedException{

        //Create Driver object  for chrome browser
        //implicit wait - 5 seconds timeout
        String name = "rahul";

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waiting for objects to show
        String password = getPassword(chromeDriver);

        chromeDriver.get("http://rahulshettyacademy.com/locatorspractice");
        chromeDriver.findElement(By.id("inputUsername")).sendKeys(name);
        chromeDriver.findElement(By.name("inputPassword")).sendKeys(password);
        chromeDriver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(chromeDriver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(chromeDriver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(chromeDriver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello " + name + ",");
        chromeDriver.findElement(By.xpath("//*[text()='Log Out']")).click();

    }

    public static String getPassword(WebDriver chromeDriver) throws InterruptedException{
        chromeDriver.get("http://rahulshettyacademy.com/locatorspractice");
        chromeDriver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); //something to wait in the stable state
        chromeDriver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = chromeDriver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login
        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        return password;

        //oth index -- Please use temporary password
        //1st index - rahulshettyacademy to Login

        //0th index - rahulshettyacademy
        //1st index - to Login



    }

}
