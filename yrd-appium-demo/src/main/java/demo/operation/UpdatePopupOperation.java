package main.java.demo.operation;

import io.appium.java_client.android.AndroidDriver;
import main.java.base.Operation;
import main.java.demo.pages.UpdatePopupPage;

/**
 * Created by Administrator on 2016/12/2.
 */
public class UpdatePopupOperation extends Operation {
    AndroidDriver driver;
    private UpdatePopupPage upp;

    public UpdatePopupOperation(AndroidDriver driver) {
        super(driver);
        upp=new UpdatePopupPage(driver);
        this.driver=driver;
    }

    /**点击关闭按钮 */
    public void closePage(){
        upp.getQUIT().click();
    }


}
