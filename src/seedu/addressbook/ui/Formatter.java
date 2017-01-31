package seedu.addressbook.ui;

public class Formatter {
    
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    public static String concat(String... message){
        String merged = "";
        for (String m : message) {
            merged += LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX) + LS;
        }
        return merged.substring(0,merged.lastIndexOf(LS));
    }
}
