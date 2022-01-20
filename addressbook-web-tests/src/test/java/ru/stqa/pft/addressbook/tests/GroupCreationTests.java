package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.GroupData;


public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() {
      app.getNavigationHelper().goToGroupPage();
      app.getGroupHelper().initGroupVreation();
      app.getGroupHelper().fillGruopForm(new GroupData("123", "test1", "test2"));
      app.getGroupHelper().submitGroupCreation();
      app.getGroupHelper().reternToGroupPage();

    }
}

