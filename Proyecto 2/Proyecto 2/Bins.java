import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Bins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bins extends Actor
{
    private int Type;
    private String Label;
    private ArrayList<Waste> WasteInBin = new ArrayList<Waste>();

    /**
     * Act - do whatever the Bins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        // Add your action code here.
    }
    
    public int getType(){
        return Type;
    }
    
    public void setType(int type){
        Type = type;
    }
    
    public String getLabel(){
        return Label;
    }
    
    public void setLabel(String label){
        Label = label;
    }
    
    public void getLabel(String label){
        Label = label;
    }
    
    public ArrayList<Waste> getWastInBin(){
        return WasteInBin;
    }
    
    public void setWasteInBin(ArrayList<Waste> Objects){
        WasteInBin = Objects;
    }
}
