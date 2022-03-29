package cp213;

/**
 * Player class definition.
 *
 * @author George Mandl
 * @version 2022-03-28
 */
public class Player{

        // Attributes
    private Team teamName = null;
    private int gamesPlayed = 0;
    private int jerseyNumber = 0;
    private int goals = 0;
    private int assists = 0;
    private String fName = null;
    private String lName = null;

    /**
     * Player constructor (1).
     *
     * @param fname         player's first name
     * @param lname         player's last name
     * @param teamname      player's team name
     */
    public Player(final String fname, final String lname, final Team teamname) {

    	this.fName = fname;
    	this.lName = lname;
    	this.teamName = teamname;
	return;
    }
    
    /**
     * Player constructor (2).
     *
     * @param fname         player's first name
     * @param lname         player's last name
     * @param teamname      player's team name
     * @param jerseynum     player's jersey number
     */
    public Player(final String fname, final String lname, final Team teamname, final int jerseynum) {

    	this.fName = fname;
    	this.lName = lname;
    	this.teamName = teamname;
    	this.jerseyNumber = jerseynum;
	return;
    }

    /**
     * Getter for teamName attribute.
     *
     * @return teamName
     */
    public Team getTeamName() {	
		return teamName;
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
     * Getter for jersey number attribute.
     *
     * @return jerseyNumber
     */
    public int getJerseyNumber() {

		return jerseyNumber;
    }

    /**
     * Getter for goals attribute.
     *
     * @return goals
     */
    public int getGoals() {

		return goals;
    }
    
    /**
     * Getter for assists attribute.
     *
     * @return assists
     */
    public int getAssists() {

		return assists;
    }
    
    /**
     * Getter for games played attribute.
     *
     * @return gamesPlayed
     */
    public int getGamesPlayed() {

		return gamesPlayed;
    }

}