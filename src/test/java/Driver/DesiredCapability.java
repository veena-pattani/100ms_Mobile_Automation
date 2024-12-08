package Driver;


import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapability {

    public DesiredCapabilities getDesiredCapabilities (String udid, String platformVersion, String platformName) {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        if (platformName.equals("Android")) {

            desiredCapabilities.setCapability("appium:udid", udid);
            desiredCapabilities.setCapability("appium:platformVersion", platformVersion);
            desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
            desiredCapabilities.setCapability("platformName", platformName);
            desiredCapabilities.setCapability("appium:appPackage", "live.hms.app2");
            desiredCapabilities.setCapability("appium:appActivity", "live.hms.app2.ui.home.HomeActivity");
            desiredCapabilities.setCapability("appium:skipUnlock", "true");
            desiredCapabilities.setCapability("appium:noReset", "true");
            desiredCapabilities.setCapability("appium:ignoreHiddenApiPolicyError", "true");
            desiredCapabilities.setCapability("appium:autoGrantPermissions", "true");

            return desiredCapabilities;
        }
        else{
            System.out.println("Requested platform is not found");
            return desiredCapabilities;
        }


    }

}

