package ObjectRepository;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class PreviewPage_OR  extends  BaseScreen  {
    public PreviewPage_OR(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    By PermissionVideoScreen = By.id("com.android.permissioncontroller:id/grant_dialog");
    By AllowPermissionVideoButton = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
    By PermissionAudioScreen = By.id("com.android.permissioncontroller:id/grant_dialog");
    By AllowPermissionAudioButton = By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button");

    By VideoScreen = By.id("live.hms.app2:id/preview_card");
    By BackButton = By.id("live.hms.app2:id/close_btn");
    By LogoIcon = By.id("live.hms.app2:id/logo_iv");
    By GetStartedText = By.id("live.hms.app2:id/name_tv");
    By SetupText = By.id("live.hms.app2:id/description_tv");
    By ParticipantCountText = By.id("live.hms.app2:id/participant_count_text");
    By NetworkQualityIcon = By.id("live.hms.app2:id/network_quality");
    By ToggleAudioButton = By.id("live.hms.app2:id/button_toggle_audio");
    By ToggleVideoButton = By.id("live.hms.app2:id/button_toggle_video");
    By SwitchCameraButton = By.id("live.hms.app2:id/button_switch_camera");
    By NoiseCancellationIcon = By.id("live.hms.app2:id/icon_noise_cancellation");
    By SpeakerIcon = By.id("live.hms.app2:id/icon_output_device");
    By NameField = By.id("live.hms.app2:id/edit_text_name");
    By MeetingJoiningButton =By.id("live.hms.app2:id/button_join_meeting");

    public void Verify_VideoScreen() {
        try {
            waitAndFindElement(PermissionVideoScreen);
            elementDisplayed(PermissionVideoScreen);
            click(AllowPermissionVideoButton);

            waitAndFindElement(PermissionAudioScreen);
            elementDisplayed(PermissionAudioScreen);
            click(AllowPermissionAudioButton);

            waitAndFindElement(VideoScreen);
            elementDisplayed(VideoScreen);

        }catch (Exception e){

            waitAndFindElement(VideoScreen);
            elementDisplayed(VideoScreen);
        }

    }

    public void Verify_BackButton() {
        waitAndFindElement(BackButton);
        elementDisplayed(BackButton);
    }

    public void Verify_LogoIcon() {
        waitAndFindElement(LogoIcon);
        elementDisplayed(LogoIcon);
    }

    public void Verify_GetStartedText() {
        waitAndFindElement(GetStartedText);
        elementDisplayed(GetStartedText);
    }

    public void Verify_SetupText() {
        waitAndFindElement(SetupText);
        elementDisplayed(SetupText);
    }

    public void Verify_ParticipantCountText() {
        waitAndFindElement(ParticipantCountText);
        elementDisplayed(ParticipantCountText);
    }

    public void Verify_NetworkQualityIcon() {
        waitAndFindElement(NetworkQualityIcon);
        elementDisplayed(NetworkQualityIcon);
    }

    public void Verify_ToggleAudioButton() {
        waitAndFindElement(ToggleAudioButton);
        elementDisplayed(ToggleAudioButton);
    }

    public void Verify_ToggleVideoButton() {
        waitAndFindElement(ToggleVideoButton);
        elementDisplayed(ToggleVideoButton);
    }

    public void Verify_SwitchCameraButton() {
        waitAndFindElement(SwitchCameraButton);
        elementDisplayed(SwitchCameraButton);
    }

    public void Verify_NoiseCancellationIcon() {
        waitAndFindElement(NoiseCancellationIcon);
        elementDisplayed(NoiseCancellationIcon);
    }

    public void Verify_SpeakerIcon() {
        waitAndFindElement(SpeakerIcon);
        elementDisplayed(SpeakerIcon);
    }

    public void Verify_NameField(String name) {
        waitAndFindElement(NameField);
        elementDisplayed(NameField);

        String nameField = getText(NameField);
        assertEquals(nameField, name);
    }

    public void Verify_MeetingJoiningButton() {
        waitAndFindElement(MeetingJoiningButton);
        elementDisplayed(MeetingJoiningButton);
    }

    public void click_MeetingJoiningButton(){
        click(MeetingJoiningButton);
    }


}