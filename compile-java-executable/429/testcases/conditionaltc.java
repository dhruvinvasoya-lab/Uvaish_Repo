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
public class conditionaltc {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void conditionaltc() {
		tg.openBrowser();
		tg.wait(5);
		tg.navigateToUrl("https://www.rapidtables.com/tools/click-counter.html");
		tg.wait(5);
		tg_int var_count = 0;
		while(tg.verify.isNotEqualTo(var_count, 10)){
		tg.click("ele_PlusBtn", 1);
		tg.wait(2);
		tg.printLogs(var_count);
		var_count = tg.increments(var_count, 1);
		}
		while(tg.verify.isGreaterThan(var_count, 5)){
		tg.click("ele_MinusBtn", 1);
		tg.wait(2);
		tg.printLogs(var_count);
		var_count = tg.increments(var_count, -1);
		}
		tg.wait(5);
		tg.click("ele_ClearBtn", 1);
		tg.type("ele_countField", "100");
		tg.wait(2);
		tg.click("ele_ClearBtn", 1);
		tg.wait(9);
		tg.printLogs("REPEAT IF ACTION DONE...........");
		tg.navigateToUrl("https://demoqa.com/webtables");
		tg.wait(5);
		if(tg.performAssert("ele_firstnametable", ComparisonType.EQUAL_TO, "Kartik")){
		tg.printLogs("YES EQUAL TO EXPECTED......");
		} else {
		tg.printLogs("JUMPED TO START ELSE.........");
		tg.wait(2);
		if(tg.performAssert("ele_tableage39", ComparisonType.EQUAL_TO, 39)){
		if(tg.performAssert("ele_tablecierra", ComparisonType.EQUAL_TO, "Cierra")){
		if(tg.performAssert("ele_tableage39", ComparisonType.LESS_THAN , 50)){
		if(tg.performAssert("ele_tableage39", ComparisonType.LESS_THAN_OR_EQUAL_TO , 40)){
		if(tg.performAssert("ele_tablecierra", ComparisonType.CONTAINS , "rra")){
		tg.wait(2);
		}
		}
		}
		}
		}
		}
		tg.printLogs("START IF ACTION DONE...........");
		tg.close();
	}
}