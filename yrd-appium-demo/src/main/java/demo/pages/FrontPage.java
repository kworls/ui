package main.java.demo.pages;

import io.appium.java_client.android.AndroidDriver;
import main.java.demo.base.PageAppium;

/**
 * Created by Administrator on 2016/11/29.
 */
public class FrontPage extends PageAppium{
    public FrontPage(AndroidDriver driver){
        super(driver);
    }
    /**
     * 元素定义
    * */

    //页面返回按钮 com.creditwealth.client:id/main_top_left
    public final String MAIN_RETURN = "main_top_left";


}
