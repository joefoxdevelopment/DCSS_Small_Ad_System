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
    public String username;
    public String passHash;

    /**
     * Noargs constructor required for javaspaces
     */
    public User () {
    }

    /**
     * Constructor for initialising username and passHash
     */
    public User (String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public void setUsername (String username) {
        this.username = username;
    }

    public void setPassword (String password) {
        //Stick password hashing code call here
        //this.passHash = encrypted password
    }
}
