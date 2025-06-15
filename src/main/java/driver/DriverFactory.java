package driver;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {
    //For parallely running Test
    private  static  ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static  WebDriver getDriver(){
        if (webDriver.get() == null){
            webDriver.set(createDriver());
        }
        return  webDriver.get();
    }

    private static  WebDriver createDriver(){
        WebDriver driver = null;
        String browserType = getBrowserType();
        switch (browserType){
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/java/driver/drivers/chromedriver");
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--window-size=1920,1080");
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(chromeOptions);
                //driver.manage().window().maximize();
            }
            case "firefox" -> {
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/java/driver/drivers/geckodriver");
                FirefoxOptions firefixOptions = new FirefoxOptions();
                //firefixOptions.addArguments("--headless");
                firefixOptions.addArguments("--disable-gpu");
                firefixOptions.addArguments("--window-size=1920,1080");
                firefixOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new FirefoxDriver(firefixOptions);
                //driver.manage().window().maximize();
            }
        }
        driver.manage().window().maximize();
        return  driver;
    }

    private  static  String getBrowserType() {

        String browserType = null;
        String browserTypeRemoteValue = System.getProperty("BrowserType");
        try {
            if(browserTypeRemoteValue == null || browserTypeRemoteValue.isEmpty()) {
                browserType = null;
                Properties properties = new Properties();
                FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/properties/config.properties");
                properties.load(file);
                browserType = properties.getProperty("browser").toLowerCase().trim();
            } else  {
                browserType=browserTypeRemoteValue;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return browserType;
    }

    public static  void  cleanupDriver(){
        webDriver.get().quit();
        webDriver.remove();
    }
}
