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
public class regularaction002 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void regularaction002() {
		tg.openBrowser();
		tg.wait(3);
		tg.navigateToUrl("https://demoqa.com/text-box");
		tg.wait(3);
		tg_String var_name = "";
		tg_String var_email = "";
		tg_String var_address = "";
		var_name = tg.saveToVariable("ABCDEF", var_name);
		var_email = tg.saveToVariable("abcdef@gmail.com", var_email);
		var_address = tg.saveToVariable("ADDRESS", var_address);
		tg.check.isVisible("ele_username1Field");
		tg.type("ele_username1Field", var_name);
		tg.wait(3);
		tg.type("ele_userEmail1", var_email);
		tg.wait(2);
		tg.check.isNotEqualTo(var_name,"ABCD");
		tg.check.isNotEqualTo(var_name,var_email);
		tg.printLogs("VARIABLE / SAVE TO VARIABLE ACTION DONE...........");
		tg.wait(2);
		tg.navigateToUrl("https://demoqa.com/text-box");
		tg.wait(5);
		tg.scrollToElement("ele_bookstoreapplication", Direction.DOWN);
		tg.scrollToElement("ele_username1Field", Direction.UP);
		tg.wait(2);
		tg.printLogs("SCROLL TO ACTION DONE...........");
		tg.navigateToUrl("https://demoqa.com/select-menu");
		tg.wait("ele_SelectMenuView", ComparisonType.IS_VISIBLE, 10);
		tg.scrollToElement("ele_OldStyleMenuPciker", Direction.DOWN);
		tg.wait(2);
		tg.click("ele_OldStyleMenuPciker", 1);
		tg.wait(3);
		tg.selectDropdownByIndex("ele_OldStyleMenuPciker",2);
		tg.wait(2);
		tg.printLogs("SELECT ACTION DONE..........");
		tg.wait(2);
		tg.navigateToUrl("https://demoqa.com/text-box");
		tg.wait(2);
		tg.takeFullScreenshot();
		tg.wait("ele_userName1", ComparisonType.IS_VISIBLE, 10);
		// [DISABLED] tg.swipe("ele_bookstoreapplication", Direction.UP);
		// [DISABLED] tg.swipe("ele_ToolsQALogo", Direction.DOWN);
		tg.swipe(Direction.LEFT);
		tg.swipe(Direction.RIGHT);
		tg.wait(2);
		tg.printLogs("TAKE FULL SCREENSHOT / SWIPE ACTION DONE............");
		tg.close();
	}
}