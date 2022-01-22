package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupData;


public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeliteon() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("123", "twst1", "twst1"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelected();
        app.getGroupHelper().reternToGroupPage();

    }
}
