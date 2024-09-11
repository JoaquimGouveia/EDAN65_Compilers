package lang;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.fail;

public class ParseTests {
    /** Directory where the test input files are stored. */
    private static final File TEST_DIRECTORY = new File("testfiles");

    @Test public void assign() {
        Util.testValidSyntax(TEST_DIRECTORY, "assign.in");
    }

    @Test public void testIf() {
        Util.testValidSyntax(TEST_DIRECTORY, "testIf.in");
    }

    @Test public void testFor() {
        Util.testValidSyntax(TEST_DIRECTORY, "testFor.in");}


}
