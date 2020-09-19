package inout;
import classes.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    private String tFile;
    Scanner leer = new Scanner(System.in, "UTF-8").useDelimiter("\n");
    
    public void createTarget(){
        System.out.println("introduce file name (no extension)");
        this.tFile = leer.next();
        File targetFile = new File(this.tFile+".txt");
        try{
            if (targetFile.createNewFile()) {
                System.out.println("File created: " + targetFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void writeTarget(TranslationMemory tm){
        String tText="";
        int i;
        for (i=0;i<tm.getSegments().size();i++){
            tText+=tm.getSegments().get(i).getTarget()+"\n";
        }
        try {
            FileWriter wTarget = new FileWriter(this.tFile+".txt");
            wTarget.write(tText);
            wTarget.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }              
    }
    
}