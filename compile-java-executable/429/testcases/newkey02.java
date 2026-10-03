import io.testgrid.listeners.TestListener;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
@Listeners(TestListener.class);
public class newkey02 {

	@Test
	public void newkey02() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait(4);
		tg_String var_v1 = "";
		var_v1 = tg.saveToVariable(var_v1, "capability", "browserName");
		tg_String var_v2 = "";
		var_v2 = tg.saveToVariable(var_v2, "regex", "[A-Za-z]{5,10}");
		START_CUSTOM_SCRIPT;
		System.out.println("BrowserName : "+var_v1);
		System.out.println("Regex : "+var_v2);
		END_CUSTOM_SCRIPT;
		tg.close();
	}
}