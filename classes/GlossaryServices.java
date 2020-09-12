package classes;
import java.util.*;

public class GlossaryServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void setEntry(Glossary g){
        int b=0,c;
        int a=g.getEntries();
        System.out.println("Enter number of entries to the glossary:");
        try{
            b=(int) (check(leer.nextInt()));
        }catch(MyException me){
            b=0;
            System.out.println("Number below 0. Exitting glossary.");
        }catch(Exception e){
            leer.next();
            b=0;
            System.out.println("Wrong format, entries set to cero. Exitting glossary");
        }finally{
            c=b+a;
        }
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

    public static int check(int a) throws MyException{
        if(a>=0)return a;
        else throw new MyException("Number out of range");
    }
}