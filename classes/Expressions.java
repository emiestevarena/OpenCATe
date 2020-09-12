package classes;
import java.util.*;
public class Expressions extends Glossary {
    private ArrayList<String> sourceKey= new ArrayList<>();
    
    public Expressions(){
        super();        
    }

    public void setSourceKey(String a){
        this.sourceKey.add(a);
    }

    public ArrayList<String> getSourceKey(){
        return sourceKey;
    }

}
