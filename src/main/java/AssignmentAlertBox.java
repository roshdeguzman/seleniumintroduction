import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAlertBox {
    public static void main(String[] args) throws InterruptedException {


        String text = "Rahul";
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chromeDriver.findElement(By.id("name")).sendKeys(text);
        chromeDriver.findElement(By.cssSelector("[id = 'alertbtn']")).click();
        System.out.println(chromeDriver.switchTo().alert().getText());
        chromeDriver.switchTo().alert().accept();       //positive side
        chromeDriver.findElement(By.id("confirmbtn")).click();
        System.out.println(chromeDriver.switchTo().alert().getText());
        chromeDriver.switchTo().alert().dismiss();
    }
}
