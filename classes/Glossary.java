package classes;
import java.util.Scanner;

public class Glossary {
    private String[][] entry;
    private int entries;
    Scanner leer = new Scanner(System.in);
    
    public Glossary createDictionary(){
        Glossary dic=new Glossary();
        this.entry = new String[100][2];
        int i;
        for(i=0;i<100;i++){
            this.entry[i][0]="";
            this.entry[i][1]="";
        }
        return dic;
    }

    public void setEntry(){
        int a=0;
        int b=0;
        while(a==0){
            System.out.println("Enter source and target glossary term "+(b+1));
            this.entry[b][0]=leer.next();
            this.entry[b][1]=leer.next();
            System.out.println("Enter 0 to continue, or any other number to exit");
            a=leer.nextInt();
            b++;
        }
        this.entries=b;
    }

    public void searchEntry(String a){
        int i;
        for(i=0;i<this.entries;i++){
        if(a.contains(this.entry[i][0])){
            System.out.println("Entry found. Source: "+this.entry[i][0]+", Target: "+this.entry[i][1]);
        }
        }
    }
}