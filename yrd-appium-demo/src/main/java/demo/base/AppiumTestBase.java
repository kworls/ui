package main.java.demo.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URL;
import java.util.concurrent.TimeUnit;


/**
 * Created by Administrator on 2016/11/22.
 */
public class AppiumTestBase {
    public WebDriverWait webwait;
    public AndroidDriver driver;
    private AppiumConfig config=AppiumConfig.custom();



    @BeforeMethod
    public void setUp() throws Exception {
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "apps");
//        File app = new File(appDir, Config.CURRENT_BANK);

        config.setAPPIUM_PORT("4723");
        config.setDEVICE_NAME("TC4H9LHA454DUSHI");
        config.setPLANTFORM_VERSION("5.0.2");



        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability(CapabilityType.VERSION, "4.4.2");
        capabilities.setCapability("platformName", "android");

        capabilities.setCapability("appPackage", "com.creditwealth.client");
        capabilities.setCapability("appActivity", "com.creditwealth.client.ui.MainActivity");

        capabilities.setCapability("udid", "M9N7N15C28000162");//adb devices获得的值
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723"+"/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }
}
