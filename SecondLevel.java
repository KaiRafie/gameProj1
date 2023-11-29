import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the second level class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{
    
    
    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public SecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        
        
        //this is the design of the counters for the second level
        showTextWithBigWhiteFont("Player 1", 10, 70);
        addObject(FirstLevel.player1Counter, 50, 20);//this recalls the counter to keep the same score from the first level
        showTextWithBigWhiteFont("Player 2", 1190, 70);
        addObject(FirstLevel.player2Counter, 1250, 20);//this recalls the counter too
        prepare();
    }
    
    public void act(){
        
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
        Camel camel = new Camel();
        addObject(camel,307,153);
        Camel camel2 = new Camel();
        addObject(camel2,598,168);
        Camel camel3 = new Camel();
        addObject(camel3,799,149);
        Camel camel4 = new Camel();
        addObject(camel4,890,312);
        Camel camel5 = new Camel();
        addObject(camel5,822,538);
        Camel camel6 = new Camel();
        addObject(camel6,583,516);
        Camel camel7 = new Camel();
        addObject(camel7,424,354);
        Camel camel8 = new Camel();
        addObject(camel8,633,317);
        Camel camel9 = new Camel();
        addObject(camel9,850,410);
        Snake snake = new Snake();
        addObject(snake,720,393);
        Snake snake2 = new Snake();
        addObject(snake2,558,442);
        Snake snake3 = new Snake();
        addObject(snake3,408,512);
        Snake snake4 = new Snake();
        addObject(snake4,581,648);
        Snake snake5 = new Snake();
        addObject(snake5,686,616);
        Snake snake6 = new Snake();
        addObject(snake6,878,654);
        Snake snake7 = new Snake();
        addObject(snake7,1019,525);
        Snake snake8 = new Snake();
        addObject(snake8,1056,358);
        Snake snake9 = new Snake();
        addObject(snake9,1014,249);
        Snake snake10 = new Snake();
        addObject(snake10,956,132);
        Snake snake11 = new Snake();
        addObject(snake11,770,61);
        Snake snake12 = new Snake();
        addObject(snake12,608,62);
        Snake snake13 = new Snake();
        addObject(snake13,446,73);
        Snake snake14 = new Snake();
        addObject(snake14,449,233);
        Snake snake15 = new Snake();
        addObject(snake15,259,292);
        Snake snake16 = new Snake();
        addObject(snake16,318,484);
        Player1R player1R = new Player1R();
        addObject(player1R,95,508);
        Player2L player2L = new Player2L();
        addObject(player2L,1199,228);
    }
}
