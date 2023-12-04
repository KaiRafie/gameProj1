import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FirstLevel extends World
{
    
    private GreenfootSound gameMusic;//creating a variable for music
    //these are the counter objects for both players
    public static Player1Counter player1Counter =  new  Player1Counter();
    public static Player2Counter player2Counter =  new  Player2Counter();
        /**
     * Constructor for the first level sets the design of the level with the
     * background music and the initial values for the score counter
     */
    public FirstLevel()
    {
        super(1300, 900, 1);
        
        gameMusic =  new  GreenfootSound("chill_jungle_ambient.wav");
        started();
        prepare();
        //initial counter values
        player1Counter.setValue(0);
        player2Counter.setValue(0);
        
        showTextWithBigWhiteFont("Player 1", 10, 70);
        addObject(player1Counter, 50, 20);//the place for the counter1
        showTextWithBigWhiteFont("Player 2", 1190, 70);
        addObject(player2Counter, 1250, 20);//the place for the counter2
    }
    
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {//this method for the text shown on the top corners
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

        Tree tree = new Tree();
        addObject(tree,446,761);
        Tree tree2 = new Tree();
        addObject(tree2,1172,581);
        Tree tree3 = new Tree();
        addObject(tree3,737,408);
        Tree tree4 = new Tree();
        addObject(tree4,204,224);
        Tree tree5 = new Tree();
        addObject(tree5,1084,205);
        removeObject(tree3);
        Tree tree6 = new Tree();
        addObject(tree3,642,404);
        Crocodile crocodile = new Crocodile();
        addObject(crocodile,915,520);
        removeObject(crocodile);
        Player1R player1 = new Player1R();
        addObject(player1,95,817);
        Player2L player2 = new Player2L();
        addObject(player2,1231,374);
        Crocodile crocodile2 = new Crocodile();
        addObject(crocodile2,1176,823);
        Crocodile crocodile3 = new Crocodile();
        addObject(crocodile3,644,592);
        Crocodile crocodile4 = new Crocodile();
        addObject(crocodile4,957,425);
        Crocodile crocodile5 = new Crocodile();
        addObject(crocodile5,831,230);
        Crocodile crocodile6 = new Crocodile();
        addObject(crocodile6,532,58);
        Crocodile crocodile7 = new Crocodile();
        addObject(crocodile7,354,379);
        Crocodile crocodile8 = new Crocodile();
        addObject(crocodile8,161,653);
        Crocodile crocodile9 = new Crocodile();
        addObject(crocodile9,601,845);
        Crocodile crocodile10 = new Crocodile();
        addObject(crocodile10,931,703);
        crocodile2.setLocation(1158,846);
        crocodile10.setLocation(974,706);
        crocodile4.setLocation(1000,403);
        crocodile3.setLocation(556,578);
        crocodile8.setLocation(159,634);
        crocodile7.setLocation(349,383);
        crocodile5.setLocation(770,216);
        crocodile6.setLocation(483,80);
        crocodile3.setLocation(621,573);
        crocodile7.setLocation(337,396);
        crocodile3.setLocation(531,554);
        crocodile7.setLocation(348,381);
        crocodile8.setLocation(149,645);
        crocodile7.setLocation(277,381);
        crocodile6.setLocation(456,89);
        crocodile10.setLocation(861,646);
        Rabbit rabbit = new Rabbit();
        addObject(rabbit,854,835);
        Rabbit rabbit2 = new Rabbit();
        addObject(rabbit2,1195,763);
        Rabbit rabbit3 = new Rabbit();
        addObject(rabbit3,626,678);
        Rabbit rabbit4 = new Rabbit();
        addObject(rabbit4,882,523);
        Rabbit rabbit5 = new Rabbit();
        addObject(rabbit5,283,828);
        Rabbit rabbit6 = new Rabbit();
        addObject(rabbit6,79,698);
        Rabbit rabbit7 = new Rabbit();
        addObject(rabbit7,91,458);
        Rabbit rabbit8 = new Rabbit();
        addObject(rabbit8,252,544);
        Rabbit rabbit9 = new Rabbit();
        addObject(rabbit9,466,318);
        Rabbit rabbit10 = new Rabbit();
        addObject(rabbit10,403,203);
        tree4.setLocation(54,112);
        Rabbit rabbit11 = new Rabbit();
        addObject(rabbit11,54,112);
        Rabbit rabbit12 = new Rabbit();
        addObject(rabbit12,307,47);
        Rabbit rabbit13 = new Rabbit();
        addObject(rabbit13,762,157);
        Rabbit rabbit14 = new Rabbit();
        addObject(rabbit14,611,46);
        Rabbit rabbit15 = new Rabbit();
        addObject(rabbit15,899,68);
        Rabbit rabbit16 = new Rabbit();
        addObject(rabbit16,904,304);
        Rabbit rabbit17 = new Rabbit();
        addObject(rabbit17,1251,173);
        Rabbit rabbit18 = new Rabbit();
        addObject(rabbit18,1011,745);
        Rabbit rabbit19 = new Rabbit();
        addObject(rabbit19,437,431);
        rabbit10.setLocation(575,190);
        rabbit9.setLocation(420,277);
        rabbit6.setLocation(51,699);
        crocodile8.setLocation(171,633);
        crocodile8.setLocation(216,668);
        crocodile8.setLocation(184,635);
        crocodile10.setLocation(868,681);
        rabbit4.setLocation(993,494);
        Rabbit rabbit20 = new Rabbit();
        addObject(rabbit20,819,554);
        tree4.setLocation(291,212);
        rabbit11.setLocation(77,142);
        tree4.setLocation(256,188);
        tree4.setLocation(250,183);
        tree4.setLocation(57,222);
        tree5.setLocation(1055,203);
        tree4.setLocation(245,126);
        tree4.setLocation(86,235);
        tree4.setLocation(136,99);
        tree4.setLocation(279,209);
        tree4.setLocation(83,159);
        tree4.setLocation(320,250);
        removeObject(rabbit11);
        tree4.setLocation(174,198);
        rabbit9.setLocation(347,257);
        Rabbit rabbit21 = new Rabbit();
        addObject(rabbit21,42,262);
        crocodile7.setLocation(195,379);
        crocodile8.setLocation(158,647);
        crocodile7.setLocation(259,419);
        tree3.setLocation(487,277);
        Crocodile crocodile11 = new Crocodile();
        addObject(crocodile11,487,277);
        crocodile4.setLocation(1072,364);
        Crocodile crocodile12 = new Crocodile();
        addObject(crocodile12,865,477);
        crocodile10.setLocation(836,699);
        rabbit18.setLocation(989,626);
        rabbit20.setLocation(770,584);
        crocodile12.setLocation(872,491);
        rabbit18.setLocation(1011,706);
        rabbit2.setLocation(1232,800);
        crocodile2.setLocation(1093,817);
        crocodile10.setLocation(848,698);
        Crocodile crocodile13 = new Crocodile();
        addObject(crocodile13,800,34);
        tree5.setLocation(938,85);
        Crocodile crocodile14 = new Crocodile();
        addObject(crocodile14,1211,99);
        tree5.setLocation(1064,155);
        tree5.setLocation(1205,129);
        tree3.setLocation(762,377);
        tree3.setLocation(556,342);
        crocodile11.setLocation(711,513);
        tree3.setLocation(664,350);
        crocodile11.setLocation(414,316);
        rabbit9.setLocation(371,237);
        crocodile11.setLocation(406,283);
        rabbit9.setLocation(367,221);
        crocodile11.setLocation(398,284);
        tree5.setLocation(1113,263);
        tree5.setLocation(1038,155);
        tree5.setLocation(1112,200);
        tree5.setLocation(1077,201);
        tree5.setLocation(1046,216);
        tree5.setLocation(1053,215);
        rabbit17.setLocation(1267,242);
        tree5.setLocation(1186,118);
        tree3.setLocation(657,346);
        tree3.setLocation(682,370);
        tree3.setLocation(727,363);
        tree5.setLocation(1099,197);
        removeObject(tree5);
        removeObject(crocodile14);
        Tree tree19 = new Tree();
        addObject(tree5,1080,208);
        removeObject(tree3);
        Tree tree8 = new Tree();
        addObject(tree3,675,398);
        Crocodile crocodile18 = new Crocodile();
        addObject(crocodile14,1214,116);
        removeObject(tree5);
        Tree tree7 = new Tree();
        addObject(tree5,1036,224);
        removeObject(tree4);
        Tree tree9 = new Tree();
        addObject(tree4,165,175);
        removeObject(tree2);
        Tree tree10 = new Tree();
        addObject(tree2,1168,641);
        removeObject(tree);
        Tree tree20 = new Tree();
        addObject(tree,422,753);
    }
}

