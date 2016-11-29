package main.java.demo.cases;

import main.java.demo.base.InitAppium;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/11/29.
 */

public class IsGesture extends InitAppium {

    @Test
    public void isGesture() throws InterruptedException {
        Assert.assertNull(null);
        driver.manage().wait(10000);

}
}
