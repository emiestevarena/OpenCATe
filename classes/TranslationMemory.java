package classes;
import java.util.*;

public class TranslationMemory {
    private ArrayList<Segment> segments;
    private int MaxLength;
    
    public TranslationMemory(){
        segments=new ArrayList<>();
        MaxLength=1073741000;
    }

    public ArrayList<Segment> getSegments(){
        return segments;
    }

    public int getMaxLength(){
        return MaxLength;
    }

    public void setMaxLength(int a){
        this.MaxLength=a;
    }
}
