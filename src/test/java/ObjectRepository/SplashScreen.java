package ObjectRepository;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;



public class SplashScreen extends BaseScreen {

    public SplashScreen(AndroidDriver<MobileElement> driver) {

        super(driver);
    }



    By Splash_Logo   = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout");


    public void ValidateSplashScreen()
    {
        waitAndFindElements(Splash_Logo);
        isElementPresent(Splash_Logo);
    }
}

