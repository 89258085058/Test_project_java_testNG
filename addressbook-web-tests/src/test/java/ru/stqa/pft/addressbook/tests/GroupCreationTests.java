package ru.stqa.pft.addressbook.tests;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        List<GroupData> before = app.getGroupHelper().getGoupList();
        GroupData group = new GroupData("name1", "headers1", "test2");
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGoupList();
        Assert.assertEquals(after.size(),before.size() + 1);

        int max = 0;
        for (GroupData g : after){
            if (g.getId() > max) {
                max = g.getId();
            }
        }
        group.setId(max);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}

