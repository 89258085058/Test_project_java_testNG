package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.ContactData;


public class ContactDeletionTests extends TestBase{

    @Test
    public void testContactDeliteon() {
        app.getNavigationHelper().goToHomePage();
        if (! app.getContactHelper().isThereContact()) {
            app.getNavigationHelper().goToContactPage();
            app.getContactHelper().createContact(new ContactData("123","123" ,"123",
                    "123","123", "123", "123", "123", "123", "123"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContactSelected();
        app.getNavigationHelper().goToHomePage();

    }
}
