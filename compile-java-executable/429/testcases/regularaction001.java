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
public class regularaction001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void regularaction001() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demoqa.com/text-box");
		// https:demoqa.com/
		tg.wait(2);
		tg.check.isVisible("ele_userName1");
		tg.check.isNotEqualTo("ele_userName1","Email");
		tg.check.isEqualTo("ele_currentaddressTitle","Current Address");
		tg.check.contains("ele_currentaddressTitle","Current");
		tg_int var_CheckValue = 10;
		tg.check.isGreaterThanOrEqualTo(var_CheckValue,9);
		tg.check.isLessThanOrEqualTo(var_CheckValue,11);
		tg.check.isGreaterThan(var_CheckValue,8);
		tg.check.isLessThan(var_CheckValue,12);
		tg.wait(5);
		tg.printLogs("CHECK ACTION DONE..........");
		tg.wait(2);
		tg.navigateToUrl("https://demoqa.com/text-box");
		tg.wait(5);
		START_CUSTOM_SCRIPT;
		WebElement uname = driver.findElement(By.id("userName"));
		uname.sendKeys("Dwayne Johnson");
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("abcdef@gmail.com");
		WebElement we = driver.findElement(By.id("currentAddress"));
		we.sendKeys("Address Demo");// Add Screenshot will only work for Android platform
		END_CUSTOM_SCRIPT;
		tg.wait(3);
		tg.printLogs("CUSTOM SCRIPT ACTION DONE..........");
		tg.navigateToUrl("https://demoqa.com/text-box");
		tg.wait(5);
		tg.scrollToElement("ele_ButtonsMenu", Direction.DOWN);
		tg.click("ele_ButtonsMenu", 1);
		tg.wait(5);
		tg.performDoubleClick("ele_DoubleClickMe");
		tg.wait(4);
		tg.performRightClick("ele_RightClickMe");
		tg.wait(4);
		// [DISABLED] tg.click("ele_clickme1");
		// [DISABLED] tg.wait(2);
		tg.printLogs("DOUBLE / RIGHT CLICK ACTION DONE..............");
		tg.navigateToUrl("https://demoqa.com/menu");
		tg.wait("ele_MenuView", ComparisonType.IS_VISIBLE, 10);
		tg.hoverOverElement("ele_MainItem2View");
		tg.wait(2);
		tg.printLogs("HOVER ACTION DONE............");
		tg.close();
	}
}