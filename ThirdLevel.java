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
    private GreenfootSound gameMusic;//creating a variable for music
    /**
     * Constructor for objects of class ThirdLevel.
     * 
     */
    public ThirdLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 

        gameMusic =  new  GreenfootSound("bonusShort.wav");
        
        gameMusic.setVolume(50);
        
        started();
        
        showTextWithBigWhiteFont("Player 1", 10, 70);
        addObject(FirstLevel.player1Counter, 50, 20);
        showTextWithBigWhiteFont("Player 2", 1190, 70);
        addObject(FirstLevel.player2Counter, 1250, 20);
        
       
        showTextWithBigWhiteFont("20 seconds PvP fight ", 505, 70);
        showTextWithBigWhiteFont("Hitting the opponent gains you 50 points and loses them 50 points", 220, 110);
        
        prepare();
        
    }
    
    public int timeleft(){
        return winTimer.millisElapsed();
    }
    public void act(){
        
        Display display = new Display();
        addObject(display , 650, 20);
        int timerValue = (int) (timeleft())/1000;
        //showTextWithBigWhiteFont("time "+ timerValue , 700, 70);
        display.setImage(new GreenfootImage( timerValue +" Seconds", 35, Color.WHITE, Color.BLACK, Color.BLACK));
        
        transitionToWin();
    }
    public void transitionToWin(){
        if (winTimer.millisElapsed()>20000)
        {
            if(FirstLevel.player1Counter.getValue()>FirstLevel.player2Counter.getValue())
            {
                stopped();
                World player1WinFinal =  new  Player1WinFinal();
                Greenfoot.setWorld(player1WinFinal);
                Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
            }
            else if (FirstLevel.player1Counter.getValue()<FirstLevel.player2Counter.getValue())
            {
                stopped();
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
     * this method starts music
     */
    public void started()
    {
        gameMusic.playLoop();
    }

    /**
     * this method stops music
     */
    public void stopped()
    {
        gameMusic.stop();
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
