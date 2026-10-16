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
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tccurlone {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tccurlone() {
		tg.openDevice();
		tg_String var_lcapptoken = "Null";
		tg_String var_lcverid = "Null";
		tg.printLogs(var_gbid);
		tg.printLogs(var_gbappname);
		tg.printLogs(var_lcapptoken);
		tg.printLogs(var_lcverid);
				tg.readFromAPI("NewCurl_api.json", var_gbid, var_gbappname, var_lcapptoken, var_lcverid);
		tg.printLogs(var_gbid);
		tg.printLogs(var_gbappname);
		tg.printLogs(var_lcapptoken);
		tg.printLogs(var_lcverid);
		tg.close();
	}
}