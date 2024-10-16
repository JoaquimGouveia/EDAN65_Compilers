package lang;

import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import lang.Util;
import lang.ast.*;

/**
 * This is a parameterized test: one test case is generated for each input
 * file found in TEST_DIRECTORY. Input files should have the ".in" extension.
 */
@RunWith(Parameterized.class)
public class TestFunctionCalls {
    /** Directory where the test input files are stored. */
    private static final File TEST_DIRECTORY = new File("testfiles/functioncalls");

    private final String filename;
    public TestFunctionCalls(String testFile) {
        filename = testFile;
    }

    @Test public void runTest() throws Exception {
        PrintStream out = System.out;
            Program program = (Program) Util.parse(new File(TEST_DIRECTORY, filename));
            StringBuilder sb = new StringBuilder();
            for (FuncDecl f : program.getFuncDeclList()) {
                for (FuncDecl fd : f.functionCalls()){
                    sb.append(fd.getIdDecl().getID()).append("\n");
                }
            }
                String actual = sb.toString();
                Util.compareOutput(actual,
                        new File(TEST_DIRECTORY, Util.changeExtension(filename, ".out")),
                        new File(TEST_DIRECTORY, Util.changeExtension(filename, ".expected")));
            }

    @Parameters(name = "{0}")
    public static Iterable<Object[]> getTests() {
        return Util.getTestParameters(TEST_DIRECTORY, ".in");
    }
}