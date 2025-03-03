package selenium;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    WebDriver driver;

    public abstract void createWebDriver();

    public void quitWebDriver(){
        if (null != driver) {
            driver.quit();
        }
    }

    public WebDriver getWebDriver() {
        if (null == driver) {
            createWebDriver();
        }
        return driver;
    }
}
