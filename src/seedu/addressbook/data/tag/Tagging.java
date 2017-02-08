package seedu.addressbook.data.tag;

public class Tagging {
    private String personName;
    private String tag;
    
    public Tagging(String personName, String tag){
        this.personName = personName;
        this.tag = tag;
    }
    
    @Override
    public String toString(){
        return personName + "[" + tag + "]";
    }
}
