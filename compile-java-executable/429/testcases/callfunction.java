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
public class callfunction {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void callfunction() {
		tg.openBrowser();
				tg.wait(5);
				tg.testFunction("toolsqafunction");
		// [DISABLED] 		tg.testFunction("declaretest");
				tg.wait(2);
				tg.openNewTab();
				tg.switchToTab(1);
				tg.wait(3);
				tg.navigateToUrl("https://www.facebook.com/");
				tg.wait(5);
		tg.typeEncrypted("ele_fbpasssnew", "I81aOfwcpzO7OJWh5vdosg==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait(2);
				tg.click("ele_svgtgwebco949", 1);
				tg.wait(3);
				tg.printLogs("OPEN TAB / SWITCH TAB / TYPE ENCRYPTED ACTION DONE............");
		tg.close();
	}
}