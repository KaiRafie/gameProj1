import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the last level a fighting arena
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdLevel extends World
{
    
    public SimpleTimer winTimer = new SimpleTimer();
    
    /**
     * Constructor for objects of class ThirdLevel.
     * 
     */
    public ThirdLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 

        showTextWithBigWhiteFont("Player 1", 10, 70);
        addObject(FirstLevel.player1Counter, 50, 20);
        showTextWithBigWhiteFont("Player 2", 1190, 70);
        addObject(FirstLevel.player2Counter, 1250, 20);
        
        showTextWithBigWhiteFont("time "+ timeleft(), 700, 70);
        
        
        prepare();
        
        
    }
    
    public int timeleft(){
        return winTimer.millisElapsed();
    }
    public void act(){
        
        transitionToWin();
    }
    public void transitionToWin(){
        if (winTimer.millisElapsed()>15000)
        {
            if(FirstLevel.player1Counter.getValue()>FirstLevel.player2Counter.getValue())
            {
                World player1WinFinal =  new  Player1WinFinal();
                Greenfoot.setWorld(player1WinFinal);
                Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
            }
            else if (FirstLevel.player1Counter.getValue()<FirstLevel.player2Counter.getValue())
            {
                World player2WinFinal =  new  Player2WinFinal();
                Greenfoot.setWorld(player2WinFinal);
                Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
            }
        }
        
        
    }
    
    
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(30);
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
        Player2L player2L = new Player2L();
        addObject(player2L,1227,548);
        Player1R player1R = new Player1R();
        addObject(player1R,100,555);
        player2L.setLocation(1172,540);
    }
}
