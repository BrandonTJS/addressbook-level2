package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact.
 */
public class Contact {

    private final String validationRegex;
    
    public final String value;
    private boolean isPrivate;
    
    
    /**
     * Validates given Contact.
     *
     * @throws IllegalValueException if given value string is invalid.
     */
    public Contact(String value, boolean isPrivate, String messageConstraints, String validationRegex) throws IllegalValueException{
        this.validationRegex = validationRegex;
        
        String trimmedValue = value.trim();
        if (!isValid(trimmedValue)) {
            throw new IllegalValueException(messageConstraints);
        }
        
        this.value = trimmedValue;
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    public boolean isValid(String test) {
        return test.matches(validationRegex);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
