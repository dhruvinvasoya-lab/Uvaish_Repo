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
public class tdmtgivar {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdmtgivar() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait(2);
		tg.type("ele_firstnameregdemo", "#TGITVAR.First");
		tg.wait(3);
		tg.type("ele_addressregdemo", "#TGITVAR.Last");
		tg.wait(3);
		tg.swipe(Direction.UP);
		tg.wait(3);
		START_CUSTOM_SCRIPT;
		driver.get("https://demoqa.com/login");
		END_CUSTOM_SCRIPT;
		tg.wait(2);
		tg.close();
	}
}