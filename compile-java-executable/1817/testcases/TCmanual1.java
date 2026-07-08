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
public class tcmanual1 {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tcmanual1() {
		tg.openBrowser();
		tg.click("ele_MakeAppointment6094749903842", 1);
		tg.wait("ele_Username14094825067492", ComparisonType.IS_VISIBLE);
		tg.type("ele_Username14094825067492", "John Doe");
		tg.wait("ele_Password16094825067492", ComparisonType.IS_VISIBLE);
		tg.type("ele_Password16094825067492", "ThisIsNotAPassword");
		tg.click("ele_Login17094825067492", 1);
		tg.wait("ele_Facility12094902228142", ComparisonType.IS_VISIBLE);
		tg.selectDropdownByValue("ele_Facility12094902228142","Hongkong CURA Healthcare Center");
		tg.click("ele_Medicaid22094902228142", 1);
		tg.type("ele_visitdate26094902228142", "25/12/2025");
		tg.type("ele_comment28094902228142", "I have very high fever.");
		tg.click("ele_BookAppointment29094902228142", 1);
		tg.wait("ele_AppointmentConfirmationheading9094941618961", ComparisonType.IS_VISIBLE);
		tg.check.contains("ele_Facilityvalue12094941618961","Hongkong CURA Healthcare Center");
		tg.check.contains("ele_HealthcareProgramvalue16094941618961","Medicaid");
		tg.close();
	}
}