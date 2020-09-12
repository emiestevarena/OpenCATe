package classes;
import java.util.ArrayList;

public class Glossary {
    private ArrayList<String> sourceEntry = new ArrayList<>();
    private ArrayList<String> targetEntry = new ArrayList<>();
    
    public Glossary(){

    }

    public void setSourceEntry(String a){
        this.sourceEntry.add(a);
    }

    public void setTargetEntry(String a){
        this.targetEntry.add(a);
    }

    public ArrayList<String> getSourceEntry(){
        return sourceEntry;
    }

    public ArrayList<String> getTargetEntry(){
        return targetEntry;
    }
    
}