import org.testng.Assert;
import org.testng.annotations.Test;



@Test
public class TestH {
    public void testArea() {
        int a = 5;
        int b =7;
        Assert.assertEquals(a > b, false);
    }

}
