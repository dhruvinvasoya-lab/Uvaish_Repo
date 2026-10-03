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
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
@Listeners(TestListener.class);
public class iframetc001 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void iframetc001() {
		tg.openBrowser();
		tg.wait(2);
		tg.navigateToUrl("https://demo.automationtesting.in/Frames.html");
		tg.wait(5);
		tg.switchToFrame("ele_singleiframe");
		tg.wait(2);
		tg.type("ele_singleframeinputfield", "SingleFramee");
		tg.wait(2);
		tg.switchToDefaultContent();
		tg.wait("ele_iframewithiframoption", ComparisonType.IS_VISIBLE);
		tg.click("ele_iframewithiframoption", 1);
		tg.wait(2);
		tg.switchToFrame("ele_nestedsingleiframe");
		tg.switchToFrame("ele_NestedNestframe");
		tg.wait("ele_NestedFrameTextinput", ComparisonType.IS_VISIBLE);
		tg.type("ele_NestedFrameTextinput", "NestedInput");
		tg.switchToParentFrame();
		if(tg.performAssert("ele_iframewithiframoption", ComparisonType.IS_INVISIBLE)){
		tg.printLogs("NOT VISIBLE Yet....!!!");
		}
		tg.switchToParentFrame();
		if(tg.performAssert("ele_iframewithiframoption", ComparisonType.IS_VISIBLE)){
		tg.printLogs("YES NOT IT IS VISIBLE.....!!!");
		}
		tg.printLogs("SUCCESSS.....");
		tg.close();
	}
}