import org.junit.*;
import models.FindAndReplace;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by Guest on 1/2/18.
 */
public class FindAndReplaceTest {
//    @Test
//    public void sentence_returnUserInput_String() {
//        FindAndReplace testFindAndReplace = new FindAndReplace();
//        List<String> expectedOutput = new ArrayList<String>();
//        expectedOutput.add("whatever");
//        assertEquals(expectedOutput, testFindAndReplace.sentence("whatever"));
//    }
    @Test
    public void findAndReplace_replaceUserInput_String() {
        FindAndReplace testFindAndReplace = new FindAndReplace();
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("Hello you say");
        assertEquals(expectedOutput, testFindAndReplace.findAndReplace("whatever you say", "whatever", "Hello"));
    }
}
