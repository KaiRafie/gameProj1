import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the second level class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecondLevel extends World
{
    private GreenfootSound gameMusic;//creating a variable for music
    private GreenfootSound gameMusic1;
    /**
     * Constructor for objects of class SecondLevel.
     * 
     */
    public SecondLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1300, 900, 1); 
        
        gameMusic =  new  GreenfootSound("Desert sound new.wav");
        
        gameMusic.setVolume(55);
        gameMusic1 =  new  GreenfootSound("the_eternal_sands.wav");
        started();
        
        //this is the design of the counters for the second level
        showTextWithBigWhiteFont("Player 1", 10, 70);
        addObject(FirstLevel.player1Counter, 50, 20);//this recalls the counter to keep the same score from the first level
        showTextWithBigWhiteFont("Player 2", 1190, 70);
        addObject(FirstLevel.player2Counter, 1250, 20);//this recalls the counter too
        prepare();
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
        gameMusic1.playLoop();
    }

    /**
     * this method stops music
     */
    public void stopped()
    {
        gameMusic.stop();
        gameMusic1.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        TreeDesert treeDesert = new TreeDesert();
        addObject(treeDesert,670,431);
        BigRock bigRock = new BigRock();
        addObject(bigRock,1146,801);
        BigRock bigRock2 = new BigRock();
        addObject(bigRock2,156,165);
        Cactus cactus = new Cactus();
        addObject(cactus,278,648);
        Cactus cactus2 = new Cactus();
        addObject(cactus2,910,112);
        Cactus cactus3 = new Cactus();
        addObject(cactus3,728,796);
        Cactus cactus4 = new Cactus();
        addObject(cactus4,1145,405);
        Cactus cactus5 = new Cactus();
        addObject(cactus5,380,252);
        Bush bush = new Bush();
        addObject(bush,1164,622);
        Bush bush2 = new Bush();
        addObject(bush2,916,820);
        Bush bush3 = new Bush();
        addObject(bush3,877,616);
        Bush bush4 = new Bush();
        addObject(bush4,467,838);
        Bush bush5 = new Bush();
        addObject(bush5,501,659);
        Bush bush6 = new Bush();
        addObject(bush6,186,813);
        Bush bush7 = new Bush();
        addObject(bush7,93,589);
        Bush bush8 = new Bush();
        addObject(bush8,301,420);
        Bush bush9 = new Bush();
        addObject(bush9,566,61);
        Bush bush10 = new Bush();
        addObject(bush10,739,222);
        Bush bush11 = new Bush();
        addObject(bush11,1062,165);
        Bush bush12 = new Bush();
        addObject(bush12,957,379);
        Bush bush13 = new Bush();
        addObject(bush13,1261,287);
        Bush bush14 = new Bush();
        addObject(bush14,58,287);
        Bush bush15 = new Bush();
        addObject(bush15,264,45);
        Camel camel = new Camel();
        addObject(camel,564,783);
        Camel camel2 = new Camel();
        addObject(camel2,136,425);
        Camel camel3 = new Camel();
        addObject(camel3,871,283);
        Camel camel4 = new Camel();
        addObject(camel4,1016,589);
        Camel camel5 = new Camel();
        addObject(camel5,394,76);
        Snake snake = new Snake();
        addObject(snake,1041,861);
        Snake snake2 = new Snake();
        addObject(snake2,1221,714);
        Snake snake3 = new Snake();
        addObject(snake3,843,727);
        Snake snake4 = new Snake();
        addObject(snake4,389,526);
        Snake snake5 = new Snake();
        addObject(snake5,323,815);
        Snake snake6 = new Snake();
        addObject(snake6,199,278);
        Snake snake7 = new Snake();
        addObject(snake7,595,190);
        Snake snake8 = new Snake();
        addObject(snake8,1013,53);
        Snake snake9 = new Snake();
        addObject(snake9,1001,439);
        removeObject(snake3);
        Snake snake12 = new Snake();
        addObject(snake3,694,634);
        removeObject(snake5);
        Snake snake11 = new Snake();
        addObject(snake5,175,878);
        Player2L player2L = new Player2L();
        addObject(player2L,1227,147);
        Player1R player1R = new Player1R();
        addObject(player1R,74,801);
    }
}
