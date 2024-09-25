package lang;

import lang.ast.*;

public abstract class TraversingVisitor implements lang.ast.Visitor {

/**
 * Traverses each node, passing the data to the children.
 * Returns the data unchanged.
 * Overriding methods may change the data passed and the data returned.
 */

protected Object visitChildren(ASTNode node, Object data) {
    for (int i = 0; i < node.getNumChild(); ++i) {
        node.getChild(i).accept(this, data);
    }
    return data;
}


public Object visit(List node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Opt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Program node, Object data) {
    return visitChildren(node, data);
}
public Object visit(FuncDecl node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Param node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Block node, Object data) {
    return visitChildren(node, data);
}
public Object visit(IdDecl node, Object data) {
    return visitChildren(node, data);
}
public Object visit(VarDeclStmt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(VarAssignStmt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(FunctionCallStmt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(ReturnStmt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(WhileStmt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(IfStmt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(FunctionCall node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Neg node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Numeral node, Object data) {
    return visitChildren(node, data);
}
public Object visit(IdUse node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Add node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Mul node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Div node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Sub node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Eq node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Neq node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Lt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Gt node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Mod node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Le node, Object data) {
    return visitChildren(node, data);
}
public Object visit(Ge node, Object data) {
    return visitChildren(node, data);
}

}


