import classes.TranslationMemory;
import classes.Dictionary;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("OpenCATe Beta");
        TranslationMemory Tmem1 = new TranslationMemory();
        System.out.println("Introduce number of paragraphs");
        Tmem1.paragraphs=leer.nextInt();
        Tmem1.fullMem = new String[Tmem1.paragraphs][Tmem1.paragraphs];
        int i;
        for (i=0;i<Tmem1.paragraphs;i++){
            System.out.println("introduce source paragraph "+(i+1));
            Tmem1.fullMem[i][0]=leer.next();
            System.out.println("introduce target paragraph "+(i+1));
            Tmem1.fullMem[i][1]=leer.next();
        }
        leer.close();
    }
    
}