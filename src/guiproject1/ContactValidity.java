package guiproject1;

/**
 * Class that contains methods for checking the validity of contact information.
 * The validity of the contact information is checked under the U.S. postal
 * standards.
 */
public class ContactValidity {

    /**
     * Returns true if the given string is a valid name, false if not. A name is
     * considered valid if it contains at least one letter.
     *
     * @param s The name to check for validity.
     * @return True if the given name is valid, false otherwise.
     */
    public static boolean nameValid(String s) {

        return ((!s.isEmpty()) &&
            s.matches("^[a-zA-Z]+.*$"));
    }

    /**
     * Returns true if the given string is a valid first address line, false if
     * not. A first line address is considered valid if it contains at least one
     * number followed by a space followed by at least one letter.
     *
     * @param s The first address line to check for validity.
     * @return True if the given name is valid, false otherwise.
     */
    public static boolean address1Valid(String s) {

        return (!(s.isEmpty()) &&
            s.matches("^[0-9]+[ ][a-zA-Z]+.*$"));
    }

    /**
     * Returns true if the given string is a city name, false if not. A city
     * name is considered valid if it contains at least one letter.
     *
     * @param s The city to check for validity.
     * @return True if the given city is valid, false otherwise.
     */
    public static boolean cityValid(String s) {

        return nameValid(s);
    }

    /**
     * Returns true if the given string is a valid zip code, false if not. A
     * zip code is considered valid if it's in the format xxxxx or xxxxx-xxxx,
     * where the x's represent numbers.
     *
     * @param s The zip code to check for validity.
     * @return True if the given zip code is valid, false otherwise.
     */
    public static boolean zipCodeValid(String s) {

        return (!(s.isEmpty()) &&
            s.matches("^[0-9]{5}(?:-[0-9]{4})?$"));
    }

    /**
     * Returns true if the given string is a valid phone number, false if not.
     * A phone number is considered valid if it's given in one of the following
     * formats (the #'s represent the digits):
     *
     * #######
     * ###-####
     * ###.####
     * ##########
     * ###-###-####
     * ###.###.####
     * (###)#######
     * (###) #######
     * (###)-###-####
     * (###) ###-####
     * (###).###.####
     * (###) ###.####
     *
     * @param s The phone number to check for validity.
     * @return True if the given phone number is valid, false otherwise.
     */
    public static boolean phoneNumberValid(String s) {

        return (!(s.isEmpty()) &&
            s.matches("^[0-9]{7}$") ||                              // #######
            s.matches("^[0-9]{3}[-][0-9]{4}$") ||                   // ###-####
            s.matches("^[0-9]{3}[.][0-9]{4}$") ||                   // ###.####
            s.matches("^[0-9]{10}$") ||                             // ##########
            s.matches("^[0-9]{3}[-][0-9]{3}[-][0-9]{4}$") ||        // ###-###-####
            s.matches("^[0-9]{3}[.][0-9]{3}[.][0-9]{4}$") ||        // ###.###.####
            s.matches("^[(][0-9]{3}[)][0-9]{7}$") ||                // (###)#######
            s.matches("^[(][0-9]{3}[)][ ][0-9]{7}$") ||             // (###) #######
            s.matches("^[(][0-9]{3}[)][-][0-9]{3}[-][0-9]{4}$") ||  // (###)-###-####
            s.matches("^[(][0-9]{3}[)][ ][0-9]{3}[-][0-9]{4}$") ||  // (###) ###-####
            s.matches("^[(][0-9]{3}[)][.][0-9]{3}[.][0-9]{4}$") ||  // (###).###.####
            s.matches("^[(][0-9]{3}[)][ ][0-9]{3}[.][0-9]{4}$"));   // (###) ###.####
    }

    /**
     * Returns true if the given string is a valid email, false if not. An email is
     * considered valid if it contains no preceding periods in teh username, and
     * is followed by an '@' followed by at least one domain. Additionally, each
     * domain must be between two to six letters long, and contains no trailing
     * periods.
     *
     * @param s The email to check for validity.
     * @return True if the given email is valid, false otherwise.
     */
    public static boolean emailValid(String s) {

        // This regex was take from http://howtodoinjava.com/regex/java-regex-validate-email-address/
        return (!s.equals("") &&
        s.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"));
    }
} // End ContactValidity class