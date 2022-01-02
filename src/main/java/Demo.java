import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args){

        //Create Driver object  for chrome browser

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("http://google.com");  //hit your URL
        System.out.println(chromeDriver.getTitle()); //validate your page title is correct
        System.out.println(chromeDriver.getCurrentUrl()); // validation if you landed in the correct  URL

        //System.out.println(chromeDriver.getPageSource()); //print page source

        chromeDriver.get("http://yahoo.com");
        chromeDriver.navigate().back();
        chromeDriver.close();


    }

}
