package Mobilegestures;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.Baseclass;
import utilities.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Androidmobilepages extends Baseclass {

   actions act = new actions();
   
    @AndroidFindBy(accessibility = "Preference")
    private WebElement preference;

    @AndroidFindBy(accessibility =  "3. Preference dependencies")
    private WebElement preference_dependencies;

    @AndroidFindBy(id ="android:id/checkbox")
    private WebElement checkbox;

    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")
    private WebElement wifisettings;
    
    @AndroidFindBy(id ="android:id/edit")
    private WebElement edit;
    
    @AndroidFindBy(id = "android:id/button1")
    private WebElement ok;
    
    
    
    public Androidmobilepages(AndroidDriver driver) {
    	this.driver= driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

   
    
    public void enterWifiSettingName() throws Exception {
    	act.elementClick(preference);
    	act.Wait(5);
    	act.elementClick(preference_dependencies);
    	act.Wait(5);
    	act.elementClick(checkbox);
    	act.Wait(5);
    	act.elementClick(wifisettings);
    	act.Wait(5);
    	act.elementSendKeys(edit, "Vijay");
    	act.Wait(5);
    	act.elementClick(ok);
    }
}
