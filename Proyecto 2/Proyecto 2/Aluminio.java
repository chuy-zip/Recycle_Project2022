import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aluminio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aluminio extends Waste
{
    public Aluminio(){
        setType(0);
        setName("Aluminio");
        setOrganic(false);
        setRecycle(true);
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 290, image.getHeight() - 525);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Aluminio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
