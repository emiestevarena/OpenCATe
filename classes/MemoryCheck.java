package classes;
import java.util.*;

public class MemoryCheck{
    private ArrayList<String> splitSegment;
    private double percentage;

    public MemoryCheck(){
        splitSegment= new ArrayList<>();
        percentage=0;
    }

    public ArrayList<String> getSplitSegment(){
        return splitSegment;
    }

    public void setPercentage(double a){
        this.percentage=a;
    }

    public double getPercentage(){
        return percentage;
    }
}