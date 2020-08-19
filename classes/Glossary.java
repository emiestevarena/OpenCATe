package classes;
import java.util.Scanner;

public class Glossary {
    private String[][] entry;
    private int entries;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Glossary createDictionary(){
        Glossary dic=new Glossary();
        this.entry = new String[100][2];
        int i;
        this.entries=0;
        for(i=0;i<100;i++){
            this.entry[i][0]="";
            this.entry[i][1]="";
        }
        return dic;
    }

    public void setEntry(){
        int a=this.entries;
        System.out.println("Enter number of entries to the glossary:");
        int b=leer.nextInt();
        int c=b+a;
        while(a<c){
            System.out.println("Enter source and target glossary term "+(a+1));
            this.entry[a][0]=leer.next();
            this.entry[a][1]=leer.next();
            a++;
        }
        this.entries=c;
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