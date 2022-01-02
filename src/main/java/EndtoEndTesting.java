import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EndtoEndTesting {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        chromeDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        chromeDriver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //selecting calendar
        chromeDriver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("it is disabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
        chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        chromeDriver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);

        for(int counter=1; counter<5; counter++){

            chromeDriver.findElement(By.id("hrefIncAdt")).click();

        }
        chromeDriver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals((chromeDriver.findElement(By.id("divpaxinfo")).getText()),  "5 Adult");
        System.out.println(chromeDriver.findElement(By.id("divpaxinfo")).getText());

       // chromeDriver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();   //by id
        chromeDriver.findElement(By.cssSelector("input[value='Search']")).click();
        //chromeDriver.findElement(By.xpath("//input[@value='Search']")).click();
        chromeDriver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
    }
}
