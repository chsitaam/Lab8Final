
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCaculator {
    Caculator caculator;
    @BeforeMethod
    public void setUp() {
        caculator = new Caculator();
    }

    @Test
    public void testSum(){
        Assert.assertEquals(caculator.sum(5,6), 11);
    }

    @Test
    public void testSubtract(){
        Assert.assertEquals(caculator.sub(6,6), 0);
    }
}
