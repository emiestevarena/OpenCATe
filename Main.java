import classes.*;
import services.*;
import inout.*;

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
        serv.Import(dic);
        GlossaryServices gs = new GlossaryServices();
        gs.setEntry(dic);
        gs.setExpression(dic);
        Source s = new Source();
        s.ReadFile();
        Tmem1.createMemory(s);
        serv.SourceToMemory(Tmem1, s);
        serv.inputMemory(Tmem1, dic, files, gs);
        leer.close();
    }
    
}