package ObjectRepository;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class MeetingPage_OR  extends  BaseScreen  {
    public MeetingPage_OR(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    By VideoView = By.id("live.hms.app2:id/hms_video_view");
    By Logo = By.id("live.hms.app2:id/logo_iv");
    By SwitchCamera = By.id("live.hms.app2:id/button_switch_camera");
    By SpeakerIcon = By.id("live.hms.app2:id/icon_output_device");
    By AudioLevel = By.id("live.hms.app2:id/audio_level");
    By ChatText = By.id("live.hms.app2:id/chatExtra");
    By ChatViewer = By.id("live.hms.app2:id/sendToBackground");
    By ChatBox = By.id("live.hms.app2:id/chatView");
    By EndCallButton = By.id("live.hms.app2:id/button_end_call");
    By ToggleAudioButton = By.id("live.hms.app2:id/button_toggle_audio");
    By ToggleVideoButton = By.id("live.hms.app2:id/button_toggle_video");
    By MessageMenu = By.id("live.hms.app2:id/message_menu");
    By SettingsMenuButton = By.id("live.hms.app2:id/button_settings_menu");
    By LeaveSession = By.id("live.hms.app2:id/leave_layout");
    By LeaveSessionDescription = By.id("live.hms.app2:id/end_session_description");
    By LeaveSessionButton = By.id("live.hms.app2:id/end_session_button");

    public void Verify_VideoView() {
        waitAndFindElement(VideoView);
        elementDisplayed(VideoView);
    }

    public void Verify_Logo() {
        waitAndFindElement(Logo);
        elementDisplayed(Logo);
    }

    public void Verify_SwitchCamera() {
        waitAndFindElement(SwitchCamera);
        elementDisplayed(SwitchCamera);
    }

    public void Verify_SpeakerIcon() {
        waitAndFindElement(SpeakerIcon);
        elementDisplayed(SpeakerIcon);
    }

    public void Verify_AudioLevel() {
        waitAndFindElement(AudioLevel);
        elementDisplayed(AudioLevel);
    }

    public void Verify_ChatText() {
        waitAndFindElement(ChatText);
        elementDisplayed(ChatText);
    }

    public void Verify_ChatViewer() {
        waitAndFindElement(ChatViewer);
        elementDisplayed(ChatViewer);
    }

    public void Verify_ChatBox() {
        waitAndFindElement(ChatBox);
        elementDisplayed(ChatBox);
    }

    public void Verify_EndCallButton() {
        waitAndFindElement(EndCallButton);
        elementDisplayed(EndCallButton);
    }

    public void Verify_ToggleAudioButton() {
        waitAndFindElement(ToggleAudioButton);
        elementDisplayed(ToggleAudioButton);
    }

    public void Verify_ToggleVideoButton() {
        waitAndFindElement(ToggleVideoButton);
        elementDisplayed(ToggleVideoButton);
    }

    public void Verify_MessageMenu() {
        waitAndFindElement(MessageMenu);
        elementDisplayed(MessageMenu);
    }

    public void Verify_SettingsMenuButton() {
        waitAndFindElement(SettingsMenuButton);
        elementDisplayed(SettingsMenuButton);
    }

    public void click_EndCall(){
        click(EndCallButton);
    }

    public void click_LeaveSession(){
        click(LeaveSessionButton);
    }

    public void Verify_LeaveSession() {
        waitAndFindElement(LeaveSession);
        elementDisplayed(LeaveSession);
    }

    public void Verify_LeaveSessionDescription() {
        waitAndFindElement(LeaveSessionDescription);
        elementDisplayed(LeaveSessionDescription);
    }

    public void Verify_LeaveSessionButton() {
        waitAndFindElement(LeaveSessionButton);
        elementDisplayed(LeaveSessionButton);
    }
    

}
