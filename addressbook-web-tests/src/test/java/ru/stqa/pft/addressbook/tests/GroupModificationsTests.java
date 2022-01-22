package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.GroupData;

public class GroupModificationsTests extends  TestBase{

    @Test
    public void testGroupModifiction() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupData("123", "twst1", "twst1"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGruopForm(new GroupData("123", "twst1", "twst1"));
        app.getGroupHelper().submitGroupModifivation();
        app.getGroupHelper().reternToGroupPage();
    }
}
