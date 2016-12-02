package main.java.demo.pages;

import io.appium.java_client.android.AndroidDriver;
import main.java.base.Page;

/**
 * Created by Administrator on 2016/12/2.
 */
public class UpdatePopupPage extends Page{

    public UpdatePopupPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //退出按钮 com.creditwealth.client:id/iv_update_quit
    public final String QUIT="iv_update_quit";
    //版本号Title com.creditwealth.client:id/tv_update_title0
    public final String UPDATE_TITLE="tv_update_title0";
    //全面升级文案 android.widget.TextView
    public final String TEXTV1="";
    //升级按钮 com.creditwealth.client:id/bt_update_start
    public final String BUTTON_UPDATE="bt_update_start";


}
