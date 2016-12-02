package main.java.demo.cases;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import main.java.demo.base.InitAppium;
import main.java.demo.operation.GestureOperation;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/11/29.
 */

public class IsGesture extends InitAppium {

    private GestureOperation gesop;

    @BeforeClass
    public void initDriver() {


        Assert.assertNotNull(driver);
        gesop = new GestureOperation(driver);


    }

    @Test
    public void isGesture() {

        AndroidElement ae= driver.findElementById("com.creditwealth.client:id/tv_tips");
        System.out.println(ae.getText());
        boolean flag=gesop.isTisPage();



    }
    @Test
    public void unlock(){

        gesop.gestureUnlock(1,2,3,6,5);

    }
}
