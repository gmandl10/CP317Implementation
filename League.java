package cp213;

/**
 * League class definition.
 *
 * @author George Mandl
 * @version 2022-03-28
 */
public class League{

        // Attributes
	private String leagueName = null;
    private int leagueID = 0;
	private User admin = null;

    /**
     * League constructor. (1)
     *
     * @param name         league's name
     * @param userid    	league's identifier
     * @param email    		league's admin
     */
    public League(final String name, final int leagueid, final User admin) {

    	this.leagueName = name;
       	this.leagueID = leagueid;
    	this.admin = admin;
	return;
    }

    /**
     * Getter for league ID attribute.
     *
     * @return leagueID
     */
    public int getLeagueID() {	
		return leagueID;
    }

    /**
     * Getter for league name attribute.
     *
     * @return leagueName
     */
    public String getLeagueName() {
    	return leagueName;
    }
    
     /**
     * Getter for admin attribute.
     *
     * @return admin
     */
    public User getAdmin() {

		return admin;
    }
    
}