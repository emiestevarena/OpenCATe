package classes;
import java.util.ArrayList;

public class Glossary {
    private ArrayList<Entry> entryGlossary = new ArrayList<>();
    private ArrayList<Expressions> expressionGlossary = new ArrayList<>();
    
    public Glossary(){

    }

    public void setEntryGlossary(Entry en){
        this.entryGlossary.add(en);
    }

    public void setExpressionGlossary(Expressions ex){
        this.expressionGlossary.add(ex);
    }

    public ArrayList<Entry> getEntryGlossary(){
        return entryGlossary;
    }

    public ArrayList<Expressions> getExpressionsGlossary(){
        return expressionGlossary;
    }
    
}