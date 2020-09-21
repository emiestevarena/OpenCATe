package services;
import classes.*;
import inout.*;
import java.util.*;

public class TranslationServices {
    private String sourceL;
    private String targetL;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void setUp(Source s,Glossary g,Output o){
        this.setLanguages();
        s.ReadFile();
        GlossaryImport gi = new GlossaryImport();
        gi.ReadGlossary(g);
        ExpressionsImport e = new ExpressionsImport();
        e.ReadGlossary(g);
        o.createTarget();
        gi=null;
        e=null;
    }

    private void setLanguages(){
        System.out.println("Enter source and target languages");
        this.sourceL=leer.next();
        this.targetL=leer.next();  
    }

    public void input(Source sou,Glossary g, Output o){
        TranslationMemory tm = new TranslationMemory();
        this.setGlossary(g);
        for(int i=0;i<sou.getSource().size();i++){
            Segment seg = new Segment();
            this.setSource(sou,seg, i);
            this.searchMatches(seg,tm,i,g);
            tm.setMaxLength(tm.getMaxLength()-seg.getSource().length());
            if(!checkLength(tm)){break;}
            else{
                this.setTarget(seg, i);
                tm.getSegments().add(seg);
                this.setGlossary(g);
                this.export(o, tm, g);
                seg=null;  
            }
        }
    }

    private void setSource(Source sou, Segment seg, int i){
        seg.setSource(sou.getSource().get(0));
        sou.getSource().remove(0);
        System.out.println("Source segment: "+(i+1)+" in "+sourceL);
        System.out.println(seg.getSource());
    }

    private void searchMatches(Segment seg, TranslationMemory tm, int i, Glossary g){
        GlossaryServices gs = new GlossaryServices();
        gs.searchEntry(seg.getSource(),g);
        gs= null;
        if(i>0){
            MemoryCheck mc= new MemoryCheck();
            MemoryServices ms = new MemoryServices();
            ms.setStrings(seg, i, mc);
            ms.compareStrings(tm, mc);
            ms.delete(mc);
            ms=null;
        }
    }

    private boolean checkLength(TranslationMemory tm){
        if(tm.getMaxLength()<0){
            System.out.println("Max length reached");
            return false;
        }else{
            return true;
        }
    }

    private void setTarget(Segment seg,int i){
        System.out.println("Introduce target segment: "+(i+1)+" in "+targetL);
        seg.setTarget(leer.next());
    }

    private void setGlossary(Glossary g){
        GlossaryServices gs = new GlossaryServices();
        gs.setEntry(g);
        gs.setExpression(g);
        gs=null;
    }

    private void export(Output o,TranslationMemory tm,Glossary g){
        o.writeTarget(tm);
        GlossaryExport ge = new GlossaryExport();
        ge.writeGlossary(g);
        ExpressionsExport ee= new ExpressionsExport();
        ee.writeGlossary(g);
        ge=null; ee=null;
    }
}
