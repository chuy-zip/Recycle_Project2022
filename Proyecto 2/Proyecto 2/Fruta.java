import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruta extends Waste
{
    public Fruta(){
        setType(4);
        setName("Fruta");
        setOrganic(true);
        setRecycle(false);
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 375, image.getHeight() - 540);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Fruta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        DragAndDrop();
        AutomaticMovement();
    }
}
