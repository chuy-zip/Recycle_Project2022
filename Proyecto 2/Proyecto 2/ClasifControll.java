import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClasifControll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClasifControll extends Actor
{
    public ClasifControll(){
        
    }
    
    /**
     * Act - do whatever the ClasifControll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * Logic to check if the waste placed in the organic bin is correct
     */
    public boolean IsClassificationCorrect_ORGANIC(Waste waste, Bins bin){
        if (waste.isOrganic() && bin.getType() == 0){
            return true;
        }
        return false;
    }
    
    /**
     * Logic to check if the waste placed int inorganic and recyclable bin is correct
     */
    public boolean IsClassificationCorrect_INORGANIC_REC(Waste waste, Bins bin){
        if (!waste.isOrganic() && bin.getType() == 1 && ((Inorganic)bin).isRecyclable() ){
            return true;
        }
        return false;
    }
    
    /**
     * Logic to check if the waste placed int inorganic and Nonrecyclable bin is correct
     */
    public boolean IsClassificationCorrect_INORGANIC_NONREC(Waste waste, Bins bin){
        if (!waste.isOrganic() && bin.getType() == 1 && ((Inorganic)bin).isRecyclable() ){
            return true;
        }
        return false;
    }
}
