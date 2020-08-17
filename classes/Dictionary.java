package classes;

public class Dictionary {
    private String[][] entry;
    
    public Dictionary createDictionary(){
        Dictionary dic=new Dictionary();
        this.entry = new String[100][2];
        return dic;
    }
}