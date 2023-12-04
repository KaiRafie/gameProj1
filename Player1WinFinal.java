import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class shows that the first player won the final round/level
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1WinFinal extends World
{

    public SimpleTimer transition = new SimpleTimer();
    
    /**
     * Constructor for objects of class Player1WinFinal.
     * 
     */
    public Player1WinFinal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        stopped();
      showTextWithBigBlackFont("Player 1", 555, 280);
        showTextWithBigBlackFont("is", 620, 370);
        showTextWithBigBlackFont("the winner!!!", 510, 460);
        showTextWithBigBlackFont("Final Score: \n     "+FirstLevel.player1Counter.getValue(),520,560);
    }
    public void act(){
        if (transition.millisElapsed()>6000)
        {
            World startScreen =  new  StartScreen();
            Greenfoot.setWorld(startScreen);
        }
    }
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(true,false,50);
        bg.setFont(font);
        bg.setColor(Color.YELLOW.darker());
        bg.drawString(message, x, y);
    }
    
}
