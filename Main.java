import classes.TranslationMemory;
import classes.Dictionary;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("OpenCATe Beta");
        TranslationMemory Tmem1 = new TranslationMemory();
        System.out.println("Introduce number of paragraphs");
        int a=leer.nextInt();
        Tmem1.createMemory(a);
        Tmem1.setParagraphs(a);
        Tmem1.setMemory();
        leer.close();
    }
    
}