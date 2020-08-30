package classes;
import java.util.*;

public class GlossaryServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void setEntry(Glossary g){
        int a=g.getEntries();
        System.out.println("Enter number of entries to the glossary:");
        int b=leer.nextInt();
        int c=b+a;
        while(a<c){
            System.out.println("Enter source and target glossary term "+(a+1));
            g.setSourceEntry(leer.next());
            g.setTargetEntry(leer.next());
            a++;
        }
        g.setEntries(c);
    }

    public void searchEntry(String a, Glossary g){
        int i;
        for(i=0;i<g.getEntries();i++){
        if(a.contains(g.getSourceEntry(i))){
            System.out.println("Entry found. Source: "+g.getSourceEntry(i)+", Target: "+g.getTargetEntry(i));
        }
        }
    }
}