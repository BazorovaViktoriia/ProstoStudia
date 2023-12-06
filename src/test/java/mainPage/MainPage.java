package mainPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import properties.ConfigurationManager;
import ru.yandex.qatools.htmlelements.element.Button;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private Button createBTN = new Button($(By.xpath("/html/body/div/div/div[1]/button")));

    @Step("Переходим по URL на страницу <Просто Студия>")
    public MainPage openMainPage() {
        open(ConfigurationManager.configuration().url());
        return this;
    }

    @Step("Нажимаем кнопку <Войти>")
    public MainPage clickEntryBTN() {
        createBTN.click();
        return this;
    }
}
