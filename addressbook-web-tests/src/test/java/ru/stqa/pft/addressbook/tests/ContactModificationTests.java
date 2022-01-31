package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends  TestBase {

    @Test(enabled = false)
    public void testContactModifiction() {
        app.goTo().goToHomePage();
        if (! app.getContactHelper().isThereContact()) {
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
