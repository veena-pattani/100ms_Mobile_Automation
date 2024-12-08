package Driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class ThreadLocalDriver {

    private static final ThreadLocal<AndroidDriver<MobileElement>> threadLocalDriver = new ThreadLocal<>();

    public static synchronized void setTLDriver(AndroidDriver<MobileElement> driver)

    {
        threadLocalDriver.set(driver);

    }

    public static synchronized AndroidDriver<MobileElement> getTLDriver()

    {
        return threadLocalDriver.get();
    }


}

