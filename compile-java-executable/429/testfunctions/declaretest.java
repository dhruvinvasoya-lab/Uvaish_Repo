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

class declaretest {

	public static void declaretest() {
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait("ele_automationdemosite", ComparisonType.IS_VISIBLE, 10);
		tg.check.isVisible("ele_FirstName");
		tg.check.isVisible("ele_lastName");
		tg_int var_count = 1;
		tg.wait(2);
		// [DISABLED] while(tg.verify.isLessThan(var_count, 3)){
		tg.declare("ele_Names", "/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]", var_count);
		tg.type("ele_Names", "Demo");
		var_count = tg.increments(var_count, 1);
		// [DISABLED] }
		tg.printLogs("DECLARE ACTION DONE.............");
	}
}