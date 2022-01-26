package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.ContactData;

public class ContactModificationTests extends  TestBase {

    @Test
    public void testContactModifiction() {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereGroup()) {
            app.getContactHelper().createContact(new ContactData("123","123" ,"123",
                    "123","123", "123", "123", "123", "123", "123"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("555","555" ,"555",
                "555","555", "555", "555", "555", "555", "555"));
        app.getContactHelper().submitContactModifivation();
        app.getContactHelper().reternToContactPage();
    }

}