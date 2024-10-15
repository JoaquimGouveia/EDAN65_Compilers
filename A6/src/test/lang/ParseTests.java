package lang;

import java.io.File;

import org.junit.Test;

public class ParseTests {
    /** Directory where the test input files are stored. */
    private static final File TEST_DIRECTORY = new File("testfiles/parser");

    @Test public void expressions() {
        Util.testValidSyntax(TEST_DIRECTORY, "expressions.in");
    }

    @Test public void functionCalls() {
        Util.testValidSyntax(TEST_DIRECTORY, "functionCalls.in");
    }

    @Test public void gcd1() {
        Util.testValidSyntax(TEST_DIRECTORY, "gcd1.in");
    }

    @Test public void gcd2() {
        Util.testValidSyntax(TEST_DIRECTORY, "gcd2.in");
    }

    @Test public void ifStmt() {
        Util.testValidSyntax(TEST_DIRECTORY, "ifStmt.in");
    }

    @Test public void nestedWhile() {
        Util.testValidSyntax(TEST_DIRECTORY, "nestedWhile.in");
    }

    @Test public void returnStmt() {
        Util.testValidSyntax(TEST_DIRECTORY, "returnStmt.in");
    }

    @Test public void simplifiedFunctionDeclarationList() {
        Util.testValidSyntax(TEST_DIRECTORY, "simplifiedFunctionDeclarationList.in");
    }

    @Test public void variableDeclarationsAndUses() {
        Util.testValidSyntax(TEST_DIRECTORY, "variableDeclarationsAndUses.in");
    }

    @Test public void finalExample() {
        Util.testValidSyntax(TEST_DIRECTORY, "finalExample.in");
    }

    @Test public void comment() {
        Util.testValidSyntax(TEST_DIRECTORY, "comment.in");
    }

    @Test public void notTypeCorrect() {
        Util.testValidSyntax(TEST_DIRECTORY, "notTypeCorrect.in");
    }

    @Test public void nestledEmptyBlock() {
        Util.testValidSyntax(TEST_DIRECTORY, "nestledEmptyBlock.in");
    }

    @Test
    public void error() {
        Util.testSyntaxError(TEST_DIRECTORY, "error.in");
    }

    @Test 
    public void example() {
        Util.testSyntaxError(TEST_DIRECTORY, "example.in");
    }
}
