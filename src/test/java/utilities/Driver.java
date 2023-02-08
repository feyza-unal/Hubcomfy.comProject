package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
/*
       POM'da Driver icin TestBase classina extend etmek yerine
       Driver classindan static methodlar kullanarak driver olusturup,
       ilgili ayarlarin yapilmasi ve en sonda driverin kapatilmasi tercih edilmistir

       Bugune kadar TestBase classina extend ederek kullandigimiz driver yerine
       Driver classindan getDriver static methodunu kullanacagiz
 */

public class Driver {
    //    Driver.getDriver(); -> driver
    private static WebDriver driver;
    //    getDriver() is used to instantiate the driver object
    public static WebDriver getDriver(){//istedigimiz zaman acilmasi icin
        if (driver==null){
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
            }
//            NOTE: sel 4.5
//            driver = WebDriverManager.chromedriver().create();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;
    }
    //    closeDriver() is used to close the driver
    public static void closeDriver(){ //istedigimiz zaman kapanmasi icin
//        if driver is already being used(pointing an object)
//        then quit the driver
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
}
