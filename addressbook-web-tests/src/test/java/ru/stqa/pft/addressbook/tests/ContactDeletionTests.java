package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactDeletionTests extends TestBase{

    @Test(enabled = false)
    public void testContactDeliteon() {
        app.goTo().goToHomePage();
        if (! app.getContactHelper().isThereContact()) {
            app.goTo().goToContactPage();
            app.getContactHelper().createContact(new ContactData("123","123" ,"123",
                    "123","123", "123", "123", "123", "123", "123"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactSelected();
        app.goTo().goToHomePage();

    }
}
