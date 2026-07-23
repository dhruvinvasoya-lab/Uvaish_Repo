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
public class tc_2 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_2() {
		tg.openBrowser();
				tg.wait(5);
		// [DISABLED] 		tg.testFunction("call_fun_1", new Object[]{});
		// [DISABLED] 		tg_String var_return = "null";
				tg.testFunction("presskey_fun", new Object[]{});
				tg.wait(5);
				tg.testFunction("screenshot", new Object[]{});
				tg.wait(2);
		// [DISABLED] 		tg.printLogs(var_return);
		tg.close();
	}
}