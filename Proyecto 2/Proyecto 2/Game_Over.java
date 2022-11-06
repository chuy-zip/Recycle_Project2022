import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Game_Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game_Over extends World
{
    private int FinalScore;
    private String Name = null;
    /**
     * Constructor for objects of class Game_Over.
     * 
     */
    public Game_Over(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        FinalScore = score;
        Name = JOptionPane.showInputDialog("Enter your Name");

        prepare();
    }

    public void act()
    {
        if (Name == null)
        {
            Name = JOptionPane.showInputDialog("Enter your Name");
        }

        showText(""+ FinalScore, 290, 155);
        showText(""+ Name, 290, 190);

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dog dog = new Dog();
        addObject(dog,506,314);
    }
}
