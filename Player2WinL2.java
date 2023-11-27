import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2WinL2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2WinL2 extends World
{

    public SimpleTimer transition = new SimpleTimer();
    
    
    /**
     * Constructor for objects of class Player2Win.
     * 
     */
    public Player2WinL2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        showTextWithBigBlackFont("Player 2 wins with "+FirstLevel.player2Counter.getValue()+ " points!!!", 300, 450);
    }
    
    
    public void act(){
        
        transitionTo2();
    }
    public void transitionTo2(){
        if (transition.millisElapsed()>5000)
        {
            World thirdLevel =  new  ThirdLevel();
            Greenfoot.setWorld(thirdLevel);
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
