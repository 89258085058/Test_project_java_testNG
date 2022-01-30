package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;


public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeliteon() {
        app.getNavigationHelper().goToGroupPage();
        if (!app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("123", "twst1", "twst1"));
        }
        List<GroupData> before = app.getGroupHelper().getGoupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().deleteSelected();
        app.getGroupHelper().reternToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGoupList();
        Assert.assertEquals(after.size(), before.size() - 1);
        before.remove(before.size() - 1);
        Assert.assertEquals(before, after);
    }
}
