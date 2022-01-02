import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDown {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // //a[@value='MAA] - xpath for Chennai

        // //a[@value='MAA]

        chromeDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        chromeDriver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //chromeDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //Thread.sleep(2000);

        //selecting calendar
        chromeDriver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();


/*        while(!chromeDriver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().contains("November"))
//
//        {
//
//        // driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//
//            chromeDriver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//
//            System.out.println(chromeDriver.findElement(By.cssSelector("div[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText());
//
//        }
//
//        List<WebElement> dates= chromeDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
//
//
//        int count= dates.size();
//
//        for(int i=0; i<count; i++)
//
//        {
//
//            String txt = chromeDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).getText();
//
//            if(txt.equalsIgnoreCase("09"))
//
//            {
//
//                chromeDriver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td")).get(i).click();
//
//                System.out.println(txt);
//
//                break;
//
//            }
//
     }

*/


    }
}
