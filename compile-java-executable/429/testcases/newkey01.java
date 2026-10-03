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
public class newkey01 {

	@Test
	public void newkey01() {
		tg.openBrowser();
		tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
		tg.wait(4);
		tg.printPageSource();
		tg.setBrowserResolution("500", "500");
		tg.wait(3);
		tg.setBrowserResolution("1360", "1000");
		tg.wait(3);
		tg.pageLoadStart("RegisterPg");
		tg.wait("ele_firstname504", ComparisonType.IS_VISIBLE);
		tg.click("ele_firstname504", 1);
		tg.wait("ele_firstname504", ComparisonType.IS_VISIBLE);
		tg.type("ele_firstname504", "FirstName");
		tg.wait("ele_radioradio514", ComparisonType.IS_VISIBLE);
		tg.click("ele_radioradio514", 1);
		tg.wait("ele_checkbox289", ComparisonType.IS_VISIBLE);
		tg.click("ele_checkbox289", 1);
		tg.pageLoadEnd("RegisterPg");
		tg.pageLoadStart("WebTablePg");
		tg.wait("ele_webtable094", ComparisonType.IS_VISIBLE);
		tg.click("ele_webtable094", 1);
		tg.pageLoadEnd("WebTablePg");
		tg.pageLoadStart("FramesPg");
		tg.wait("ele_switchto238", ComparisonType.IS_VISIBLE);
		tg.click("ele_switchto238", 1);
		tg.wait("ele_frames499", ComparisonType.IS_VISIBLE);
		tg.click("ele_frames499", 1);
		tg.pageLoadEnd("FramesPg");
		tg.pageLoadStart("PracticePg");
		tg.wait("ele_practicesi778", ComparisonType.IS_VISIBLE);
		tg.click("ele_practicesi778", 1);
		tg.swipe(Direction.UP);
		tg.swipe(Direction.UP);
		tg.wait(2);
		tg.swipe(Direction.DOWN);
		tg.swipe(Direction.DOWN);
		tg.pageLoadEnd("PracticePg");
		tg.pageLoadStart("RegisterSitePg");
		tg.wait("ele_demosite740", ComparisonType.IS_VISIBLE);
		tg.click("ele_demosite740", 1);
		tg.pageLoadEnd("RegisterSitePg");
		tg.setBrowserResolution("500", "400");
		tg.wait(3);
		tg.printPageSource();
		tg.close();
	}
}