package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToContactPage();
        app.getContactHelper().createContact(new ContactData("123","123" ,"123",
                "123","123", "123", "123", "123", "123", "123"));
    }

}