import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player2L extends Actor
{

    /**
     * Act - do whatever the char1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        shoot();
        score();
        Player2Win();
        if (Player2Win()) {
            Player2WinScreen();
        } 
    }
    
    private SimpleTimer dashtimer = new SimpleTimer();
    private SimpleTimer shootingtimer = new SimpleTimer();
    private int way =1;
    
    /**
     * 
     */
    public void moveAround()
    {
              if(Greenfoot.isKeyDown("up")){
                setLocation(getX(), getY()-4);
                if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
              {    setLocation(getX(), getY()-152);
                  dashtimer.mark();
              }
        }  
            if(Greenfoot.isKeyDown("down")){
                setLocation(getX(), getY()+4);
                if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
              {
                    setLocation(getX(), getY()+152);
                    dashtimer.mark();
              }
        }
            if(Greenfoot.isKeyDown("right")){
                move(4);
                way=1;
                this.setImage("2ndCharacter (6)_Flipped.png");
                if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
              {
                    move(152);
                    dashtimer.mark();
              }
        }
                if(Greenfoot.isKeyDown("left")){
                    move(-4);
                    way=2;
                    this.setImage("2ndCharacter (6).png");
                    if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
                  {
                        move(-152);
                        dashtimer.mark();
                  }
        }
    }

    /**
     * 
     */
    public void shoot()
    {
        if (way == 1) {
            if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("p")) {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet2R(), getX()+55, getY()+18);
                shootingtimer.mark();
                
            }
        }
        if (way == 2) {
            if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("p")) {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet2L(), getX()-55, getY()+18);
                shootingtimer.mark();
                
            }
        }
    }

    /**
     * 
     */
    public void score()
    {
    }
    
    public boolean Player2Win()
    {
        World world = getWorld();
        
        if (world.getObjects(Rabbit.class).isEmpty()&&(MyWorld.player1Counter.getValue()<MyWorld.player2Counter.getValue())&&
            world.getObjects(Crocodile.class).isEmpty() )
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void Player2WinScreen()
    {
        getWorld().stopped();
        World player2Win =  new  Player2Win();
        Greenfoot.setWorld(player2Win);
        Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
    }
}
