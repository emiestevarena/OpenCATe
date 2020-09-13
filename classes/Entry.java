package classes;

public class Entry implements Comparable<Entry> {
    private String source;
    private String target;

    public Entry(){
        source=null;
        target=null;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String s){
        this.source=s;
    }

    public String getTarget(){
        return target;
    }

    public void setTarget(String t){
        this.target=t;
    }
    
    @Override
    public int compareTo(Entry e){
        return source.compareTo(e.source);
    }
}
