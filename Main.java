import classes.TranslationMemory;
import classes.Glossary;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("OpenCATe Beta");
        TranslationMemory Tmem1 = new TranslationMemory();
        Glossary dic= new Glossary();
        dic.createDictionary();
        dic.setEntry();
        System.out.println("Introduce number of paragraphs");
        int a=leer.nextInt();
        Tmem1.createMemory(a);
        Tmem1.setParagraphs(a);
        Tmem1.setMemory(dic);
        leer.close();
    }
    
}