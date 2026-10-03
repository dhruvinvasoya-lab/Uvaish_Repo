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
public class tdmjson {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tdmjson() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait(2);
		JSONObject var_nameVar = tg.getJsonData("http://localhost/s/csv-to-json/20250310/FZFxYN.json");
		tg_String var_fname = "null";
		tg_String var_lname = "null";
		tg_int var_count = 0;
		while(tg.verify.isLessThan(var_count, 3)){
		var_fname = tg.saveToVariable(var_fname, var_nameVar, "$.records["+var_count+"].First");
		tg.type("ele_firstnameregdemo", var_fname);
		tg.printLogs(var_fname);
		var_lname = tg.saveToVariable(var_lname, var_nameVar, "$.records["+var_count+"].Last");
		tg.type("ele_addressregdemo", var_lname);
		tg.printLogs(var_lname);
		var_count = tg.increments(var_count, 1);
		}
		tg.printLogs("NORMAL TDM JSON DONE............");
		tg_Double var_dbl = 0.0;
		var_count = tg.saveToVariable(0, var_count);
		while(tg.verify.isLessThan(var_count, 2)){
		var_fname = tg.saveToVariable(var_fname, var_nameVar, "$.records["+var_count+"].First");
		tg.type("ele_firstnameregdemo", var_fname);
		tg.printLogs(var_fname);
		var_dbl = tg.saveToVariable(88.99, var_dbl);
		tg.type("ele_addressregdemo", var_dbl);
		tg.printLogs(var_dbl);
		var_count = tg.increments(var_count, 1);
		}
		tg.printLogs("TDM JSON DOUBLE DONE...........");
		tg.close();
	}
}