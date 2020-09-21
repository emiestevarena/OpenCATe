package services;
import classes.*;
import inout.AuxMemory;

public class MemoryServices {

    public void setStrings(Segment seg, MemoryCheck mc){
        int k=0;
        String l=" ";
        for(int j=0; j<seg.getSource().length();j++){
            if(seg.getSource().charAt(j)==' '){
                mc.getSplitSegment().add(l);
                k=j+1;
            }else{
                l = seg.getSource().substring(k,j+1);
            }
        }
        mc.getSplitSegment().add(l);
    }

    public void compareStrings(TranslationMemory tm,MemoryCheck mc){
        int c;
        for(int i=0;i<tm.getSegments().size();i++){
            c=0;
            for(int j=0;j<mc.getSplitSegment().size();j++){
                if(tm.getSegments().get(i).getSource().contains(mc.getSplitSegment().get(j))){
                   c++;
                   mc.setPercentage(c*100/mc.getSplitSegment().size()); 
                }
            }
            if(mc.getPercentage()>=70){
                System.out.println("Similar segment, "+mc.getPercentage()+"% match:");
                System.out.print(tm.getSegments().get(i).getTarget());
                System.out.println("");
                break;
            }
        };
        
    }

    public void compareStrings(AuxMemory a,MemoryCheck mc){
        int c;
        for(int i=0;i<a.getAuxMem().size();i++){
            c=0;
            for(int j=0;j<mc.getSplitSegment().size();j++){
                if(a.getAuxMem().get(i).getSource().contains(mc.getSplitSegment().get(j))){
                   c++;
                   mc.setPercentage(c*100/mc.getSplitSegment().size()); 
                }
            }
            if(mc.getPercentage()>=70){
                System.out.println("Similar segment, "+mc.getPercentage()+"% match:");
                System.out.print(a.getAuxMem().get(i).getTarget());
                System.out.println("");
                break;
            }
        };
        
    }

    public void delete(MemoryCheck a){
        a=null;
    }
}