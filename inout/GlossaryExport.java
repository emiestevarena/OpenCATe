package inout;
import classes.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GlossaryExport {
    
    public void createGlossary(){
        File targetFile = new File("newGlossary.txt");
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
    }

    public void writeGlossary(Glossary g){
        String enter="";
        Collections.sort(g.getEntryGlossary());
        for (int i=0;i<g.getEntryGlossary().size();i++){
            enter+=g.getEntryGlossary().get(i).getSource()+"\\"+g.getEntryGlossary().get(i).getTarget()+"\n";
        }
        try {
            FileWriter wTarget = new FileWriter("newGlossary.txt");
            wTarget.write(enter);
            wTarget.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }              
    }
}
