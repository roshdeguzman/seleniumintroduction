import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentExercise {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");


        chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        //Assert.assertTrue(chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        System.out.println((chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()));
        Thread.sleep(3000);

        chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        //Assert.assertFalse(chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
        System.out.println((chromeDriver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected()));

        //Count the number of checkboxes
        System.out.println(chromeDriver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
