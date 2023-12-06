package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import properties.ConfigurationManager;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class TestBase {

    @BeforeMethod
    public void createDriver() {
        WebDriverManager.chromedriver().setup();
        addListener("AllureSelenide", new AllureSelenide());
        Configuration.browser = "Chrome";
        Configuration.driverManagerEnabled = true;
        open(ConfigurationManager.configuration().url());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}

