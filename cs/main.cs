using System;
using System.Collections.Generic;


namespace OpenCATe{
class MainClass {
  public static void Main (string[] args) {
    Console.WriteLine ("Open CAT beta");
    Source sText = new Source();
    Target tText = new Target();
    Console.WriteLine("Set paragraphs to translate");
    sText.paragraphs=Convert.ToInt32(Console.ReadLine());
    tText.paragraphs=sText.paragraphs;
    sText.textIn = new List<String>();
    tText.textIn = new List<String>();
    int i;
    for(i=0;i<sText.paragraphs;i++){
      Console.WriteLine("Insert source text");
      sText.textIn.Add(Console.ReadLine());
      Console.WriteLine("Insert target text");
      tText.textIn.Add(Console.ReadLine());
    }
    
  }
}
}