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
public class gbvariable {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void gbvariable() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.printLogs(var_glbvar);
		tg_String var_local = "Null";
		tg.printLogs(var_local);
		var_local = tg.saveToVariable(var_glbvar, var_local);
		tg.printLogs(var_local);
		var_glbvar = tg.saveToVariable("NewGlobal", var_glbvar);
		tg.printLogs(var_glbvar);
		tg.printLogs(var_local);
		var_local = tg.saveToVariable(var_glbvar, var_local);
		tg.printLogs(var_local);
		tg.close();
	}
}