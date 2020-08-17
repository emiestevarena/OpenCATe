package classes;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void createTarget(){
        System.out.println("introduce file name (no extension)");
        String a = leer.next();
        File targetFile = new File(a+".txt");
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
    
}