import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inorganic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inorganic extends Bins
{
    private boolean Recyclable;
    
    public Inorganic(){
        setType(1);
        setLabel("Inorganico");
    }
    
    /**
     * Act - do whatever the Inorganic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public boolean isRecyclable(){
        return Recyclable;
    }
    
    public void setRecyclable(boolean recycle){
        Recyclable = recycle;
    }
}
