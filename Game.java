package cp213;

import java.time.LocalTime;

/**
 * Game class definition.
 *
 * @author George Mandl
 * @version 2022-03-29
 */
public class Game{

        // Attributes
	private Team team1 = null;
	private Team team2 = null;
    private int gameID = 0;
    private String location = null;
    private LocalTime time = null;

    /**
     * Game constructor. (1)
     *
     * @param team1 	game's name
     * @param team2    	game's league
     * @param gameid	game's identifier
     */
    public Game(final Team team1, final Team team2, final int gameid) {
    	
    	this.team1 = team1;
       	this.team2 = team2;
    	this.gameID = gameid;
	return;
    }
    
    /**
     * Game constructor. (2)
     *
     * @param team1 	game's name
     * @param team2    	game's league
     * @param gameid	game's identifier
     * @param location	game's location
     */
    public Game(final Team team1, final Team team2, final int gameid, final String location) {

    	this.team1 = team1;
       	this.team2 = team2;
    	this.gameID = gameid;
    	this.location = location;
	return;
    }
    
    /**
     * Game constructor. (3)
     *
     * @param team1 	game's name
     * @param team2    	game's league
     * @param gameid	game's identifier
     * @param time		game's time
     */
    public Game(final Team team1, final Team team2, final int gameid, final LocalTime time) {

    	this.team1 = team1;
       	this.team2 = team2;
    	this.gameID = gameid;
    	this.time = time;
	return;
    }
    
    /**
     * Game constructor. (4)
     *
     * @param team1 	game's name
     * @param team2    	game's league
     * @param gameid	game's identifier
     * @param location	game's location
     * @param time		game's time
     */
    public Game(final Team team1, final Team team2, final int gameid, final String location, final LocalTime time) {

    	this.team1 = team1;
       	this.team2 = team2;
    	this.gameID = gameid;
    	this.location = location;
    	this.time = time;
	return;
    }
    
     /**
     * Getter for game ID attribute.
     *
     * @return gameID
     */
    public int getGameID() {	
		return gameID;
    }

    /**
     * Getter for team1 attribute.
     *
     * @return team1
     */
    public Team getTeam1() {
    	return team1;
    }
    
     /**
     * Getter for team2 attribute.
     *
     * @return team2
     */
    public Team getTeam2() {

		return team2;
    }
    
    /**
     * Getter for location attribute.
     *
     * @return location
     */
    public String getLocation() {

		return location;
    }
    
    /**
     * Getter for time attribute.
     *
     * @return time
     */
    public LocalTime getTime() {	
		return time;
    }
}