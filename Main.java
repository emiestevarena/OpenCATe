import classes.TranslationMemory;
import classes.TranslationServices;
import classes.Glossary;
import classes.Output;
import classes.Source;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("OpenCATe Beta");
        Output files = new Output();
        TranslationServices serv = new TranslationServices();
        files.createTarget();
        TranslationMemory Tmem1 = new TranslationMemory();
        Glossary dic= new Glossary();
        dic.createDictionary();
        dic.setEntry();
        Source s = new Source();
        s.ReadFile();
        Tmem1.createMemory(s);
        serv.SourceToMemory(Tmem1, s);
        serv.inputMemory(Tmem1, dic, files);
        leer.close();
    }
    
}