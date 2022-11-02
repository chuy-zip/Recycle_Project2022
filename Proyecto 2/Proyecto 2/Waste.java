import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Waste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Waste extends Actor
{
    private String Name;
    private boolean Organic;
    private boolean Recycle;
    private int Type;
    
    /**
     * Act - do whatever the Waste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public int getType(){
        return Type;
    }
    
    public void setType(int type){
        Type = type;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setName(String name){
        Name = name;
    }
    
    public boolean isOrganic(){
        return Organic;
    }
    
    public void setOrganic(boolean organic){
        Organic = organic;
    }
    
    public boolean isRecycle(){
        return Recycle;
    }
    
    public void setRecycle(boolean recycle){
        Recycle = recycle;
    }
}
