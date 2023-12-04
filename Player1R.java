import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * this is Player 1 class, the R stands for facing Right
 */
public class Player1R extends Players
{
    
    /**
     * Act - do whatever the char1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    
        //calling all the methods needed to act
        moveAround();
        shoot();
        Player1Win();
        
        //the next coding lines checks on which level is the player on currently
        if (getWorld() != null && getWorld().getClass().getName().equals("FirstLevel"))
        {
            if (Player1Win()) //this checks if the first player win
            {
                 Player1WinScreen();//if the player1 wins transition to the specified screen
            }    
        }
        if (getWorld() != null && getWorld().getClass().getName().equals("SecondLevel"))
        {
            if (Player1Win2()) 
            {
                Player1WinScreen2();
            }  
                     
        }
        if (getWorld() != null && getWorld().getClass().getName().equals("ThirdLevel"))
        {
            removeFromLevel3(); 
            walls();//this method is only for the last level sinceit has walls
        }
        
    }
    
    private SimpleTimer dashtimer = new SimpleTimer();
    private SimpleTimer shootingtimer = new SimpleTimer();
    private int facingDirection =1;
    
    
    public void removeFromLevel3()
    {
        Actor bullet2L = getOneIntersectingObject(Bullet2L.class);
        ThirdLevel world = (ThirdLevel)getWorld();
        
        if(bullet2L!=null){
            FirstLevel.player2Counter.add(50);
            FirstLevel.player1Counter.remove(50);
            world.removeObject(bullet2L);
        }
        
        Actor bullet2R = getOneIntersectingObject(Bullet2R.class);
        
        if(bullet2R!=null){
            FirstLevel.player2Counter.add(50);
            FirstLevel.player1Counter.remove(50);
            world.removeObject(bullet2R);
        }
    }
    
    
    /**
     * this method to make the actor move
     */
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            
            setLocation(getX(), getY()-4);
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
            {   
                setLocation(getX(), getY()-152);
                dashtimer.mark();
            }
        }  
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+4);
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
            {
                setLocation(getX(), getY()+152);
                dashtimer.mark();
            }
        }
        if(Greenfoot.isKeyDown("d"))// when the "d" is pressed the character not only should go right but also face right too.
        {
            move(4);
            facingDirection=1;
            this.setImage("Character1 (3).png");
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
            {
                move(152);
                dashtimer.mark();
            }
        }
        if(Greenfoot.isKeyDown("a"))// when the "a" is pressed the character not only should go left but also face left too.
        {
            move(-4);
            facingDirection=2;
            GreenfootImage imLeft;
            this.setImage("Character1 (3)_Flipped.png");
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("tab"))
            {
                move(-152);
                dashtimer.mark();
            }
        }
    }
    public void walls()// this method prevents the player from clipping through the walls of the third level
    {
        if (getWorld().getObjectsAt(20, getY(), Player1R.class).contains(this))
        {
            setLocation(getX()+15, getY()+1);
        }
        if (getWorld().getObjectsAt(1250, getY(), Player1R.class).contains(this))
        {
            setLocation(getX()-15, getY()+1);
        }
        if (getWorld().getObjectsAt(getX(), 130, Player1R.class).contains(this))
        {
            setLocation(getX()+1, getY()+15);
        }
        if (getWorld().getObjectsAt(getX(), 830, Player1R.class).contains(this))
        {
            setLocation(getX()+1, getY()-15);
        }
    }
    /**
     * Since the player can shoot on all the levels. it's a matter of checking the players direction and checking that the player exists on the levels
     */
    public void shoot()
    {
        
        if(getWorld() != null && getWorld().getClass().getName().equals("FirstLevel")||getWorld().getClass().getName().equals("SecondLevel")
            ||getWorld().getClass().getName().equals("Tutorial"))
            {
            if (facingDirection == 1)//this checks if the player is facing right, where way = 1 means facing right
            {
                if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("space"))
                {
                    Greenfoot.playSound("GUNSOUND.wav");
                    World world = getWorld();
                    world.addObject( new  Bullet1R(), getX()+60, getY()+20);
                    shootingtimer.mark();
                
                }
            }
            if (facingDirection == 2)//this checks if the player is facing left, where way = 2 means facing left
            {
                if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("space")) 
                {
                    Greenfoot.playSound("GUNSOUND.wav");
                    World world = getWorld();
                    world.addObject( new  Bullet1L(), getX()-60, getY()+20);
                    shootingtimer.mark();
                }
            }
        }
    
        //Because the third level is different the coding of shooting is a bit different, the only difference is the fire rate speed has increased
        if(getWorld() != null && getWorld().getClass().getName().equals("ThirdLevel"))//this checks if the player is currently in the third level
        {
            if (facingDirection == 1)
            {
                if (shootingtimer.millisElapsed() > 300 && Greenfoot.isKeyDown("space")) 
                {
                    Greenfoot.playSound("GUNSOUND.wav");
                    World world = getWorld();
                    world.addObject( new  Bullet1R(), getX()+60, getY()+20);
                    shootingtimer.mark();
                
                }
            }
            if (facingDirection == 2)
            {
                if (shootingtimer.millisElapsed() > 300 && Greenfoot.isKeyDown("space"))
                {
                    Greenfoot.playSound("GUNSOUND.wav");
                    World world = getWorld();
                    world.addObject( new  Bullet1L(), getX()-60, getY()+20);
                    shootingtimer.mark();
                }
            }
        }
    
    }
    
    public boolean Player1Win2()//this returns true if this player has more points, from the second level
    {
        World world = getWorld();
        
        if (world.getObjects(Camel.class).isEmpty()&&(FirstLevel.player1Counter.getValue()>FirstLevel.player2Counter.getValue())&&
            world.getObjects(Snake.class).isEmpty() )
        {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void Player1WinScreen2()//this is the win screen after the second level
    {
        getWorld().stopped();
        World player1WinL2 =  new  Player1WinL2();
        Greenfoot.setWorld(player1WinL2);
        Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
    }
    
    
    
    public boolean Player1Win()//this returns true if this player has more points, from the first level
    {
        World world = getWorld();
        
        if (world.getObjects(Rabbit.class).isEmpty()&&(FirstLevel.player1Counter.getValue()>FirstLevel.player2Counter.getValue())&&
            world.getObjects(Crocodile.class).isEmpty())
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void Player1WinScreen()//this is the win screen after the first level
    {
        getWorld().stopped(); 
        World player1Win =  new  Player1Win();
        Greenfoot.setWorld(player1Win);
        Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
    }
    //for the third level
    public void ThirdLevel()
    {
        Actor bullet2L = getOneIntersectingObject(Bullet2L.class);
        Actor bullet2R = getOneIntersectingObject(Bullet2R.class);
        //if the bullets hit the other player
        if (bullet2L != null)
        {
            FirstLevel.player2Counter.add(50);//it adds 50 points to this player
            FirstLevel.player1Counter.remove(50);//and removes 50 points from the other player
            
            getWorld().removeObject(bullet2L);//after the hit this removes the bullet
            
        }
        
        if (bullet2R != null)
        {
            FirstLevel.player2Counter.add(50);
            FirstLevel.player1Counter.remove(50);
            
            getWorld().removeObject(bullet2R);
        }
    }
    }

