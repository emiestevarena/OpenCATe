package services;
import classes.*;

public class MemoryServices {
    public void setWords(TranslationMemory a,int b, MemoryCheck c){
        int length = a.getSourceMem(b).length();
        int wordCount = 1;
        for(int i=0;i<length;i++){
            if(a.getSourceMem(b).charAt(i)==' '){
                wordCount++;
            }
        } 
        c.empty(wordCount);
        c.setWordCount(wordCount);
        c.setCurrentSegment(b);
    }

    public void setStrings(TranslationMemory a,int b, MemoryCheck c){
        int j=0;
        int k=0;
        String l=" ";
        for(int i=0; i<a.getSourceMem(b).length();i++){
            if(a.getSourceMem(b).charAt(i)==' '){
                c.setSplitSegment(j, l);
                j++;
                k=i+1;
            }else{
                l = a.getSourceMem(b).substring(k,i+1);
            }
        }
        c.setSplitSegment(j, l);
    }

    public void compareStrings(TranslationMemory a, MemoryCheck b){
        int c;
        for(int i=0;i<b.getCurrentSegment();i++){
            c=0;
            String l=a.getSourceMem(i);
            for(int j=0;j<b.getWordCount();j++){
                String k =b.getSplitSegment(j);
                if(l.contains(k)){
                    c++;
                    b.setPercentage(c*100/b.getWordCount());
                }
            }
            if(b.getPercentage()>=70){
                System.out.println("Similar segment, "+b.getPercentage()+"% match:");
                System.out.print(a.getTargetMem(i));
                System.out.println("");
                break;
            }           
        }
    }

    public void delete(MemoryCheck a){
        a=null;
    }
}