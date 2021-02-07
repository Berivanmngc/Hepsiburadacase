import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class LoginCase  {

    public AndroidDriver<MobileElement> driver;
    public WebDriverWait wait;


    @BeforeMethod
    public void setup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 2 API 26");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.0.0");
        caps.setCapability("appPackage", "com.pozitron.hepsiburada");
        caps.setCapability("appActivity","com.hepsiburada.ui.home.BottomNavigationActivity");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void loginTest () throws InterruptedException {

        loginAccount();
    }

    public void loginAccount(){

        MobileElement el1 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/account_icon");
        el1.click();

        MobileElement el2 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/llUserAccountLogin");
        el2.click();


        MobileElement el3 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/etLoginEmail");
        el3.sendKeys("********@gmail.com");


        MobileElement el4 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/etLoginPassword");
        el4.sendKeys("*******");


        MobileElement el5 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/btnLoginLogin");
        el5.click();


    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}


