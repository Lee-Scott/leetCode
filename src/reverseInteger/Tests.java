package reverseInteger;

import org.junit.*;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void Test1() {
        Assert.assertEquals("reverse should be 321", 321, Solution.reverse(123));

    }

}