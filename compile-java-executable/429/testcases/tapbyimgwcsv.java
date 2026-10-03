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
public class tapbyimgwcsv {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tapbyimgwcsv() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait(5);
		tg.type("ele_firstnameregdemo", "Kartik");
		tg.wait(2);
		tg.type("ele_addressregdemo", "testing@email.com");
		tg.wait(3);
		tg.navigateToUrl("https://demoqa.com/modal-dialogs");
		tg.wait(5);
		tg.tapByImage("ele_img", 0.5);
		tg_String var_v1 = "Null";
		tg.printLogs(var_v1);
		tg_int var_v2 = 0;
		tg.writeToCSV("var_v1", var_v1, "");
		tg.writeToCSV("var_v2", var_v2, "");
		tg.writeToCSV("ele_firstnameregdemo", "ele_firstnameregdemo", "");
		tg.writeToCSV("ele_addressregdemo", "ele_addressregdemo", "");
		var_v1 = tg.saveToVariable("NAME", var_v1);
		tg.printLogs(var_v1);
		var_v2 = tg.saveToVariable(2500, var_v2);
		tg.writeToCSV("var_v1", var_v1, "");
		tg.writeToCSV("var_v2", var_v2, "");
		var_v1 = tg.getElementAttribute("ele_firstnameregdemo", "class", var_v1);
		tg.printLogs(var_v1);
		tg.close();
	}
}