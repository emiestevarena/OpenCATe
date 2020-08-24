package classes;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Source{
  private String[] sText;
  private int length;

  public void ReadFile(){
    try {
      File myObj = new File("source.txt");
      Scanner myReader = new Scanner(myObj);
      this.length=0;
      this.sText = new String[1000];
      while (myReader.hasNextLine()) {
        this.sText[this.length] = myReader.nextLine();
        System.out.println(this.sText[this.length]);
        this.length++;
      } 
     /* while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
        this.sText+=data;
        this.length++;
      } */
      myReader.close();
      System.out.println("segments: "+this.length);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }


  public String getSText(int a){
    return sText[a];
  }

  public int getLength(){
    return length;
  }

  public void deleteSText(){
    this.sText = null;
  }
}
