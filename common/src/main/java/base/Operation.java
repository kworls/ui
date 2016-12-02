package main.java.base;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Operation {


    AndroidDriver driver;
    public Operation(AndroidDriver androidDriver) {
        this.driver = androidDriver;
    }

    //单个触摸操作
    TouchAction touchAction;
    //多个触摸操作
    MultiTouchAction multiTouchAction;
    //默认的等待控件时间
    private static int WAIT_TIME = 3;
    //默认滑动百分比
    private final int SWIPE_DEFAULT_PERCENT = 5;


    /**
     * 获取屏幕的宽高
     *
     * @return 返回宽高的数组
     */
    public int[] getScreen() {
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();
        return new int[]{width, height};
    }

    /**
     * 获取屏幕宽度
     *
     * @return
     */
    public int getScreenWidth() {
        return driver.manage().window().getSize().getWidth();
//        return  driver.manage().window().getSize().width;
    }

    /**
     * 获取屏幕高度
     *
     * @return
     */
    public int getScreenHeight() {
        return driver.manage().window().getSize().getHeight();
//        return  driver.manage().window().getSize().height;

    }



}
