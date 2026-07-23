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
public class startif {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void startif() {
		tg.openBrowser();
		tg.navigateToUrl("https://www.rapidtables.com/tools/click-counter.html?c1=0");
		if(tg.performAssert("ele_count602", ComparisonType.EQUAL_TO, 0)){
		tg.click("ele_buttontgwebcomma470", 1);
		}
		if(tg.performAssert("ele_count602", ComparisonType.NOT_EQUAL_TO, 0)){
		tg.click("ele_buttontgwebcomma470", 1);
		}
		tg.close();
	}
}