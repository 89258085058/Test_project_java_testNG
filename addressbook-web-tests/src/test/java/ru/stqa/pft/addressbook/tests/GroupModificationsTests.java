package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationsTests extends  TestBase{

    @Test
    public void testGroupModifiction() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("123", "twst1", "twst1"));
        }
        List<GroupData> before = app.getGroupHelper().getGoupList();
        app.getGroupHelper().selectGroup(before.size() - 1);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData(before.get(before.size() -1).getId(),"123", "twst1", "twst1");
        app.getGroupHelper().fillGruopForm(group);
        app.getGroupHelper().submitGroupModifivation();
        app.getGroupHelper().reternToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGoupList();
        Assert.assertEquals(after.size(),before.size());

        before.remove(before.size() - 1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
