package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static Properties prop;
    public static WebDriver driver;

    public TestBase(){
        prop = new Properties();
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream("Config/config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Initialization(){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\sande\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(prop.getProperty("URL"));
    }

    public void tearDown() {
        driver.close();
    }
}
