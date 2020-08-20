package classes;

public class MemoryCheck{
    private int currentSegment;
    private int wordCount;
    private String[] splitSegment;
    private double percentage;

    public MemoryCheck empty(int a){
        MemoryCheck mc = new MemoryCheck();
        this.currentSegment=0;
        this.wordCount=a;
        this.splitSegment = new String[a];
        this.percentage=0;
        return mc;
    }

    public void setSplitSegment (int a, String b){
        this.splitSegment[a]=b;
    }

    public String getSplitSegment(int a){
        return splitSegment[a];
    }

    public void setCurrentSegment(int a){
        this.currentSegment=a;
    }

    public int getCurrentSegment(){
        return currentSegment;
    }

    public void setWordCount(int a){
        this.wordCount=a;
    }

    public int getWordCount(){
        return wordCount;
    }

    public void setPercentage(double a){
        this.percentage=a;
    }

    public double getPercentage(){
        return percentage;
    }
}