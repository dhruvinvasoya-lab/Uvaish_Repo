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
public class netwassert {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void netwassert() {
		tg.openBrowser();
		tg.navigateToUrl("https://amazon.in/");
		tg.wait("ele_todaysdeal749", ComparisonType.IS_VISIBLE);
		tg.click("ele_todaysdeal749", 1);
		tg.wait("ele_mobiles921", ComparisonType.IS_VISIBLE);
		tg.click("ele_mobiles921", 1);
		tg.wait("ele_spantgwebc121", ComparisonType.IS_VISIBLE);
		tg.click("ele_spantgwebc121", 1);
		tg.wait("ele_fashion383", ComparisonType.IS_VISIBLE);
		tg.click("ele_fashion383", 1);
		tg.close();
	}
}