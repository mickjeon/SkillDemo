import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void testMultiply() {
        assertEquals(0, SkillDemo.multiply(2, 5));
        // this test fails
    }
}
