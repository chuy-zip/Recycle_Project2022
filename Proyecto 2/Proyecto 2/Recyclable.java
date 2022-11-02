import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Recyclable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recyclable extends Inorganic
{
    public Recyclable(){
        super();
        setRecyclable(true);
        setLabel(getLabel() + "Reciclable");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 925, image.getHeight() - 1175);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Recyclable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        DetectWaste();
    }
}
