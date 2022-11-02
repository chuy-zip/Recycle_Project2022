import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego extends World
{
    private int timer = 3600;
    private int score = 0;
    
    /**
     * Act - do whatever the Aluminio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        ShowTimer();
        ShowScore();
        if (timer <= 0) {
            Greenfoot.setWorld(new Game_Over());
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
    
    public int getScore(){
        return score;
    }
    
    public void setScore(int thescore){
        score = thescore;
    }
    
    /**
     * Constructor for objects of class Juego.
     * 
     */
    public Juego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
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

        PapelCarton papelCarton = new PapelCarton();
        addObject(papelCarton,265,186);
        papelCarton.setLocation(70,82);

        Fruta fruta = new Fruta();
        addObject(fruta,193,125);
        fruta.setLocation(147,74);

        Electronicos electronicos = new Electronicos();
        addObject(electronicos,225,103);
        electronicos.setLocation(212,87);

        Ceramica ceramica = new Ceramica();
        addObject(ceramica,315,152);
        ceramica.setLocation(299,90);

        BolsasPL bolsasPL = new BolsasPL();
        addObject(bolsasPL,383,103);
        bolsasPL.setLocation(381,84);
        
        Aluminio aluminio = new Aluminio();
        addObject(aluminio,389,167);
        aluminio.setLocation(456,86);
    }
}
