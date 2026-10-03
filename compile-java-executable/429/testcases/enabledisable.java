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
public class enabledisable {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void enabledisable() {
		tg.openBrowser();
		tg.wait(3);
		tg.navigateToUrl("https://demoqa.com/automation-practice-form");
		// [DISABLED] tg.wait(3);
		// [DISABLED] tg.swipe(Direction.UP);
		// [DISABLED] tg.wait("ele_firstName1", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.type("ele_firstName1", "ABCDEFGH");
		// [DISABLED] tg.pressKey(BACKSPACE, 1);
		// [DISABLED] tg.pressKey(BACKSPACE, 1);
		// [DISABLED] tg.pressKey(BACKSPACE, 1);
		// [DISABLED] tg.pressKey(TAB, 1);
		// [DISABLED] tg.wait("ele_dateOfBirthInput1", ComparisonType.IS_VISIBLE);
		// [DISABLED] tg.click("ele_dateOfBirthInput1", 1);
		// [DISABLED] tg.wait(2);
		// [DISABLED] tg.pressKey(ESCAPE, 1);
		tg.wait(2);
		tg.pressKey(PAGE_UP, 1);
		tg.pressKey(PAGE_DOWN, 1);
		tg.close();
	}
}