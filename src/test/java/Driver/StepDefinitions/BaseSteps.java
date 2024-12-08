package Driver.StepDefinitions;


import ObjectRepository.HomePage_OR;
import ObjectRepository.SplashScreen;
import ObjectRepository.PreviewPage_OR;
import ObjectRepository.MeetingPage_OR;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseSteps {
    protected SplashScreen splashScreen;
    protected HomePage_OR home;

    protected PreviewPage_OR preview;

    protected MeetingPage_OR meeting;

    public void setupScreens(AndroidDriver<MobileElement> driver) {
        splashScreen = new SplashScreen(driver);
        home = new HomePage_OR(driver);
        preview = new PreviewPage_OR(driver);
        meeting = new MeetingPage_OR(driver);
    }


}


