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

@Listeners(TestListener.class)
public class uivaish_web_2 {

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void case1() {
        tg.openBrowser();
        tg.wait("ele_firstname350", ComparisonType.IS_VISIBLE, 10);
        tg.click("ele_firstname350", 1);
        String var_fname = "test";
        tg.type("ele_firstname350", var_fname);
        tg.wait("ele_lastname015", ComparisonType.IS_CLICKABLE, 10);
        tg.click("ele_lastname015", 1);
        tg.type("ele_lastname015", "#TGITVAR.name");
        String var_email = "";
        var_email = tg.saveToVariable("#TGITVAR.email", var_email);
        tg.writeToCSV("var_email", var_email, "");
        // [DISABLED] String var_email = "testgrid@gmail.com";
        tg.click("ele_nameexampl862", 1);
        tg.type("ele_nameexampl862", var_email);
        tg.click("ele_genderradi912", 1);
        int var_mobilenum = 1234567890;
        tg.click("ele_mobilenumb016", 1);
        tg.type("ele_mobilenumb016", var_mobilenum);
        tg.check.isVisible("ele_mobilenumb016");
        tg.check.isEqualTo(var_mobilenum, "1234567890");
        tg.check.isNotEqualTo(var_mobilenum, "1325");
        tg.check.isGreaterThanOrEqualTo(var_mobilenum, "1234665");
        tg.check.isGreaterThan(var_mobilenum, "123");
        tg.check.isLessThan(var_mobilenum, "1234567891");
        tg.check.isLessThanOrEqualTo(var_mobilenum, "1234567891");
        tg.check.isOn("ele_genderradi912");
        tg.check.isEnabled("ele_genderradi912");
        tg.check.isSelected("ele_genderradi912");
        tg.check.isClickable("ele_firstname350");
        tg.click("ele_dateofbirt356", 1);
        tg.wait("ele_januaryfeb237", ComparisonType.IS_CLICKABLE, 10);
        tg.click("ele_januaryfeb237", 1);
        tg.selectDropdownByIndex("ele_januaryfeb237", 10);
        tg.wait("ele_selecttgwe374", ComparisonType.IS_CLICKABLE, 10);
        tg.click("ele_selecttgwe374", 1);
        tg.selectDropdownByValue("ele_selecttgwe374", "2004");
        tg.click("ele_divtgwebco217", 1);
        tg.wait("ele_subjectsin378", ComparisonType.IS_CLICKABLE, 10);
        tg.click("ele_subjectsin378", 1);
        tg.type("ele_subjectsin378", "mat");
        tg.pressKey(ENTER, 1);
        tg.type("ele_subjectsin378", "computer sci");
        tg.pressKey(ENTER, 1);
        tg.hoverOverElement("ele_svgtgwebco119");
        tg.click("ele_svgtgwebco119", 1);
        tg.openNewTab();
        tg.navigateToUrl("https://www.saucedemo.com/");
        tg.pageLoadStart("saucelab");
        tg.wait("ele_username341", ComparisonType.IS_CLICKABLE, 10);
        tg.type("ele_username341", "standard_user");
        tg.click("ele_password779", 1);
        tg.type("ele_password779", "secret_sauce");
        tg.click("ele_loginbutto213", 1);
        tg.tapByImage("ele_saucelabsb752", 0.65);
        tg.click("ele_addtocart219", 1);
        tg.click("ele_backtoprod511", 1);
        tg.click("ele_addtocart551", 1);
        tg.click("ele_addtocart960", 1);
        tg.click("ele_addtocart139", 1);
        tg.click("ele_addtocart858", 1);
        tg.click("ele_shoppingca376", 1);
        tg.scrollToElement("ele_checkout491", Direction.DOWN);
        tg.swipe("ele_shoppingca376", Direction.UP);
        tg.customScriptStart();
        System.out.println("😀😃😄😁😆😅😂🤣😊😇🙂🙃😉😍🥰😘😗😙😚😋😜😝😛🤑🤗🤔🤭🤫🤥😶😐😑😬😴😪😵🤯🥳😎🤓🧐🤠🥶🥵😱😨😰😥😓🤤😢😭😤😠😡🤬🤡👻💀☠️👽👾🤖🎃😺😸😹😻😼😽🙀😿😾🔥💥✨⚡🌟🌈☀️🌙⭐🌍🌎🌏🍎🍔🍕🍟🍩🍫🍿🍉🍓🍒🍇🥭🍌🍍🥥🥝🍑🍆🥕🌽🥦🍗🍖🥓🍤🍣🍱🍜🍝🍕🍰🎂🍪🍷🍺☕🥤🚗🏎️🚀✈️🛸🚲🛵🏍️🛶⚓🚦🗺️🏁⚽🏀🏈⚾🎾🏐🏉🎱🏓🥊🥋🎮🎲🎯🎳🎼🎵🎶🎤🎧🎸🥁🎹🎻📱💻🖥️⌨️🖱️🖨️📷📸📹🎥📺📻📡💡🔦🕯️📚📖📄📊📈📉📌📍✂️🖊️🖋️✏️📝💼📁📂🗂");
        tg.customScriptEnd();
        tg.printPageSource();
        tg.setBrowserResolution("900", "1200");
        tg.pageLoadEnd("saucelab");
        tg.printLogs("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        // [DISABLED] tg.switchToTab(0);
        // [DISABLED] String var_address = "";
        // [DISABLED] var_address = tg.saveToVariable("1212, x building, y street, z city", var_address);
        // [DISABLED] tg.click("ele_currentadd096", 1);
        // [DISABLED] tg.type("ele_currentadd096", var_address);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void declare() {
        tg.openBrowser();
        tg.navigateToUrl("https://demo.automationtesting.in/Register.html");
        tg.wait(10);
        tg.declare("ele_name", "//input[@placeholder='First Name']");
        tg.type("ele_name", "test");
        tg.wait(5);
        tg.performDoubleClick("ele_selectskil672");
        tg.wait(2);
        tg.scrollToElement("ele_submit389", Direction.DOWN);
        tg.wait(5);
        tg.click("ele_firstpassw278", 1);
        tg.typeEncrypted("ele_firstpassw278", "YQ8MK8lRZeDKYbe5X1ViYw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.wait(2);
        tg.performRightClick("ele_imagetrgt051");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void presskey() {
        tg.openBrowser();
        tg.navigateToUrl("https://keyboard-tester.com/");
        tg.pressKey(CONTROL_Q, 1);
        tg.pressKey(BACKSPACE, 1);
        tg.pressKey(SPACEBAR, 1);
        tg.pressKey(CONTROL_R, 1);
        tg.pressKey(CONTROL_G, 1);
        tg.pressKey(CONTROL_S, 1);
        tg.pressKey(TAB, 1);
        tg.pressKey(ESCAPE, 1);
        tg.pressKey(F1, 1);
        tg.pressKey(F2, 1);
        tg.pressKey(F3, 1);
        tg.pressKey(F4, 1);
        tg.pressKey(F5, 1);
        tg.pressKey(F6, 1);
        tg.pressKey(F7, 1);
        tg.pressKey(F8, 1);
        tg.pressKey(F9, 1);
        tg.pressKey(F10, 1);
        tg.pressKey(F11, 1);
        tg.pressKey(F12, 1);
        tg.pressKey(DELETE, 1);
        tg.pressKey(PAGE_UP, 1);
        tg.pressKey(PAGE_DOWN, 1);
        tg.pressKey(HOME, 1);
        tg.pressKey(END, 1);
        tg.pressKey(ARROW_UP, 1);
        tg.pressKey(ARROW_DOWN, 1);
        tg.pressKey(ARROW_LEFT, 1);
        tg.pressKey(ARROW_RIGHT, 1);
        tg.pressKey(SPACEBAR, 1);
        tg.pressKey(SHIFT_SPACEBAR, 1);
        tg.networkAssert("networkassert");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void repeatif() {
        tg.openBrowser();
        tg.navigateToUrl("https://www.rapidtables.com/tools/click-counter.html?c1=0");
        int var_counter = 0;
        while (tg.verify.isLessThanOrEqualTo(var_counter, 0)) {
            tg.click("ele_buttontgwebcomma470", 1);
            var_counter = tg.increments(var_counter, 1);
        }
        tg.testFunction("screenshot");
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void startif() {
        tg.openBrowser();
        if (tg.performAssert("ele_a661", ComparisonType.IS_VISIBLE)) {
            tg.click("ele_a661", 1);
            if (tg.performAssert("ele_a661", ComparisonType.EQUAL_TO, "A")) {
                tg.click("ele_a661", 1);
                if (tg.performAssert("ele_a661", ComparisonType.NOT_EQUAL_TO, "b")) {
                    tg.click("ele_a661", 1);
                    if (tg.performAssert("ele_a661", ComparisonType.CONTAINS, "A")) {
                        if (tg.performAssert("ele_buttontgwe137", ComparisonType.GREATER_THAN_OR_EQUAL_TO, 1)) {
                            tg.click("ele_buttontgwe137", 1);
                            if (tg.performAssert("ele_buttontgwe137", ComparisonType.LESS_THAN_OR_EQUAL_TO, 5)) {
                                if (tg.performAssert("ele_buttontgwe137", ComparisonType.GREATER_THAN, 5)) {
                                } else {
                                    tg.click("ele_a661", 1);
                                }
                            }
                        }
                    }
                }
            }
        }
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void writetocsv() {
        tg.openBrowser();
        tg.close();
    }

    public static void screenshot() {
        tg.takeFullScreenshot();
    }
}
