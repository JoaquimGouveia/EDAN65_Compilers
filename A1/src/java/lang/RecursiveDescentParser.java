package lang;

import static lang.ast.LangParser.Terminals.ASSIGN;
import static lang.ast.LangParser.Terminals.ID;
import static lang.ast.LangParser.Terminals.NUMERAL;

public class RecursiveDescentParser extends RDPTemplate {


    @Override 
    protected void parseProgram() {
        statement();
    }

    private void statement(){
        switch(peek()) { //fungerar peak? 
            case ID: assignment(); break;
            // case 
            // case 
            default: error("Expecting statement, found "+ peek());
        }
    }

    private void assignment(){
        accept(ID);accept(ASSIGN);expr(); //maybe+ accept(SEMICOLON);
    }

    private void expr(){
        switch(peek()){
            case ID: accept(ID); break;
            case NUMERAL: accept(NUMERAL); break;
            default: error("error, found "+ peek());
        }
    }
    
}
