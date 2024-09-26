package lang;

import lang.ast.Leaf;
import lang.ast.Pair;
import lang.ast.Program;

public class Compiler {
    

    public static Object CodeProber_parse(String[] args) throws Throwable {
        return parse(args);
    }

    public static Program parse(String[] args) {
        Leaf l1 = new Leaf(1);
        Leaf l2 = new Leaf(2);
        Leaf l3 = new Leaf(3);
        Pair p1 = new Pair(l2, l3);
        Pair p2 = new Pair(l1, p1);
        Program p = new Program(p2);
        return p;
    }

    public static void main(String args[]) {
        Program p = parse(args);
        p.prettyPrint(System.out);
    }
}
