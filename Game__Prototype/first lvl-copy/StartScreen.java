import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    public GreenfootSound StartMusic;
    
    
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        prepare();
        
        
        StartMusic =  new  GreenfootSound("Creepy Dungeon edit2.wav");
        started();
        
    
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButton startButton = new StartButton();
        addObject(startButton,420,575);
    }
    
    public void started()
    {
        StartMusic.playLoop();
    }

    /**
     * 
     */
    public void stopped()
    {
        StartMusic.stop();
    }
}
