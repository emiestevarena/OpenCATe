package classes;
import java.util.ArrayList;

public class Glossary {
    private ArrayList<ArrayList<String>> glossary = new ArrayList<>();
    private ArrayList<String> sourceEntry = new ArrayList<>();
    private ArrayList<String> targetEntry = new ArrayList<>();
    private int entries;
  
    
    public Glossary createDictionary(){
        Glossary dic=new Glossary();
        this.entries=0;
        return dic;
    }

    public void setSourceEntry(String a){
        this.sourceEntry.add(a);
    }

    public void setTargetEntry(String a){
        this.targetEntry.add(a);
    }

    public void setGlossary(ArrayList<String> a){
        this.glossary.add(a);
    }

    public void setEntries(int a){
        this.entries =a;
    }

    public String getSourceEntry(int a){
        return sourceEntry.get(a);
    }

    public String getTargetEntry(int a){
        return targetEntry.get(a);
    }
    
    public ArrayList<String> getGlossary(int a){
        return glossary.get(a);
    }

    public int getEntries(){
        return entries;
    }
    
}