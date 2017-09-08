package guiproject1;


/**
 * A class that represents a contact to be stored inside one of the user's
 * address books. Stores a full name, full address, phone number, email, and
 * some notes.
 */

public class Contact {

    /* Declare private members */
    private String userName,firstName, lastName, address1, address2, city, state, zipCode,
            phoneNumber, email, notes;


    Contact() {
        userName = "";
        firstName= "";
        lastName= "";
        address1="";
        address2= "" ;
        city= "";
        state="";
        zipCode="";
        email="";
        phoneNumber="";
        notes=""; //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * Returns a string representation of an individual contact. If the contact
     * has no last name, just display the first name, else display last name comma
     * first name.
     *
     * @return A string representation of the contact.
     */
    @Override
    public String toString() {
        if (this.firstName.isEmpty() || this.firstName == null)
            return this.lastName;
        else if (this.lastName.isEmpty() || this.lastName == null)
            return this.firstName;
        else
            return this.lastName + ", " + this.firstName;
    }




    /* ************ Getter methods ************ */

    /**
     * Returns the contact's first name.
     *
     * @return Contact's first name.
     */

    public String getUserName() {
        return this.toString();
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the contact's last name.
     *
     * @return Contact's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the first line of the contact's street address.
     *
     * @return Contact's first street address line.
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Returns the second line of the contact's street address.
     *
     * @return Contact's second street address line.
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Returns the contact's city.
     *
     * @return Contact's city.
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the contact's state.
     *
     * @return Contact's state.
     */
    public String getState() {
        return state;
    }

    /**
     * Returns the contact's zip code.
     *
     * @return Contact's zip code.
     */
    public String getZipCode() {
        return zipCode;
    }


    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNotes() {
        return notes;
    }


    /* ************ Getter methods ************ */

    /**
     * Sets the specified string as the contact's first name.
     *
     * @param s The contact's new first name.
     */


    public void setFirstName(String s) {
        this.firstName = s;
    }

    /**
     * Sets the specified string as the contact's last name.
     *
     * @param s The contact's new last name.
     */
    public void setLastName(String s) {
        this.lastName = s;
    }

    /**
     * Sets the specified string as the contact's first street address line.
     *
     * @param s The contact's new first street address line.
     */
    public void setAddress1(String s) {
        this.address1 = s;
    }

    /**
     * Sets the specified string as the contact's second street address line.
     *
     * @param s The contact's new second street address line.
     */
    public void setAddress2(String s) {
        this.address2 = s;
    }

    /**
     * Sets the specified string as the contact's city.
     *
     * @param s The contact's new city.
     */
    public void setCity(String s) {
        this.city = s;
    }

    /**
     * Sets the specified string as the contact's state.
     *
     * @param s The contact's new state.
     */
    public void setState(String s) {
        this.state = s;
    }

    /**
     * Sets the specified string as the contact's zip code.
     *
     * @param s The contact's new zip code.
     */
    public void setZipCode(String s) {
        this.zipCode = s;
    }

    /**
     * Sets the specified string as the contact's phone number.
     *
     * @param s The contact's new phone number.
     */
    public void setPhoneNumber(String s) {
        this.phoneNumber = s;
    }

    /**
     * Sets the specified string as the contact's email.
     *
     * @param s The contact's new email.
     */
    public void setEmail(String s) {
        this.email = s;
    }

    /**
     * Sets the specified string as the contact's stored notes.
     *
     * @param s The contact's new notes.
     */
    public void setNotes(String s) {
        this.notes = s;
    }
} // End Contact class