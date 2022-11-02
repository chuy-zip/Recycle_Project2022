import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{
    private int FinalScore;
    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        FinalScore = score;
    }
}
