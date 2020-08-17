package classes;
import java.util.Scanner;


public class TranslationMemory {
    private String[] Languages;
    private String[][] fullMem; //index 0 = source; index 1= target
    private int paragraphs;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public TranslationMemory createMemory(int a){
        TranslationMemory mem = new TranslationMemory();
        this.fullMem= new String[a][2];
        this.Languages= new String[2];
        this.paragraphs=a;
        this.setLanguages();
        return mem;
    }

    public void setLanguages(){
        
        System.out.println("Introduce source and target language");
        this.Languages[0]=leer.next();
        this.Languages[1]=leer.next();
        
    }

    public void setMemory(Glossary a){
        int i,j,k;
        String b;
        j=2147483000;
        for (i=0;i<this.getParagraphs();i++){
            System.out.println("introduce source paragraph "+(i+1)+" in language: "+this.getSourceLanguage());
            b=leer.next();
            this.setSource(i,b);
            a.searchEntry(b);
            System.out.println("introduce target paragraph "+(i+1)+" in language: "+this.getTargetLanguage());
            b=leer.next();
            k=b.length();
            j-=k-1;
            if(j<=0){
                System.out.println("Max length reached");
                while(i<this.paragraphs){
                    this.setTarget(i,"");
                    i++;
                }
                break;
            }else{
                this.setTarget(i,b);
                System.out.println("Characters left: "+j);
            }
            
        }
        
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