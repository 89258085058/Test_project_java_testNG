package ru.stqa.pft.addressbook.tests;
import org.testng.annotations.Test;


public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeliteon() {
        app.goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelected();
        app.getGroupHelper().reternToGroupPage();

    }
}
