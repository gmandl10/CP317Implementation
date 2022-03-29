package cp213;

/**
 * User class definition.
 *
 * @author George Mandl
 * @version 2022-03-28
 */
public class User{

        // Attributes
	private String fName = null;
    private String lName = null;
	private String email = null;
	private int userID = 0;
    private String password = null;

    /**
     * User constructor. (There is one unique constructor for user since all attributes are NOT-NULL)
     *
     * @param fname         user's first name
     * @param lname         user's last name
     * @param email      	user's email
     * @param userid    	user's identifier
     * @param email    		user's password
     */
    public User(final String fname, final String lname, final String email, final int userid, final String password) {

    	this.fName = fname;
    	this.lName = lname;
    	this.email = email;
    	this.userID = userid;
    	this.password = password;
	return;
    }

    /**
     * Getter for user ID attribute.
     *
     * @return userID
     */
    public int getUserID() {	
		return userID;
    }

    /**
     * Getter for first name attribute.
     *
     * @return fName
     */
    public String getfName() {
    	return fName;
    }
    
    /**
     * Getter for last name attribute.
     *
     * @return lName
     */
    public String getlName() {
    	return lName;
    }
    
    /**
     * Getter for full name attribute.
     *
     * @return fullName
     */
    public String getFullName() {
    	String fullName = String.format("%s %s", this.fName, this.lName);
    	    	
    	return fullName;
    }

    /**
     * Getter for email attribute.
     *
     * @return email
     */
    public String getEmail() {

		return email;
    }

    /**
     * Getter for password attribute.
     *
     * @return password
     */
    public String getPassword() {

		return password;
    }
    
}