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
public class suite2 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_1_copy() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_1_rec_copy() {
        tg.openDevice();
        tg.wait(1);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void tc_2_copy() {
        tg.openDevice();
        tg.wait(5);
        tg.wait(2);
        tg.close();
    }

    public static void fun1_copy() {
        tg.wait(1);
    }

    public static void fun_convert_2_copy() {
        tg.wait(5);
        tg.wait(2);
    }

    public static void func_copy_copy() {
        tg.wait(5);
        tg.wait(2);
    }
}
