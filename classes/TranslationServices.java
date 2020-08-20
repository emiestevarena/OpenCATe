package classes;
import java.util.Scanner;

public class TranslationServices {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public void inputMemory(TranslationMemory a, Glossary b, Output c){
        int i,j,k;
        String d;
        j=a.getMaxLength();
        for (i=0;i<a.getParagraphs();i++){
            System.out.println("introduce source paragraph "+(i+1)+" in language: "+a.getSourceLanguage());
            d=leer.next();
            a.setSource(i,d);
            b.searchEntry(d);
            System.out.println("introduce target paragraph "+(i+1)+" in language: "+a.getTargetLanguage());
            d=leer.next();
            k=d.length();
            j-=k-1;
            if(j<=0){
                System.out.println("Max length reached");
                while(i<a.getParagraphs()){
                    a.setTarget(i,"");
                    i++;
                }
                break;
            }else{
                a.setTarget(i,d);
                System.out.println("Characters left: "+j);
                a.setMaxLength(j);
                c.writeTarget(a);
            }
            
        }
    }
    
}