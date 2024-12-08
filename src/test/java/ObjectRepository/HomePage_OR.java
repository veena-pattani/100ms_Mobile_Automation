package ObjectRepository;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


public class HomePage_OR  extends  BaseScreen  {
    public HomePage_OR(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    By Logo = By.xpath("//android.widget.ImageView[@content-desc=\"100ms Logo\"]");
    By SettingsButton = By.id("live.hms.app2:id/action_settings");
    By MoreOptionsButton = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");
    By ImageView = By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.ImageView");
    By ExperiencePowerOf100msText = By.xpath("//android.widget.TextView[@text=\"Experience the power of 100ms\"]");
    By JumpRightInText =By.xpath("//android.widget.TextView[@text=\"Jump right in by pasting a room link or scanning a QR code\"]");

    By EnterYourNameField =By.id("live.hms.app2:id/edit_text_name");
    By JoiningLinkText =By.xpath("//android.widget.TextView[@text=\"Joining Link\"]");

    By URLInputField = By.id("live.hms.app2:id/tv_meeting_url_input_layout");

    By PasteURLField = By.id("live.hms.app2:id/edt_meeting_url");
    By JoinNowButton = By.id("live.hms.app2:id/btn_join_now");
    By ScanQRCodeButton = By.id("live.hms.app2:id/btn_scan_now");



    public void Verify_Logo() {
        waitAndFindElement(Logo);
        elementDisplayed(Logo);
    }

    public void Verify_SettingsButton() {
        waitAndFindElement(SettingsButton);
        elementDisplayed(SettingsButton);
    }

    public void Verify_MoreOptionsButton() {
        waitAndFindElement(MoreOptionsButton);
        elementDisplayed(MoreOptionsButton);
    }

    public void Verify_ImageView() {
        waitAndFindElement(ImageView);
        elementDisplayed(ImageView);
    }

    public void Verify_ExperiencePowerOf100msText() {
        waitAndFindElement(ExperiencePowerOf100msText);
        elementDisplayed(ExperiencePowerOf100msText);
    }

    public void Verify_JumpRightInText() {
        waitAndFindElement(JumpRightInText);
        elementDisplayed(JumpRightInText);
    }

    public void Verify_EnterYourNameField() {
        waitAndFindElement(EnterYourNameField);
        elementDisplayed(EnterYourNameField);
    }

    public void Verify_JoiningLinkText() {
        waitAndFindElement(JoiningLinkText);
        elementDisplayed(JoiningLinkText);
    }

    public void Verify_URLInputField() {
        waitAndFindElement(URLInputField);
        elementDisplayed(URLInputField);
    }

    public void Verify_JoinNowButton() {
        waitAndFindElement(JoinNowButton);
        elementDisplayed(JoinNowButton);
    }

    public void Verify_ScanQRCodeButton() {
        waitAndFindElement(ScanQRCodeButton);
        elementDisplayed(ScanQRCodeButton);
    }

    public void enter_Name(String name){
        ClearText(EnterYourNameField);
        sendKey(EnterYourNameField, name);
    }

    public void enter_JoiningLink(String link){
        click(URLInputField);
        ClearText(PasteURLField);
        sendKey(PasteURLField, link);
        closeKeyboard();
    }

    public void click_JoinNow(){
        click(JoinNowButton);
    }


}
