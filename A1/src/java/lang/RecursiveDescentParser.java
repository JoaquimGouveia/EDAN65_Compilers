package lang;

import static lang.ast.LangParser.Terminals.*;


public class RecursiveDescentParser extends RDPTemplate {


    @Override 
    protected void parseProgram() {
        statement();
    }

    private void statement(){
        switch(peek()) { //fungerar peak? 
            case ID: assignment(); break;
            case IF: ifStmt(); break;
            case FOR: forStmt(); break;
            default: error("Expecting statement, found "+ peek());
        }
    }

    private void assignment(){
        accept(ID);accept(ASSIGN);expr(); //maybe+ accept(SEMICOLON);
    }

    private void ifStmt(){
        accept(IF); expr(); accept(THEN); statement(); accept(FI); //maybe+ accept(SEMICOLON);
    }

    private void forStmt() {
        accept(FOR); accept(ID); accept(ASSIGN); expr(); accept(UNTIL); expr(); accept(DO); statement(); accept(OD); //maybe+ accept(SEMICOLON);
    }

    private void expr(){
        switch(peek()){
            case ID: accept(ID); break;
            case NUMERAL: accept(NUMERAL); break;
            case NOT: accept(NOT); expr(); break;
            default: error("error, found "+ peek());
        }
    }
}
