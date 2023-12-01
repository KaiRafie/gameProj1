import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class shows that the second player won the first round/level
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Win extends World
{

    
    
    
    public SimpleTimer transition = new SimpleTimer();
    
    
    /**
     * Constructor for objects of class Player2Win.
     * 
     */
    public Player2Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        
        showTextWithBigBlackFont("Press C to continue to next level ", 260, 870);
        showTextWithBigBlackFont("Player 2 wins with "+FirstLevel.player2Counter.getValue()+ " points!!!", 300, 450);
    }
    
    
    public void act(){
        
        transitionTo2();
        
        if (Greenfoot.isKeyDown("c"))
        {
            World secondLevel =  new  SecondLevel();
            Greenfoot.setWorld(secondLevel);
        }
    }
    public void transitionTo2()//after 5 seconds we transition the screen to the second level
    {
        if (transition.millisElapsed()>5000)
        {
            World secondLevel =  new  SecondLevel();
            Greenfoot.setWorld(secondLevel);
        }
        
        
    }
    
    
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(true,false,50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
