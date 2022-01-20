package ru.stqa.pft.addressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class ApplicationManager {
    WebDriver wd;

    private SeeionHelper seeionHelper;
    private final NavigationHelper navigationHelper = new NavigationHelper();
    private GroupHelper groupHelper;

    public void init() {
        navigationHelper.wd = new FirefoxDriver();
        navigationHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        navigationHelper.wd.get("http://localhost/addressbook/group.php");
        groupHelper = new GroupHelper(navigationHelper.wd);
        seeionHelper = new SeeionHelper(wd);
        seeionHelper.login("admin", "secret");
    }


    public void stop() {
        navigationHelper.wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
