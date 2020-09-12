package services;
import classes.*;
import java.util.*;

public class GlossaryServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void setEntry(Glossary g){
        int b=0;
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
        while(b>0){
            System.out.println("Enter source and target glossary term "+g.getSourceEntry().size()+1);
            g.setSourceEntry(leer.next());
            g.setTargetEntry(leer.next());
            b--;
        }
        }
    }

    public void setExpression(Expressions ex){
        int b=0;
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
        while(b>0){
            System.out.println("Enter source and target expression"+ex.getSourceEntry().size()+1);
            ex.setSourceEntry(leer.next());
            ex.setTargetEntry(leer.next());
            System.out.println("Enter expression keyword in source language");
            ex.setSourceKey(leer.next());
            b--;
        }
        }
    }


    public void searchEntry(String a, Glossary g, Expressions e){
        for(int i=0;i<g.getSourceEntry().size();i++){
        if(a.contains(g.getSourceEntry().get(i))){
            System.out.println("Glossary entry found. Source: "+g.getSourceEntry().get(i)+", Target: "+g.getTargetEntry().get(i));
        }
        }
        for(int i=0;i<e.getSourceEntry().size();i++){
            if(a.contains(e.getSourceKey().get(i))){
                System.out.println("Expression entry found. Source: "+e.getSourceEntry().get(i)+", Target: "+e.getTargetEntry().get(i));
            }
            }
    }

    public static int check(int a) throws MyException{
        if(a>=0)return a;
        else throw new MyException("Number out of range");
    }
}