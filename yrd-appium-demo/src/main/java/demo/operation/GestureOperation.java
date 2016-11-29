package main.java.demo.operation;

import io.appium.java_client.android.AndroidDriver;
import main.java.demo.pages.Gesture;

/**
 * Created by Administrator on 2016/11/29.
 */
public class GestureOperation extends Gesture {

    private Gesture gesture;
    AndroidDriver driver;
    public GestureOperation(AndroidDriver driver){
        super(driver);
        gesture = new Gesture(driver);
        this.driver = driver;
    }

}
