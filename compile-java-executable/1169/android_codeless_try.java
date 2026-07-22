import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import io.testgrid.enums.Alert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

@Listeners(TestListener.class)
public class android_codeless_try {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void code_1() {
        tg.openDevice();
        tg.customScriptStart();
        driver.get("https://demoqa.com/automation-practice-form");
        tg.customScriptEnd();
        tg.wait(5);
        tg.pageLoadStart("demo_QA");
        tg.wait("ele_EditText1776156712780", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_EditText1776156712780", 1);
        String var_username = "test";
        tg.type("ele_EditText1776156712780", var_username, true);
        tg.wait("ele_EditText1776156804091", ComparisonType.IS_CLICKABLE, 10);
        tg.type("ele_EditText1776156804091", "grid", true);
        tg.wait("ele_EditText1776156834456", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_EditText1776156834456", 1);
        tg.type("ele_EditText1776156834456", "testgrid@testgrid.io", true);
        tg.click("ele_MaleRadioButton1776157210879", 1);
        tg.wait("ele_EditText1776156918136", ComparisonType.IS_CLICKABLE);
        int var_phnum = 1234567890;
        tg.click("ele_EditText1776156918136", 1);
        tg.type("ele_EditText1776156918136", var_phnum, true);
        tg.check.isVisible("ele_EditText1776156918136");
        tg.check.isEqualTo(var_phnum, "1234567890");
        tg.check.isNotEqualTo(var_phnum, "125");
        tg.check.isGreaterThanOrEqualTo(var_phnum, "12345678");
        tg.check.isLessThanOrEqualTo(var_phnum, "1234567999");
        tg.check.isGreaterThan(var_phnum, "123");
        tg.check.isLessThan(var_phnum, "1234567999");
        // All conditions are checked......✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅
        // [DISABLED] tg.check.contains(var_phnum,"1234");
        tg.pageLoadEnd("demo_QA");
        tg.printLogs("emoji  🚀 Test started... 🔍 Running steps... 🧪 Validating results... ⚙️ Processing actions... ✅ All good... 🎯 Test passed! 🏁");
        tg.printPageSource();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void code_2() {
        tg.openDevice();
        tg.testFunction("launchdemoqa");
        tg.wait("ele_EditText1776846706815", ComparisonType.IS_VISIBLE, 5);
        tg.click("ele_EditText1776846706815", 1);
        tg.typeEncrypted("ele_EditText1776846706815", "YQ8MK8lRZeDKYbe5X1ViYw==:MTIzNDU2Nzg5MTAxMTEyMQ==", true);
        tg.wait("ele_EditText1776861767562", ComparisonType.IS_CLICKABLE, 5);
        String var_lname = "";
        var_lname = tg.saveToVariable("#TGITVAR.name", var_lname);
        tg.click("ele_EditText1776156804091", 1);
        tg.type("ele_EditText1776156804091", var_lname, true);
        tg.declare("ele_email", "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText");
        tg.type("ele_email", "test@gmail.com", true);
        tg.wait(2);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void condition() {
        tg.openDevice();
        // [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270170096", 1);
        // [DISABLED] tg.wait(2);
        // [DISABLED] tg.wait("ele_httpswwwrapidtablescomtoolsclickcounterhtmlc10TextView1776331733948", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270756719", 1);
        // [DISABLED] tg.wait("ele_demoqacomautomationpracticeformEditText1776270756719", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.click("ele_demoqacomautomationpracticeformEditText1776270756719", 1);
        // [DISABLED] tg.wait("ele_demoqacomautomationpracticeformEditText1776270756719", ComparisonType.IS_VISIBLE, 5);
        // [DISABLED] tg.type("ele_demoqacomautomationpracticeformEditText1776270756719", "https://www.rapidtables.com/tools/click-counter.html?c1=0", true);
        // [DISABLED] tg.wait("ele_WebViewFrameLayout1776270792707", ComparisonType.IS_VISIBLE, 10);
        // [DISABLED] tg.click("ele_httpswwwrapidtablescomtoolsclickcounterhtmlc10TextView1776331733948", 1);
        tg.customScriptStart();
        driver.get("https://www.rapidtables.com/tools/click-counter.html?c1=0");
        tg.customScriptEnd();
        tg.wait("ele_Button1776270824252", ComparisonType.IS_VISIBLE, 10);
        if (tg.performAssert("ele_EditText1776270813212", ComparisonType.EQUAL_TO, 0)) {
            tg.click("ele_Button1776270824252", 1);
            if (tg.performAssert("ele_EditText1776270813212", ComparisonType.EQUAL_TO, 0)) {
                tg.click("ele_Button1776270824252", 1);
            }
        } else {
            tg.click("ele_Button1776270824252", 1);
        }
        while (tg.verify.isEqualTo("ele_Button1776270824252", 2)) {
            tg.click("ele_Button1776270824252", 1);
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void demo() {
        tg.openDevice();
        tg.wait(2);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void dissmiss_alert() {
        tg.openDevice();
        tg.wait(5);
        tg.tapByImage("ele_mainmenudetectlocationTextView1776866351598", 0.65);
        tg.wait(5);
        tg.alertButton("Don't Allow");
        tg.wait(10);
        tg.deactivateApp("org.asdtm.goodweather");
        tg.wait(5);
        tg.activateApp("org.asdtm.goodweather");
        tg.wait(10);
        // [DISABLED] tg.clearAppData("org.asdtm.goodweather");
        tg.wait(5);
        tg.activateApp("com.android.chrome");
        tg.wait(2);
        tg.setOrientation("LANDSCAPE");
        tg.wait(2);
        tg.clearAppData("com.android.chrome");
        tg.wait(5);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void register() {
        tg.openDevice();
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void swipe() {
        tg.openDevice();
        tg.customScriptStart();
        driver.get("https://www.amazon.in");
        tg.customScriptEnd();
        tg.wait(5);
        tg.swipe(Direction.LEFT);
        tg.wait(5);
        tg.swipe(Direction.RIGHT);
        tg.wait(5);
        tg.swipe(Direction.UP);
        tg.wait(5);
        tg.swipe(Direction.DOWN);
        tg.writeToCSV("text", "text", "swipe works perfectly....");
        tg.pullToRefresh("ele_View1776872579960");
        tg.close();
    }

    public static void launchdemoqa() {
        tg.customScriptStart();
        driver.get("https://demoqa.com/automation-practice-form");
        tg.customScriptEnd();
        tg.wait(5);
    }
}
