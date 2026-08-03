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
public class suite5 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_3_copy_copy() {
        tg.openDevice();
        tg.wait(5);
        tg.testFunction("fun_call_2", new Object[] {});
        tg.close();
    }

    public static void call_fun_1() {
        tg.wait(5);
        tg.testFunction("launchdemoqa", new Object[] {});
        tg.wait(2);
        tg.testFunction("swipe_fun", new Object[] {});
        tg.wait(2);
    }

    public static void fun_call_2() {
        tg.wait(2);
        tg.testFunction("call_fun_1", new Object[] {});
    }

    public static void fun_call_2_copy_copy() {
        tg.wait(2);
        tg.testFunction("call_fun_1", new Object[] {});
    }

    public static void launchdemoqa() {
        tg.customScriptStart();
        driver.get("https://demoqa.com/automation-practice-form");
        tg.customScriptEnd();
        tg.wait(5);
    }

    public static void swipe_fun() {
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
    }
}
