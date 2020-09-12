package services;
import classes.*;
import java.util.Scanner;


public class TranslationMemory {
    private String[] Languages;
    private String[][] fullMem; //index 0 = source; index 1= target
    private int paragraphs;
    private int max_length;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public TranslationMemory createMemory(Source a){
        TranslationMemory mem = new TranslationMemory();
        this.fullMem= new String[a.getLength()][2];
        this.Languages= new String[2];
        this.paragraphs=a.getLength();
        this.setLanguages();
        this.max_length=1073741000;
        return mem;
    }

    public void setLanguages(){
        
        System.out.println("Introduce source and target language");
        this.Languages[0]=leer.next();
        this.Languages[1]=leer.next();
        
    }

    public void setMaxLength(int a) {
        this.max_length=a;
    }

    public int getMaxLength(){
        return max_length;
    }

    public void setSource(int a, String b){
        this.fullMem[a][0]=b;
    }

    public void setTarget(int a, String b){
        this.fullMem[a][1]=b;
    }

    public void setParagraphs(int a){
        this.paragraphs=a;
    }
    
    public int getParagraphs(){
        return paragraphs;    
    }

    public String getSourceLanguage(){
        return Languages[0];
    }

    public String getTargetLanguage(){
        return Languages[1];
    }

    public String[][] getfullMem(){
        return fullMem;
    }

    public String getSourceMem(int i){
        return fullMem[i][0];
    }
    
    public String getTargetMem(int i){
        return fullMem[i][1];
    }   

}