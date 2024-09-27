package lang;

import lang.ast.*;

public class MSNVisitor extends TraversingVisitor {
    public static int result(ASTNode n) {
        MSNVisitor v = new MSNVisitor();
        n.accept(v, null);
        return v.maxDepth;
    }

    private int currentDepth = 0;
    private int maxDepth = 0;

    @Override
    public Object visit(Block block, Object data) {
        currentDepth++;
        for (Stmt stmt : block.getStmts()) {
            stmt.accept(this, data);
        }
        maxDepth = Math.max(maxDepth, currentDepth);
        currentDepth--;
        return null;
    }

    // @Override
    // public Object visit(WhileStmt whileStmt, Object data) {
    //     currentDepth++;
    //     for (Stmt stmt : whileStmt.getBlock().getStmts()) {
    //         stmt.accept(this, data);
    //     }
    //     maxDepth = Math.max(maxDepth, currentDepth);
    //     currentDepth--;
    //     return null;
    // }

    // @Override
    // public Object visit(IfStmt ifStmt, Object data) {
    //     currentDepth++;
    //     for (Stmt stmt : ifStmt.getThenBlock().getStmts()) {
    //         stmt.accept(this, data);
    //     }
    //     if (ifStmt.hasElseBlock()) {
    //         for (Stmt stmt : ifStmt.getElseBlock().getStmts()) {
    //             stmt.accept(this, data);
    //         }
    //     }
    //     maxDepth = Math.max(maxDepth, currentDepth);
    //     currentDepth--;
    //     return null;
    // }
}
