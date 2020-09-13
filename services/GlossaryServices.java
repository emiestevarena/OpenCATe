package services;
import classes.*;
import java.util.*;

public class GlossaryServices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void setEntry(Glossary g){
        int b=0;
        System.out.println("Enter number of glossary entries:");
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
            System.out.println("Enter source and target glossary term "+g.getEntryGlossary().size()+1);
            Entry en = new Entry();
            en.setSource(leer.next());
            en.setSource(leer.next());
            g.setEntryGlossary(en);
            en=null;
            b--;
        }
        }
    }

    public void setExpression(Glossary g){
        int b=0;
        System.out.println("Enter number of expression entries:");
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
            System.out.println("Enter source and target expression"+g.getExpressionsGlossary().size()+1);
            Expressions ex = new Expressions();
            ex.setSource(leer.next());
            ex.setTarget(leer.next());
            System.out.println("Enter expression keyword in source language");
            ex.setSourceKey(leer.next());
            g.setExpressionGlossary(ex);
            ex=null;
            b--;
        }
        }
    }


    public void searchEntry(String a, Glossary g){
        for(int i=0;i<g.getEntryGlossary().size();i++){
        if(a.contains(g.getEntryGlossary().get(i).getSource())){
            System.out.println("Glossary entry found. Source: "+g.getEntryGlossary().get(i).getSource()+", Target: "+g.getEntryGlossary().get(i).getTarget());
        }
        }
        for(int i=0;i<g.getExpressionsGlossary().size();i++){
            if(a.contains(g.getExpressionsGlossary().get(i).getSourceKey())){
                System.out.println("Expression entry found. Source: "+g.getExpressionsGlossary().get(i).getSource()+", Target: "+g.getExpressionsGlossary().get(i).getTarget());
            }
            }
    }

    public static int check(int a) throws MyException{
        if(a>=0)return a;
        else throw new MyException("Number out of range");
    }
}