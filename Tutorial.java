import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        super(1300, 900, 1); 

        showTextWithBigWhiteFont("Player 1", 10, 70);
        addObject(FirstLevel.player1Counter, 50, 20);
        showTextWithBigWhiteFont("Player 2", 1190, 70);
        addObject(FirstLevel.player2Counter, 1250, 20);

        prepare();
    }

    public void act(){
        if ( getObjects(Girafe.class).isEmpty() && getObjects(Zebra.class).isEmpty()){
            stopped(); 
            World startScreen =  new  StartScreen();
            Greenfoot.setWorld(startScreen);
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
        Player1R player1R = new Player1R();
        addObject(player1R,66,487);
        Player2L player2L = new Player2L();
        addObject(player2L,1223,157);
        Girafe girafe = new Girafe();
        addObject(girafe,1131,576);
        Girafe girafe2 = new Girafe();
        addObject(girafe2,650,612);
        Girafe girafe3 = new Girafe();
        addObject(girafe3,460,330);
        Girafe girafe4 = new Girafe();
        addObject(girafe4,794,104);
        Zebra zebra = new Zebra();
        addObject(zebra,1016,340);
        Zebra zebra2 = new Zebra();
        addObject(zebra2,797,516);
        Zebra zebra3 = new Zebra();
        addObject(zebra3,343,616);
        Zebra zebra4 = new Zebra();
        addObject(zebra4,285,117);
        Zebra zebra5 = new Zebra();
        addObject(zebra5,588,133);
    }
}
