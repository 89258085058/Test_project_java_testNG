package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import java.util.concurrent.TimeUnit;


public class ApplicationManager {
    WebDriver wd;

    public SeeionHelper seeionHelper;
    public NavigationHelper navigationHelper;
    public GroupHelper groupHelper;
    public ContactHelper contactHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook");
        groupHelper = new GroupHelper(wd);
        contactHelper = new ContactHelper(wd);
        seeionHelper = new SeeionHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        seeionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }
    public GroupHelper group() {
        return groupHelper;
    }
    public ContactHelper getContactHelper() {
        return contactHelper;
    }
    public NavigationHelper goTo() {
        return navigationHelper;
    }
}
