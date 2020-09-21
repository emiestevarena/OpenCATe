import classes.*;
import services.*;
import inout.*;

import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("OpenCATe Beta");
        Output files = new Output();
        Glossary dic= new Glossary();
        Source s = new Source();
        AuxMemory a= new AuxMemory();
        TranslationServices serv = new TranslationServices();
        serv.setUp(s, dic, files,a);
        serv.input(s, dic, files,a);
        leer.close();
    }
    
}