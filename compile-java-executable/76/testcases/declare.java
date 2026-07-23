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
public class declare {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void declare() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait(10);
		tg.declare("ele_name", "//input[@placeholder='First Name']");
		tg.type("ele_name", "test");
		tg.wait(5);
		tg.performDoubleClick("ele_selectskil672");
		tg.wait(2);
		tg.scrollToElement("ele_submit389", Direction.DOWN);
		tg.wait(5);
		tg.click("ele_firstpassw278", 1);
		tg.typeEncrypted("ele_firstpassw278", "YQ8MK8lRZeDKYbe5X1ViYw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.wait(2);
		tg.performRightClick("ele_imagetrgt051");
		tg.close();
	}
}