import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends World
{

    /**
     * Constructor for objects of class Juego.
     * 
     */
    public Juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Organic organic = new Organic();
        addObject(organic,150,289);

        Recyclable recyclable = new Recyclable();
        addObject(recyclable,411,290);
        
        NonRecyclable nonRecyclable = new NonRecyclable();
        addObject(nonRecyclable,318,292);
        
        recyclable.setLocation(446,341);
        nonRecyclable.setLocation(329,342);
        organic.setLocation(559,340);
        
    }
}
