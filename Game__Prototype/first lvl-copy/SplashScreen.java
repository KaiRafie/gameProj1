import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{

    private SimpleTimer StartTimer = new SimpleTimer();

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 

        showTextWithBigBlackFontBIG("420-141-VA – Game Programming 1", 300, 300);
        showTextWithBigBlackFont("Developed By: \nMatthew Veroutis\nKais Rafie \nIbrahim El Zeftawy ", 10, 700);

        prepare();
    }

    double timeWelcomeScreenCreation = System.currentTimeMillis();
    
    public void act(){

        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;

        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (3 * 1000)))
        {
            Greenfoot.setWorld(new StartScreen()); 
        }

    }

    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(true,false,50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message,x, y);
    }

    public void showTextWithBigBlackFontBIG(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(true,false,50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Logo logo = new Logo();
        addObject(logo,660,194);
    }
}
