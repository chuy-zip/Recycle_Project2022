import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dog2 dog2 = new Dog2();
        addObject(dog2, 250, 117);
        dog2.setLocation(488,325);
        dog2.setLocation(528,283);
        dog2.setLocation(522,285);
        dog2.setLocation(484,296);
        dog2.setLocation(504,308);
        dog2.setLocation(526,276);
        dog2.setLocation(526,288);
        dog2.setLocation(503,269);
        dog2.setLocation(469,316);
        dog2.setLocation(495,280);
        dog2.setLocation(480,331);
        dog2.setLocation(552,309);
        dog2.setLocation(508,295);
    }
}
