import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class loginPositive1 extends HybridBase {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities("real");

        //Positive Case Scenario 1
        //Scenario: Login by using regular account
            driver.findElementByXPath("(//android.widget.ImageView)[2]").click();
            driver.findElementByXPath("//android.widget.TextView[@text='Log In']").click();
            driver.findElementById("com.saucelabs.mydemoapp.android:id/nameET").sendKeys("bod@example.com");
            driver.findElementById("com.saucelabs.mydemoapp.android:id/passwordET").sendKeys("10203040");
            driver.findElementById("com.saucelabs.mydemoapp.android:id/loginBtn").click();
    }
}
