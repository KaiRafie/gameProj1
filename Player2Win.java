import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Win extends World
{

    /**
     * Constructor for objects of class Player2Win.
     * 
     */
    public Player2Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        showTextWithBigBlackFont("Player 2 wins with "+MyWorld.player2Counter.getValue()+ " points!!!", 300, 450);
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
