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
    public boolean IsClassificationCorrect(Actor waste, Bins bin, Juego juego){
        if(bin.getType() == 0){
            if( ((Waste)waste).isOrganic() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        else if(bin.getType() == 1 && ((Inorganic)bin).isRecyclable()){
            if( !((Waste)waste).isOrganic() && ((Waste)waste).isRecycle() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        else if (bin.getType() == 1 && !((Inorganic)bin).isRecyclable()){
            if( !((Waste)waste).isOrganic() && !((Waste)waste).isRecycle() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        return false;
    }
    
    public void addPoints(Juego juego){        
        int gameScore = juego.getScore();
            
        juego.setScore(gameScore + 50);
    }
    
    public void SubstractPoints(Juego juego){
        int gameScore = juego.getScore();
            
        juego.setScore(gameScore - 50);
    }
}
