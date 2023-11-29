import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class shows that the first player won the Last round/level
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2WinFinal extends World
{

    /**
     * Constructor for objects of class Player2WinFinal.
     * 
     */
    public Player2WinFinal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1);  
        
        
        showTextWithBigBlackFont("Player 2", 555, 320);
        showTextWithBigBlackFont("is", 620, 420);
        showTextWithBigBlackFont("the winner!!!", 510, 520);
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
