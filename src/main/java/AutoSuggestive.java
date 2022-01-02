import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        chromeDriver.findElement(By.id("autosuggest")).sendKeys("IND");
        Thread.sleep(3000);
        List <WebElement> options = chromeDriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option : options){
                if (option.getText().equalsIgnoreCase("India")){
                    option.click();
                    break;
                }
        }

    }
}