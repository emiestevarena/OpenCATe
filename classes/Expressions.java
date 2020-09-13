package classes;

public class Expressions extends Entry {
    private String sourceKey;
    
    public Expressions(){
        super();
        sourceKey=null;        
    }

    public void setSourceKey(String a){
        this.sourceKey=a;
    }

    public String getSourceKey(){
        return sourceKey;
    }

}
