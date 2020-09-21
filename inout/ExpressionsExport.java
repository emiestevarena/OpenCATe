package inout;
import classes.*;
import java.io.*;
import java.util.*;

public class ExpressionsExport {
    /*public void createGlossary(){
        File targetFile = new File("newExpressions.txt");
        try{
            if (targetFile.createNewFile()) {
                System.out.println("Export glossary created");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }*/

    public void writeGlossary(Glossary g){
        String enter="";
        Collections.sort(g.getExpressionsGlossary());
        for (int i=0;i<g.getExpressionsGlossary().size();i++){
            enter+=g.getExpressionsGlossary().get(i).getSource()+"\\"+g.getExpressionsGlossary().get(i).getTarget()+"\\"+g.getExpressionsGlossary().get(i).getSourceKey()+"\n";
        }
        try {
            FileWriter wTarget = new FileWriter("newExpressions.txt");
            wTarget.write(enter);
            wTarget.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }              
    }
}
