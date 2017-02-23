package main.java.base;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.http.util.TextUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ���������ĸ���
 * Created by Adminstrator on 2016/12/7.
 */
//@Listeners({main.java.util.AssertionListener.class})
public class InitAppium {
    //�����豸����
    public static String deviceName = "Android Emulator";
    //�����豸ϵͳ�汾
    public static String platformVersion = "6.0";
    //app·��
    public static String appPath = System.getProperty("user.dir") + "/app/154.apk";

    //����
    public static String appPackage = "com.creditwealth.client";

    //�Ƿ���Ҫ���°�װ
    public static String noReset = "True";

    //�Ƿ�����ǩ��
    public static String noSign = "True";

    //�Ƿ�ʹ��unicode���뷨������֧������
    public static String unicodeKeyboard = "True";

    //�Ƿ����Ĭ�������뷨
    public static String resetKeyboard = "True";

    //Ҫ������Activity
    //public static String appActivity = appPackage + ".activity.login.WelcomeActivity";
    public static String appActivity = "com.creditwealth.client.ui.MainActivity";

    public AndroidDriver<AndroidElement> driver = null;


    //���췽��
    public InitAppium() {
        this(new Builder());
    }

    public InitAppium(Builder builder) {

        appActivity = builder.appActivity;
        appPackage = builder.appPackage;
        appPath = builder.appPath;
        deviceName = builder.deviceName;
        noReset = builder.noReset;
        noSign = builder.noSign;
        unicodeKeyboard = builder.unicodeKeyboard;
        resetKeyboard = builder.resetKeyboard;
    }

    /**
     * appium��������
     *
     * @throws MalformedURLException
     */
    @BeforeSuite
    public void beforeSuite() throws MalformedURLException {


        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("app", new File(appPath).getAbsolutePath());
        capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("udid", "M9N7N15C28000162");
        //֧������
//        capabilities.setCapability("unicodeKeyboard", unicodeKeyboard);
        //�������֮�󣬱��ϵͳ�����뷨
        capabilities.setCapability("resetKeyboard", resetKeyboard);
        //���ظ���װ
        capabilities.setCapability("noReset", noReset);
        //������ǩ��
        capabilities.setCapability("noSign", noSign);
        //�򿪵�activity
        if(!TextUtils.isEmpty(appActivity)){
            capabilities.setCapability("appActivity", appActivity);
        }

        //����Driver
        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }


    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    @AfterClass
    public void afterClass(){
        //ÿһ��������Ͻ�����β���
        //driver.quit();
    }

    /**
     * ��ӡ�ַ�
     *
     * @param str Ҫ��ӡ���ַ�
     */
    public <T> void print(T str) {
        if (!TextUtils.isEmpty(String.valueOf(str))) {
            System.out.println(str);
        } else {
            System.out.println("����˿��ַ�");
        }
    }

}
