package classes;

public class Segment {
    private String source;
    private String target;

    public Segment(){
        source=null;
        target=null;
    }

    public void setSource(String a){
        this.source=a;
    }

    public void setTarget(String a){
        this.target=a;
    }

    public String getSource(){
        return source;
    }

    public String getTarget(){
        return target;
    }
}
