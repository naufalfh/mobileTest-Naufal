import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

// This use for mobile browser capabilities
public class baseChrome {
    public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
    {
        AndroidDriver<AndroidElement>  driver;

// TODO Auto-generated method stub
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");

        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        //   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }

}







//Testcase



//import java.net.MalformedURLException;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;

/*public class browse extends baseChrome {

    public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver=capabilities();
        driver.get("http://facebook.com");
        driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("qwerty");
        driver.findElementByName("pass").sendKeys("12345");
        driver.findElementByXPath("//button[@value='Log In']").click();
//rahulonlinetutor@gmail.com

    }

}*/
