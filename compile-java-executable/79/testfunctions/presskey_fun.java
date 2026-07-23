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

class presskey_fun {

	public static void presskey_fun() {
		tg.navigateToUrl("https://keyboard-tester.com/");
		tg.pressKey(CONTROL_Q, 1);
		tg.pressKey(BACKSPACE, 1);
		tg.pressKey(SPACEBAR, 1);
		tg.pressKey(CONTROL_R, 1);
		tg.pressKey(CONTROL_G, 1);
		// [DISABLED] tg.pressKey(CONTROL_S, 1);
		// [DISABLED] tg.pressKey(TAB, 1);
		// [DISABLED] tg.pressKey(ESCAPE, 1);
		// [DISABLED] tg.pressKey(F1, 1);
		// [DISABLED] tg.pressKey(F2, 1);
		// [DISABLED] tg.pressKey(F3, 1);
		// [DISABLED] tg.pressKey(F4, 1);
		// [DISABLED] tg.pressKey(F5, 1);
		// [DISABLED] tg.pressKey(F6, 1);
		// [DISABLED] tg.pressKey(F7, 1);
		// [DISABLED] tg.pressKey(F8, 1);
		// [DISABLED] tg.pressKey(F9, 1);
		// [DISABLED] tg.pressKey(F10, 1);
		// [DISABLED] tg.pressKey(F11, 1);
		// [DISABLED] tg.pressKey(F12, 1);
		// [DISABLED] tg.pressKey(DELETE, 1);
		// [DISABLED] tg.pressKey(PAGE_UP, 1);
		// [DISABLED] tg.pressKey(PAGE_DOWN, 1);
		// [DISABLED] tg.pressKey(HOME, 1);
		// [DISABLED] tg.pressKey(END, 1);
		// [DISABLED] tg.pressKey(ARROW_UP, 1);
		// [DISABLED] tg.pressKey(ARROW_DOWN, 1);
		// [DISABLED] tg.pressKey(ARROW_LEFT, 1);
		// [DISABLED] tg.pressKey(ARROW_RIGHT, 1);
		// [DISABLED] tg.pressKey(SPACEBAR, 1);
		// [DISABLED] tg.pressKey(SHIFT_SPACEBAR, 1);
		tg_String var_name = "";
		// [DISABLED] tg.networkAssert("networkassert");
		// [DISABLED] 		var_name = tg.readFromAPI("req1_api.json").getString();
		tg.printLogs(var_name);
	}
}