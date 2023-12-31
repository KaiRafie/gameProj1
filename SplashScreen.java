import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the splash screen class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    // this is an object of the timer
    private SimpleTimer StartTimer = new SimpleTimer();

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 1300x900 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        // the designing texts
        showTextWithBigBlackFontBIG("420-141-VA – Game Programming 1", 300, 300);
        showTextWithBigBlackFont("Developed By: \nMatthew Veroutis\nKais Rafie \nIbrahim El Zeftawy ", 10, 700);

        prepare();
    }
    
    double timeWelcomeScreenCreation = System.currentTimeMillis();
    
    public void act(){

        int timerValue = (int) (System.currentTimeMillis() - timeWelcomeScreenCreation)/1000;
        //after three seconds, this "if statement" transitions the screen to the start screen
        if (System.currentTimeMillis() >= (timeWelcomeScreenCreation + (3 * 1000)))
        {
            Greenfoot.setWorld(new StartScreen()); 
        }

    }

    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(true,false,50);// in the Font(), the true,false indicates if
        //you want to make the font bald and italian. So the font is bold "true" and not italian "false"
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
    { //this adds the logo (VANIER CEGEP/COLLEGE) to the screen
        Logo logo = new Logo();
        addObject(logo,660,194);
    }
}
