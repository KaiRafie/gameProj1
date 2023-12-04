import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the Tutorial class where we show a little bit of the game to
 * understand everything before playing the whole game
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    private GreenfootSound gameMusic;//creating a variable for music
    
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
        addObject(FirstLevel.player2Counter, 1250, 30);
        
        
        showTextWithBigWhiteFont("Moving   Shooting   Dashing                                                                Dashing  Shooting  Moving ", 20, 880);
        
        showTextWithBigWhiteFont(" Welcome to Hunters Royal!!",500,25);
        showTextWithBigWhiteFont(" Two shots to kill big animals, you earn 100 points",325,60);
        showTextWithBigWhiteFont(" One shot to kill small animals, you earn 50 points",325,95);
        showTextWithBigWhiteFont(" Watch out! The Final level is different!",450,130);

        
        prepare();
    }

        public void act()
        {
        if ( getObjects(Giraffe.class).isEmpty() && getObjects(Zebra.class).isEmpty()){
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
        Giraffe giraffe = new Giraffe();
        addObject(giraffe,1131,576);
        Giraffe giraffe2 = new Giraffe();
        addObject(giraffe2,650,612);
        Giraffe giraffe3 = new Giraffe();
        addObject(giraffe3,460,330);
        Giraffe giraffe4 = new Giraffe();
        addObject(giraffe4,794,104);
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
        Arrows arrows = new Arrows();
        addObject(arrows,1076,816);
        Pbutton pbutton = new Pbutton();
        addObject(pbutton,929,820);
        arrows.setLocation(1180,821);
        pbutton.setLocation(1050,835);
        Enter enter = new Enter();
        addObject(enter,856,826);
        enter.setLocation(920,832);
        arrows.setLocation(1188,824);
        pbutton.setLocation(1087,824);
        enter.setLocation(929,818);
        pbutton.setLocation(1060,824);
        Wasd wasd = new Wasd();
        addObject(wasd,69,816);
        Spacebar spacebar = new Spacebar();
        addObject(spacebar,212,825);
        Tab tab = new Tab();
        addObject(tab,354,815);
        tab.setLocation(308,832);
        spacebar.setLocation(206,836);
        enter.setLocation(939,812);
        arrows.setLocation(1205,819);
        pbutton.setLocation(1082,831);
        enter.setLocation(962,839);
        tab.setLocation(340,830);
        enter.setLocation(932,817);
        enter.setLocation(960,844);
        enter.setLocation(937,818);
        enter.setLocation(931,823);
        removeObject(enter);
        Enter enter1 = new Enter();

        pbutton.setLocation(1084,839);
        pbutton.setLocation(1059,828);
        arrows.setLocation(1202,822);
        pbutton.setLocation(1097,816);

        pbutton.setLocation(1085,820);
        arrows.setLocation(1197,805);

        Enter enter2 = new Enter();
        addObject(enter2,954,823);
        removeObject(giraffe4);
        removeObject(zebra5);
        zebra4.setLocation(184,259);

        removeObject(spacebar);
        Spacebar spacebar1 = new Spacebar();
        addObject(spacebar,202,829);
    }
}
