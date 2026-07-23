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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tc_2_copy_copy {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_2_copy_copy() {
		tg.openBrowser();
		tg.wait(5);
		tg.testFunction("call_fun_1_copy_copy", new Object[]{});
		// [DISABLED] tg_String var_return = "null";
		// [DISABLED] tg.testFunction("presskey_fun_copy_copy_copy", new Object[]{});
		// [DISABLED] tg.wait(5);
		// [DISABLED] tg.testFunction("screenshot_copy_copy_copy", new Object[]{});
		// [DISABLED] tg.wait(2);
		// [DISABLED] tg.printLogs(var_return);
		tg.close();
	}
}