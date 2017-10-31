package JoeFox.Templates.UserAuth;

import JoeFox.Templates.Template;

/**
 * Class JoeFox.Templates.UserAuth.User
 *
 * A user class to be utilised by the system to hold user account credentials
 * and any user account logic, such as password encryption.
 *
 * @author Joe Fox
 * @version 1.0
 * @since 2017-10-30
 */

public class User extends Template
{
    /**
     * Store the user's name
     */
    public String username;

    /**
     * Store the user's password
     * This should be encrypted in some way
     */
    public String passHash;

    /**
     * Noargs constructor required for javaspaces
     */
    public User () {}

    /**
     * Constructor for initialising username and passHash
     *
     * @param String username
     * @param String password - the unencrypted password
     */
    public User (String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    /**
     * Set this.username
     *
     * @param String username
     */
    public void setUsername (String username) {
        this.username = username;
    }

    /**
     * Encrypt and set this.password to the encrypted value
     *
     * @param String password - the unencrypted password
     */
    public void setPassword (String password) {
        //Stick password hashing code call here
        //this.passHash = encrypted password
    }
}
