package main.java.demo.cases;

import io.appium.java_client.android.AndroidElement;
import main.java.base.InitAppium;
import main.java.demo.operation.FirstPageOperation;
import main.java.demo.operation.GestureOperation;
import main.java.demo.operation.UpdatePopupOperation;
import main.java.util.Assertion;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/11/29.
 */

public class IsGesture extends InitAppium {

    private GestureOperation gesop;
    private UpdatePopupOperation  uppo;
    private FirstPageOperation fpo;

    @BeforeClass
    public void initDriver() {


        Assert.assertNotNull(driver);
        gesop = new GestureOperation(driver);
        uppo =  new UpdatePopupOperation(driver);
        fpo =   new FirstPageOperation(driver);

    }

    @Test
    public void isGesture() {

        AndroidElement ae= driver.findElementById("com.creditwealth.client:id/tv_tips");

        System.out.println(ae.getText());
        boolean flag=gesop.isTisPage();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        gesop.gestureUnlock(2,5,8,9);
        uppo.closePage();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }



    @Test
    public void todayRecommend() throws InterruptedException {
//        gesop.gestureUnlock(2,5,8,9);
//        uppo.closePage();
        Assert.assertEquals(fpo.getTODAYRECOMMENDText(),"加息产品3");

//        Thread.sleep(5000);
    }


    @Test
    public void testFirstPage(){
        Assertion.verifyEquals(fpo.verifyFirstPage(),true,"测试是否在首页");
    }

    @Test
    public void testTextActivityCenter(){
        Assertion.verifyEquals(fpo.verifyTextActivityCenter(),true,"验证活动中心按钮文案正确");
    }
    @Test
    public void testTextRecommendReward(){
        Assertion.verifyEquals(fpo.verifyTextRecommendReward(),true,"验证推荐奖励文案正确");
    }
    @Test
    public void testTextInsurance(){
        Assertion.verifyEquals(fpo.verifyTextInsurance(),true,"验证安全保障按钮文案正确");
    }

}
