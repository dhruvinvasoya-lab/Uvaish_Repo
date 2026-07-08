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
public class tcm1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcm1() {
		tg.openBrowser();
				tg.click("ele_MakeAppointment6095639619689", 1);
				tg.wait("ele_Username14095716600869", ComparisonType.IS_VISIBLE);
				tg.type("ele_Username14095716600869", "John Doe");
				tg.wait("ele_Password16095716600869", ComparisonType.IS_VISIBLE);
				tg.type("ele_Password16095716600869", "ThisIsNotAPassword");
				tg.click("ele_Login17095716600869", 1);
		tg.close();
	}
}