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

class toolsqafunction {

	public static void toolsqafunction() {
		tg.wait(5);
		tg.navigateToUrl("https://demoqa.com/login");
		tg.wait(5);
		tg.check.isVisible("ele_userName1");
		tg.type("ele_userName1", "km@test.com");
		tg.wait(3);
		tg.type("ele_password1", "password1");
		tg.wait(5);
	}
}