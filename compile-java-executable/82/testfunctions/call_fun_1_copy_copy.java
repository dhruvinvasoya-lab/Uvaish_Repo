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

class call_fun_1_copy_copy {

	public static Object call_fun_1(String FirstName, String LastName, String amount) {
		tg_String var_TGReturn = "";
		tg.wait(5);
		tg.testFunction("presskey_fun_copy_copy_copy", new Object[]{});
		tg.wait(5);
		tg.testFunction("screenshot_copy_copy_copy", new Object[]{});
		tg.wait(2);
		tg_String var_sname = "null";
				var_sname = tg.readFromAPI("req1_api.json").getString();
		tg.printLogs(var_sname);
		START_CUSTOM_SCRIPT;
		System.out.println("FName " + FirstName);
		            System.out.println("LName " + LastName);
		            var_TGReturn = FirstName + " " + LastName + " " + amount;
		            System.out.println("Full Name " + var_TGReturn);
		END_CUSTOM_SCRIPT;
		return var_TGReturn;
	}
}