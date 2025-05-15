import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HybridBase {
    public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {
        //chrome - url
        //App .apk, device,4732
        //commands
        //AndroidDriver ->
        File appDir = new File("src");
        File app = new File(appDir, "mda-2.2.0-25.apk");
        DesiredCapabilities cap = new DesiredCapabilities();

        if (device.equals("emulator")) {
            // For emulator device
//            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 XL API 30");
            cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        } else if (device.equals("real")) {
            // For real device
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        }

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        //UI Automator -> Android apps
        //UI Automator
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        AndroidDriver<AndroidElement> driver;
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }
}
