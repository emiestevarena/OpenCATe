package inout;
import java.util.*;
import classes.*;
import java.io.*;

public class ExpressionsImport{
    private String line;
    private int entries;
    public void ReadGlossary(Glossary g){
        try {
          File myObj = new File("expressions.txt");
          Scanner myReader = new Scanner(myObj);
          this.entries=0;
          while (myReader.hasNextLine()) {
            this.line=myReader.nextLine();
            Expressions e = new Expressions();
            int j=0;
            String l1="",l2="",l3="";
            for(int i=0;i<this.line.length();i++){
              if(this.line.charAt(i)=='\\'){j++;}
              else if(j==0){
                l1+=this.line.charAt(i);
                e.setSource(l1);
              }else if(j==1){
                l2+=this.line.charAt(i);
                e.setTarget(l2);
              }else{
                l3+=this.line.charAt(i);
                e.setSourceKey(l3);
              }
            }
            g.setExpressionGlossary(e);
            System.out.println(g.getExpressionsGlossary().get(entries).getSource()+"\t"+g.getExpressionsGlossary().get(entries).getTarget()+"\t"+g.getExpressionsGlossary().get(entries).getSourceKey());
            e=null;
            this.entries++;
          } 
          myReader.close();
          System.out.println("expressions read: "+this.entries);
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }
}           