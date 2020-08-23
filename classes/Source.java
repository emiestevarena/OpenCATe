package classes;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Source{
  private String sText;
  private int length;

  public void ReadFile(){
    try {
      File myObj = new File("source.txt");
      Scanner myReader = new Scanner(myObj);
      this.sText="";
      this.length=0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        this.sText+=data;
        this.length++;
      } 
      myReader.close();
      System.out.println("segments: "+this.length);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }


  public String getSText(){
    return sText;
  }

  public int getLength(){
    return length;
  }

}
