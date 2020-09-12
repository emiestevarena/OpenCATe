package classes;

// Will not be fully implemented until databases are set! 

public class Languages {
    private LanguagesEnum source;
    private LanguagesEnum target;

    public Languages(){

    }

    public void setSource(int a){
        this.source=LanguagesEnum.values()[a];
    }

    public String getSource(){
        return this.source.toString();
    }

    public void setTarget(int a){
        this.target=LanguagesEnum.values()[a];
    }

    public String getTarget(){
        return this.target.toString();
    }
}
