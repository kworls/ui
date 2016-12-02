package main.java.demo.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import main.java.demo.base.PageAppium;

/**
 * Created by Administrator on 2016/11/29.
 */
public class Gesture extends PageAppium {
    public Gesture(AndroidDriver driver){
        super(driver);
    }

    /**
     * 元素定义
     */



    //TextView 输入手势密码解锁 com.creditwealth.client:id/tv_tips
    public final String TV_TIPS = "tv_tips";

    //TextView 忘记手势密码 com.creditwealth.client:id/tv_lock_pattern_button_left

    public final String FORGET_LOCK_TIPS = "tv_lock_pattern_button_left";



    /**
     * 判断是否在本页
    */
    public boolean isThisPage(){
        return isIdElementExist(TV_TIPS,4);
    }

    /**
     * 获取元素
     */
    public AndroidElement getTV_TIPS(){
        return findById(TV_TIPS);
    }
    public AndroidElement getFORGET_LOCK_TIPS(){
        return findById(FORGET_LOCK_TIPS);
    }

    /**
     * 获取元素属性
     */
    public String getTV_TIPSText(){
            return null;
    }





}
