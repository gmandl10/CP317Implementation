package cp213;

/**
 * Team class definition.
 *
 * @author George Mandl
 * @version 2022-03-28
 */
public class Team{

        // Attributes
	private League league = null;
    private int teamID = 0;
	private String teamName = null;
	private User teamManager = null;
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;

    /**
     * Team constructor. (1)
     *
     * @param name  	team's name
     * @param league    team's league
     * @param teamid	team's identifier
     */
    public Team(final String name, final League league, final int teamid) {

    	this.teamName = name;
       	this.league = league;
    	this.teamID = teamid;
	return;
    }
    
    /**
     * Team constructor. (2)
     *
     * @param name         	team's name
     * @param league    	team's league
     * @param teamid    	team's identifier
     * @param teammanager   team's manager
     */
    public Team(final String name, final League league, final int teamid, final User teamManager) {

    	this.teamName = name;
       	this.league = league;
    	this.teamID = teamid;
    	this.teamManager = teamManager;
	return;
    }

    /**
     * Getter for team ID attribute.
     *
     * @return teamID
     */
    public int getTeamID() {	
		return teamID;
    }

    /**
     * Getter for team name attribute.
     *
     * @return teamName
     */
    public String getTeamName() {
    	return teamName;
    }
    
     /**
     * Getter for team manager attribute.
     *
     * @return teamManager
     */
    public User getTeamManager() {

		return teamManager;
    }
    
    /**
     * Getter for league attribute.
     *
     * @return league
     */
    public League getLeague() {

		return league;
    }
    
    /**
     * Getter for wins attribute.
     *
     * @return wins
     */
    public int getWins() {	
		return wins;
    }
    
    /**
     * Getter for losses attribute.
     *
     * @return losses
     */
    public int getLosses() {	
		return losses;
    }
    
    /**
     * Getter for ties attribute.
     *
     * @return ties
     */
    public int getTies() {	
		return ties;
    }
    
}