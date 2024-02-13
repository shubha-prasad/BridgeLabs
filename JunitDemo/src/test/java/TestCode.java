import org.example.TestLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCode {

    TestLogic test = new TestLogic();
    @Test
    public void testFindMax(){
        assertEquals(4,test.findMax(new int[]{1,3,4,2}));
    }
}
