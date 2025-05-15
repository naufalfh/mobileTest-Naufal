import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;

import java.net.MalformedURLException;

public class loginNegative extends HybridBase {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities("real");

        //Negative Case Scenario 1
        //Scenario: Login by using locked account
        driver.findElementByXPath("(//android.widget.ImageView)[2]").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Log In']").click();
        driver.findElementById("com.saucelabs.mydemoapp.android:id/nameET").sendKeys("alice@example.com (blocked out)");
        driver.findElementById("com.saucelabs.mydemoapp.android:id/passwordET").sendKeys("10203040");
        driver.findElementById("com.saucelabs.mydemoapp.android:id/loginBtn").click();
        String errorMessage = driver.findElementById("com.saucelabs.mydemoapp.android:id/passwordErrorTV").getAttribute("text");
        Assert.assertEquals(errorMessage, "Sorry this user has been locked out.");
    }
}
