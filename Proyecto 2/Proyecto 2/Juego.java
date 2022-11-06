import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private int timer = 3650;
    private int score;
    private ClasifControll Controller = new ClasifControll();
    
    /**
     * Constructor for objects of class Juego.
     * 
     */
    public Juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        setScore(0);
    }
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int thescore){
        score = thescore;
    }
    
    /**
     * Act - do whatever the Aluminio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        ShowTimer();
        ShowScore();
        SpawnNewWaste();
        if (timer <= 0) {
            Greenfoot.setWorld(new Game_Over(score));
        }
    }
    
    public void ShowTimer(){
        timer--;
        if (timer % 60 == 0){
            showText(""+ timer / 60, 50, 50);
        }
    }
    
    public void ShowScore(){
        showText("Puntos: "+ score, 540, 50);
    }
    
    public void SpawnNewWaste(){
        Actor random_Waste = Controller.RandomIntForWaste();
        if (timer % 180 == 0){
            addObject(random_Waste,50,200);
        }
        
    }
    
    public void DeleteWasteAtEnd(){
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Organic organic = new Organic();
        addObject(organic,150,289);

        Recyclable recyclable = new Recyclable();
        addObject(recyclable,411,290);

        NonRecyclable nonRecyclable = new NonRecyclable();
        addObject(nonRecyclable,318,292);

        recyclable.setLocation(446,341);
        nonRecyclable.setLocation(329,342);
        organic.setLocation(559,340);
    }
}
