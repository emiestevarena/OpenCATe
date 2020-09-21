package inout;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import classes.*;

public class AuxMemory {
    private ArrayList <Segment> auxMem = new ArrayList<>();
    private String line;
    private int length;

  public void ReadFile(){
    try {
      File myObj = new File("auxMemory.txt");
      Scanner myReader = new Scanner(myObj);
      this.length=0;
      while (myReader.hasNextLine()) {
        this.line=myReader.nextLine();
        Segment seg= new Segment();
        String l1="",l2="";
        int j=0;
        for(int i=0;i<this.line.length();i++){
            if(this.line.charAt(i)=='\\'){j=1;}
            else if(j==0){
                l1+=this.line.charAt(i);
                seg.setSource(l1);
            }else{
                l2+=this.line.charAt(i);
                seg.setTarget(l2);
            }
        }
        auxMem.add(seg);
        seg=null;
        this.length++;
      } 
      myReader.close();
      System.out.println("segments: "+this.length);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public ArrayList<Segment> getAuxMem(){
    return auxMem;
  }

  public int getLength(){
      return length;
  }
}
