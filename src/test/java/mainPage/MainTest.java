package mainPage;

import base.FailedWatcher;
import base.TestBase;
import io.qameta.allure.Attachment;
import io.qameta.allure.Owner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(FailedWatcher.class)
public class MainTest extends TestBase {

    @Owner("Базорова Виктория")
    @Test(description = "Заходим на страницу студии, нажимаем кнопку Войти")
    @Attachment
    public void createFirstTest() {
        MainPage mainpage = new MainPage();
        mainpage.openMainPage();
        mainpage.clickEntryBTN();
    }
}
