import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UpdatedDropDown {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        Assert.assertFalse(chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
       // Assert.assertFalse(false);
       // System.out.println(chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
       // System.out.println(chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(chromeDriver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


        //Count the number of checkboxes
        System.out.println(chromeDriver.findElements(By.cssSelector("input[type='checkbox']")).size());


        chromeDriver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

 //        int counter = 1;
//        while(counter<5){
//
//            chromeDriver.findElement(By.id("hrefIncAdt")).click();  //adding adults
//            counter++;
//
//        }
        System.out.println(chromeDriver.findElement(By.id("divpaxinfo")).getText());

        for(int counter=1; counter<5; counter++){

            chromeDriver.findElement(By.id("hrefIncAdt")).click();

        }
            chromeDriver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals((chromeDriver.findElement(By.id("divpaxinfo")).getText()),  "5 Adult");
        System.out.println(chromeDriver.findElement(By.id("divpaxinfo")).getText());


        //selecting trip
       // System.out.println(chromeDriver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(chromeDriver.findElement(By.id("Div1")).getAttribute("style"));
        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(chromeDriver.findElement(By.id("Div1")).getAttribute("style"));
        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("it is enabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
        }

}


