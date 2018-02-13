import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    private String name;
    private boolean scoreChanged;
    
    /**
     * Score is the constructor of objects of type Score
     * 
     * @param There are no parameters
     * @return an object of type Score
     */
    public Score()
    {
        GreenfootImage scoreImage;
        
        score = 0;
        name = "";
        scoreChanged = false;
        
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( scoreImage );
    }
    
    /**
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        if( scoreChanged == true )
        {
            display();
        }
    } 
    
    /**
     * countScore increases the score
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void countScore()
    {
        score++;
        scoreChanged = true;
    }
    
    /**
     * setPlayerName changes the name displayed on the leaderboard
     * 
     * @param playerName is the new player's name
     * @return Nothing is returned
     */
    public void setPlayerName( String playerName )
    {
        name = playerName;
        scoreChanged = true;
    }
    
    /**
     * getScore gets the current score for the player
     * 
     * @param There are no parameters
     * @return an integer representing the player's score
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * display displays the Scoreboard's image
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    private void display()
    {
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( newImage );
        scoreChanged = false;
    }
    
    
    
    
    
    
    
    
    
    
}
