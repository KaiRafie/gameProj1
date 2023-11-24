import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Player1R extends Actor
{
    
    /**
     * Act - do whatever the char1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
    
        moveAround();
        shoot();
        score();
        Player1Win();
        if (Player1Win()) {
            //Player1WinScreen();
            } 
        
    
        
        
        //
        }
    
    private SimpleTimer dashtimer = new SimpleTimer();
    private SimpleTimer shootingtimer = new SimpleTimer();
    private int way =1;
    
    /**
     * 
     */
    public void moveAround()
    {
              if(Greenfoot.isKeyDown("w")){
                setLocation(getX(), getY()-4);
                if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
              {    setLocation(getX(), getY()-152);
                  dashtimer.mark();
              }
        }  
            if(Greenfoot.isKeyDown("s")){
                setLocation(getX(), getY()+4);
                if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
              {
                    setLocation(getX(), getY()+152);
                    dashtimer.mark();
              }
        }
            if(Greenfoot.isKeyDown("d")){
                move(4);
                way=1;
                this.setImage("Character1 (3).png");
                if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
              {
                    move(152);
                    dashtimer.mark();
              }
        }
                if(Greenfoot.isKeyDown("a")){
                    move(-4);
                    way=2;
                    GreenfootImage imLeft;
                    this.setImage("Character1 (3)_Flipped.png");
                    if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
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
            if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("space")) {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet1R(), getX()+55, getY()+25);
                shootingtimer.mark();
                
            }
        }
        if (way == 2) {
            if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("space")) {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet1L(), getX()-55, getY()+25);
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
    
    public boolean Player1Win()
    {
        World world = getWorld();
        
        if (world.getObjects(Rabbit.class).isEmpty()&&(FirstLevel.player1Counter.getValue()>FirstLevel.player2Counter.getValue())&&
            world.getObjects(Crocodile.class).isEmpty())
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void Player1WinScreen()
    {
        getWorld().stopped(); 
        World player1Win =  new  Player1Win();
        Greenfoot.setWorld(player1Win);
        Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
    }
    
    public void ThirdLevel(){
        Actor bullet2L = getOneIntersectingObject(Bullet2L.class);
        Actor bullet2R = getOneIntersectingObject(Bullet2R.class);
        
        if (bullet2L != null)
        {
            FirstLevel.player2Counter.add(50);
            FirstLevel.player1Counter.remove(50);
            
            getWorld().removeObject(bullet2L);
            
                }
        
        if (bullet2R != null)
        {
            
            FirstLevel.player2Counter.add(50);
            FirstLevel.player1Counter.remove(50);
            
            getWorld().removeObject(bullet2R);
            
        }
    }
    }

