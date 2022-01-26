package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.ContactData;

public class ContactHelper extends  HelpperBAse {

    public ContactHelper(WebDriver wd) {
        super(wd);

    }

    public void reternToContactPage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
    }

//
//    public void deleteSelected() {
//        click(By.name("delete"));
//    }
//
//    public void selectGroup() {
//        click(By.name("selected[]"));
//    }
//
//    public void initGroupModification() {
//        click(By.name("edit"));
//    }
//
//    public void submitGroupModifivation() {
//        click(By.name("update"));
//    }
//
    public void createContact(ContactData contact) {
        fillContactForm(contact);
        submitContactCreation();
        reternToContactPage();
    }
//
//    public boolean isThereGroup() {
//        return isElementPresent(By.name("selected[]"));
//    }
//

}
