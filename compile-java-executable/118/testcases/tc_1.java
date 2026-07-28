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
public class tc_1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc_1() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demoqa.com/automation-practice-form");
		tg.wait("ele_firstname343", ComparisonType.IS_VISIBLE);
		tg.click("ele_firstname343", 1);
		// [DISABLED] tg.wait("ele_firstname343", ComparisonType.IS_VISIBLE);
		tg_String var_name = "";
		var_name = tg.saveToVariable("#TGITVAR.name", var_name);
		tg.printLogs(var_name);
		tg.type("ele_firstname343", "#TGITVAR.body");
		// [DISABLED] tg.wait("ele_lastname015", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_lastname015", 1);
		// [DISABLED] tg.wait("ele_lastname015", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.type("ele_lastname015", "si");
		tg.close();
	}
}