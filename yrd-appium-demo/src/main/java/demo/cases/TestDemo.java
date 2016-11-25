package main.java.demo.cases;
import main.java.demo.base.AppiumTestBase;


import io.appium.java_client.android.AndroidDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

/**
 * Created by Administrator on 2016/11/23.
 */
public class TestDemo extends AppiumTestBase{
    private AndroidDriver<WebElement> driver;

    @Test
    public  void test(){

        WebElement loginButton;
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement userNameEt=driver.findElement(By.id("com.tr:id/userNameEt"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement passwordEt=driver.findElement(By.id("com.tr:id/passwordEt"));
    }


}
