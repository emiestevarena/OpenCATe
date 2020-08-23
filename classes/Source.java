package classes;
import java.io.File;
import java.util.Scanner;

public class Source{
  private String sText;
  private int length;

  public Source sourceIn(){
    File sFile = new File("source.txt");
    Scanner scSource = new Scanner(sFile);
    this.length=0;
    this.text="";
    while(sc.hasNextLine()){
      this.sText+=(sc.nextLine());
      this.length++;
    }
    System.out.println("segments: "+this.length);
    return sFile;
  }

  public String getSText(){
    return sText;
  }

  public int getLength(){
    return length;
  }

}
