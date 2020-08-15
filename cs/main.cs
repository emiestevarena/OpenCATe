using System.Collections.Generic;
using System;



class MainClass {
  public static void Main (string[] args) {
    Console.WriteLine ("Open CAT beta");
    Source sText = new Source();
    Console.WriteLine("Set paragraphs to translate");
    sText.paragraphs=Convert.ToInt32(Console.ReadLine());
    sText.textIn = new List<String>();
    int i;
    for(i=0;i<sText.paragraphs;i++){
      String target;
      Console.WriteLine("Insert source text");
      sText.textIn.Add(Console.ReadLine());
      Console.WriteLine("Insert target text");
      target=Console.ReadLine();
    }
    
  }
}
