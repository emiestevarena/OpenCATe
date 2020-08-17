import classes.Source;
import classes.Target;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("OpenCATe Beta");
        Source sText = new Source();
        System.out.println("Introduce number of paragraphs");
        sText.paragraphs=leer.nextInt();
        sText.TMem = new String[sText.paragraphs];
        Target tText = new Target();
        tText.paragraphs=sText.paragraphs;
        tText.TMem = new String[tText.paragraphs];
        int i;
        for (i=0;i<sText.paragraphs;i++){
            System.out.println("introduce source paragraph "+(i+1));
            sText.TMem[i]=leer.next();
            System.out.println("introduce target paragraph "+(i+1));
            tText.TMem[i]=leer.next();
        }
        leer.close();
    }
    
}