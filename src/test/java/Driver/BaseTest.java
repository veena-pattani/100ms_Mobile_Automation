package Driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseTest {
    public static AppiumDriver<WebElement> driver;
    private final DesiredCapability desiredCapabilitiesUtil = new DesiredCapability();

    @BeforeMethod
    public void setup() throws IOException

    {

        String udid="aaed9691";
        String platformVersion="14";
        String platformName="Android";
        DesiredCapabilities caps = desiredCapabilitiesUtil.getDesiredCapabilities(udid, platformVersion, platformName);


        if(platformName.equals("Android")) {

            ThreadLocalDriver.setTLDriver(new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), caps));

        }


    }

    @AfterMethod
    public synchronized void teardown()

    {
        ThreadLocalDriver.getTLDriver().quit();
    }



}
