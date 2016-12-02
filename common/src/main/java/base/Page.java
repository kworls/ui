package main.java.base;

import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/12/2.
 */
public class Page {
    AndroidDriver driver;

    //默认的等待控件时间
    private static int WAIT_TIME = 3;



    public Page(AndroidDriver androidDriver) {
        this.driver = androidDriver;
        waitAuto(WAIT_TIME);
    }


    /**
     * ，隐式等待，如果在指定时间内还是找不到下个元素则会报错停止脚本
     * 全局设定的，find控件找不到就会按照这个事件来等待
     *
     * @param time 要等待的时间
     */
    public void waitAuto(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }
}
