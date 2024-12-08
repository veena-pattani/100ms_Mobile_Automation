
package Driver.StepDefinitions;


import Driver.PropertyData;
import Driver.ThreadLocalDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import java.net.MalformedURLException;

public class TestStepDefinitions extends BaseSteps{

    @Before
    public void setupLoginSteps() {
        setupScreens((AndroidDriver<MobileElement>) ThreadLocalDriver.getTLDriver());
    }

    PropertyData pd = new PropertyData();



    @Given("Launch the App")
    public void launch_the_app() throws Throwable {
        System.out.println("App launched");

    }

    @And("^Verify the \"([^\"]*)\" Page$")
    public void verify_the_page(String page) throws Throwable {

        if(page.equals("Splash")) {
            splashScreen.ValidateSplashScreen();
            System.out.println("Splash Screen Displayed");
        }
        else if(page.equals("Home")){
            home.Verify_Logo();
            home.Verify_SettingsButton();
            home.Verify_MoreOptionsButton();
            home.Verify_ImageView();
            home.Verify_ExperiencePowerOf100msText();
            home.Verify_JumpRightInText();
            home.Verify_EnterYourNameField();
            home.Verify_JoiningLinkText();
            home.Verify_URLInputField();
            home.Verify_JoinNowButton();
            home.Verify_ScanQRCodeButton();
            System.out.println("Home Page Displayed");
        }
        else if(page.equals("Preview")){
            preview.Verify_VideoScreen();
            preview.Verify_BackButton();
            preview.Verify_LogoIcon();
            preview.Verify_GetStartedText();
            preview.Verify_SetupText();
            preview.Verify_ParticipantCountText();
            preview.Verify_NetworkQualityIcon();
            preview.Verify_ToggleAudioButton();
            preview.Verify_ToggleVideoButton();
            preview.Verify_SwitchCameraButton();
            preview.Verify_NoiseCancellationIcon();
            preview.Verify_SpeakerIcon();
            preview.Verify_NameField(pd.NameText);
            preview.Verify_MeetingJoiningButton();
            System.out.println("Preview Page Displayed");
        }
        else if(page.equals("Meeting")){
            meeting.Verify_VideoView();
            meeting.Verify_Logo();
            meeting.Verify_SwitchCamera();
            meeting.Verify_SpeakerIcon();
            meeting.Verify_AudioLevel();
            meeting.Verify_ChatText();
            meeting.Verify_ChatViewer();
            meeting.Verify_ChatBox();
            meeting.Verify_EndCallButton();
            meeting.Verify_ToggleAudioButton();
            meeting.Verify_ToggleVideoButton();
            meeting.Verify_MessageMenu();
            meeting.Verify_SettingsMenuButton();
            System.out.println("Meeting Page Displayed");
        }
        else if(page.equals("Leave Session")){
            meeting.Verify_LeaveSession();
            meeting.Verify_LeaveSessionDescription();
            meeting.Verify_LeaveSessionButton();
            System.out.println("Leave Session Page Displayed");
        }
    }

    @And("^User enters the \"([^\"]*)\"$")
    public void user_enters_the(String options) throws MalformedURLException, InterruptedException {

        if(options.equals("Name")){
            home.enter_Name(pd.NameText);
            System.out.println("Name Entered");
        }
        else if (options.equals("Joining Link")) {
            home.enter_JoiningLink(pd.RoomLink);
            System.out.println("Joining Link Entered");
        }
    }

    @And("^User clicks on \"([^\"]*)\" button$")
    public void userClicks(String button){

        if(button.equals("Join Now")){
            home.click_JoinNow();
            System.out.println("Join Now Button in Home Page Clicked");
        }
        else if (button.equals("Join Now Room")) {
            preview.click_MeetingJoiningButton();
            System.out.println("Meeting Joining Button in Preview Page Clicked");
        }
        else if (button.equals("End Call")) {
            meeting.click_EndCall();
            System.out.println("End Call Button in Meeting Page Clicked");
        }
        else if (button.equals("Leave Session")) {
            meeting.click_LeaveSession();
            System.out.println("Leave Session Button in Meeting Page Clicked");
        }
    }

}
