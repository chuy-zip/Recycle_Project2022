import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NonRecyclable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NonRecyclable extends Inorganic
{
    public NonRecyclable(){
        super();
        setRecyclable(false);
        setLabel(getLabel() + "Reciclable");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 750, image.getHeight() - 750);
        setImage(image);
    }
    
    /**
     * Act - do whatever the NonRecyclable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
