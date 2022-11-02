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
    public boolean IsClassificationCorrect_ORGANIC(Actor waste, Bins bin, Juego juego){
        if(bin.getType() == 0){
            if( ((Waste)waste).isOrganic() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        else if(bin.getType() == 1 && ((Inorganic)bin).isRecyclable()){
            System.out.println("2");
            if( !((Waste)waste).isOrganic() && ((Waste)waste).isRecycle() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        else if (bin.getType() == 1 && !((Inorganic)bin).isRecyclable()){
            System.out.println("3");
            if( !((Waste)waste).isOrganic() && !((Waste)waste).isRecycle() ){
                addPoints(juego);
                return true;
            }
            SubstractPoints(juego);
            return false;
        }
        
        return false;
    }
    
    /**
     * Logic to check if the waste placed int inorganic and recyclable bin is correct
     */
    public boolean IsClassificationCorrect_INORGANIC_REC(Waste waste, Bins bin, Juego juego){
        if (!waste.isOrganic() && bin.getType() == 1 && ((Inorganic)bin).isRecyclable() ){
            System.out.println("Correcto");
            return true;
        }
        
        SubstractPoints(juego);
        return false;
    }
    
    /**
     * Logic to check if the waste placed int inorganic and Nonrecyclable bin is correct
     */
    public boolean IsClassificationCorrect_INORGANIC_NONREC(Waste waste, Bins bin, Juego juego){
        if (!waste.isOrganic() && bin.getType() == 1 && !((Inorganic)bin).isRecyclable() ){
            System.out.println("Correcto");
            return true;
        }
        
        SubstractPoints(juego);
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
