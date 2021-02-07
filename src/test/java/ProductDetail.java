import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class ProductDetail {


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
        public void ProducTest () throws InterruptedException {

            ProductChoose();
        }



        public void ProductChoose(){

             // Anasayfada scroll --> süper fiyat süper teklif
            TouchAction touch1 = new TouchAction(driver)
                    .press(PointOption.point(790,1537))
                   // .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(821,522))
                    .release()
                    .perform();


            //Süper fiyat süper fiyata tıklanır
            MobileElement SuperFıyat = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.ImageView");
            SuperFıyat.click();

           //scroll

            TouchAction touch2 = new TouchAction(driver)
                    .press(PointOption.point(167,1559))
                   // .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(171,391))
                    .release()
                    .perform();


            TouchAction touch3 = new TouchAction(driver)
                    .press(PointOption.point(768,1563))
                    //.waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(852,492))
                    .release()
                    .perform();



            TouchAction touch4 = new TouchAction(driver)
                    .press(PointOption.point(768,1563))
                   // .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(852,492))
                    .release()
                    .perform();

            //Urun detaya gidilir
            MobileElement urun1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]");
            urun1.click();

            //Urun gorsele tıklanır
            MobileElement urun2 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/productImage");
            urun2.click();

            //Urun görsel scroll edilir

            TouchAction touch5 = new TouchAction(driver)
                    .press(PointOption.point(869,1225))
                    //.waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(259,1229))
                    .release()
                    .perform();


            TouchAction touch6 = new TouchAction(driver)
                    .press(PointOption.point(931,1392))
                   // .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(198,1396))
                    .release()
                    .perform();

            //Back button tıklanır
            MobileElement urun3 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/leftIcon");
            urun3.click();

            //Urun sepete eklenir
            MobileElement urun4 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/product_detail_add_to_cart_text");
            urun4.click();

           //Back
            MobileElement urun5 = (MobileElement) driver.findElementById("com.pozitron.hepsiburada:id/leftIcon");
            urun5.click();

           //sepete git
            MobileElement urun6 = (MobileElement) driver.findElementByAccessibilityId("navigationItem_2");
            urun6.click();


            MobileElement urun7 = (MobileElement) driver.findElementByAccessibilityId("Samsung 50Q60T 50\" 125 Ekran Uydu Alıcılı 4K Ultra HD Smart QLED TV");
            urun7.click();

            if(urun1==urun7){
                System.out.println("test adım başarılı");

           }else
              System.out.println("Test adımı başarısız)");

        }


    @AfterMethod
        public void teardown(){
            driver.quit();
        }
    }

