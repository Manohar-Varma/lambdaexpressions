package lambdaexpressions;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringTest {

    @Test
    public void testConcatenate() {
        stringAdd myUnit = new stringAdd();

        String result = stringAdd.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
}
