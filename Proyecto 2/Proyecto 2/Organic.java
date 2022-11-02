import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Organic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organic extends Bins
{
    public Organic(){
        setType(0);
        setLabel("Organico");
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 250, image.getHeight() - 350);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Organic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        DetectWaste();
    }
}
