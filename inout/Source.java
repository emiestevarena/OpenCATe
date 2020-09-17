package inout;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Source{
  private String[] sText;
  private ArrayList <String> source = new ArrayList<>();
  private int length;

  public void ReadFile(){
    try {
      File myObj = new File("source.txt");
      Scanner myReader = new Scanner(myObj);
      this.length=0;
      while (myReader.hasNextLine()) {
        this.setSource(myReader.nextLine());
        System.out.println(this.getSource(this.length));
        this.length++;
      } 
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

  public String getSource(int a){
    return source.get(a);
  }

  public void setSource(String b){
    this.source.add(b);
  }

  public void deleteSource(){
    this.source=null;
  }

  public int getLength(){
    return length;
  }

}
