import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class shows that the first player won the second round/level
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1WinL2 extends World
{

    
    public SimpleTimer transition = new SimpleTimer();
    
    /**
     * Constructor for objects of class Player1Win.
     * 
     */
    public Player1WinL2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1);
        
        showTextWithBigBlackFont("Press C to continue to next level ", 365, 900);
        
        showTextWithBigBlackFont("Player 1 wins with "+FirstLevel.player1Counter.getValue()+ " points!!!", 360, 450);
    }
    
    
    public void act(){
        
        transitionTo2();
        
        if (Greenfoot.isKeyDown("c"))
        {
            World thirdLevel =  new  ThirdLevel();
            Greenfoot.setWorld(thirdLevel);
        }
    }
    public void transitionTo2()//after 5 seconds we transition the screen to the third level
    {
        if (transition.millisElapsed()>5000)
        {
            World thirdLevel =  new  ThirdLevel();
            Greenfoot.setWorld(thirdLevel);
        }
        
        
    }
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(true,false,40);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
