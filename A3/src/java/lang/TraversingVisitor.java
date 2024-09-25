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




    
}

// Program ::= FuncDecl*;

// FuncDecl ::= IdDecl Param* Block;
// Param ::= <ID>;
// Block : Stmt ::= Stmt*;
// IdDecl ::= <ID>;

// abstract Stmt;
// VarDeclStmt : Stmt ::= IdDecl [Expr];
// VarAssignStmt : Stmt ::= IdUse:Expr Numeral:Expr;
// FunctionCallStmt: Stmt ::= FunctionCall:Expr;
// ReturnStmt: Stmt ::= Expr;
// WhileStmt: Stmt ::= Expr Block;
// IfStmt: Stmt ::= Expr ThenBlock:Block [ElseBlock:Block];

// abstract Expr;
// FunctionCall : Expr ::= IdUse:Expr Expr*;

// abstract BinOp : Expr ::= Left:Expr Right:Expr;
// Add : BinOp;
// Mul : BinOp;
// Div : BinOp;
// Sub : BinOp;
// Eq : BinOp;
// Neq : BinOp;
// Lt : BinOp;
// Gt : BinOp;
// Mod : BinOp;
// Le : BinOp;
// Ge : BinOp;

// Neg : Expr ::= Expr;
// Numeral : Expr ::= <NUMERAL>;
// IdUse : Expr ::= <ID>; 

