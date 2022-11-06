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
     * Logic to check if the waste placed in the correct bin
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
    
    
    
    public Actor RandomIntForWaste(){
        int random = (int)Math.floor(Math.random()*(6-1+1)+1);
        Actor new_Waste;
        if(random == 1){
            new_Waste = new Aluminio();
            return new_Waste;
        }
        
        else if(random == 2){
            new_Waste = new BolsasPL();
            return new_Waste;
        }
        
        else if(random == 3){
            new_Waste = new Ceramica();
            return new_Waste;
        }
        
        else if(random == 4){
            new_Waste = new Electronicos();
            return new_Waste;
        }
        
        else if(random == 5){
            new_Waste = new Fruta();
            return new_Waste;
        }
        
        else if(random == 6){
            new_Waste = new PapelCarton();
            return new_Waste;
        }
        
        return null;
    }
}
