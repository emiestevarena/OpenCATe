package inout;
import classes.*;
import java.util.*;
import java.io.*;

public class GlossaryImport {
    private String line;
    private int entries;
    public void ReadGlossary(Glossary g){
        try {
          File myObj = new File("glossary.txt");
          Scanner myReader = new Scanner(myObj);
          this.entries=0;
          while (myReader.hasNextLine()) {
            this.line=myReader.nextLine();
            Entry e = new Entry();
            int j=0;
            String l1=null, l2=null;
            for(int i=0;i<this.line.length();i++){
                if(this.line.charAt(i)=='\t'){j=1;}
                else if(j==0){l1+=this.line.charAt(i);}
                else{l2+=this.line.charAt(i);}
            }
            e.setSource(l1);
            e.setTarget(l2);
            g.setEntryGlossary(e);
            System.out.println(g.getEntryGlossary().get(entries).toString());
            e=null;
            this.entries++;
          } 
          myReader.close();
          System.out.println("entries read: "+this.entries);
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
    }    
}
