import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * this is player 2, the L stands for facing Left
 * the explanation for the codes found in Player1R class since the two classes are similar
 */
public class Player2L extends Players
{

    /**
     * Act - do whatever the char1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        shoot();
        Player2Win();
        
        if (getWorld() != null && getWorld().getClass().getName().equals("ThirdLevel")){
            walls();
            Remove2();            
        }
        
        if (getWorld() != null && getWorld().getClass().getName().equals("FirstLevel"))
        {
            if (Player2Win()) 
            {
                Player2WinScreen();
            }
        }
            
        if (getWorld() != null && getWorld().getClass().getName().equals("SecondLevel"))
        {
            if (Player2Win2())
            {
                Player2WinScreen2();
            }  
        }
    }
    
    private SimpleTimer dashtimer = new SimpleTimer();
    private SimpleTimer shootingtimer = new SimpleTimer();
    public int facingDirection =2;// the starting position if facing left.
    
    public boolean Player1Win2()
    {
        World world = getWorld();
        
        if (world.getObjects(Camel.class).isEmpty()&&(FirstLevel.player1Counter.getValue()>FirstLevel.player2Counter.getValue())&&
            world.getObjects(Snake.class).isEmpty() )
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void Player1WinScreen2()
    {
        getWorld().stopped();
        World player1WinL2 =  new  Player1WinL2();
        Greenfoot.setWorld(player1WinL2);
        Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
    }
    
    public void Remove2(){
        Actor bullet1L = getOneIntersectingObject(Bullet1L.class);
        ThirdLevel world = (ThirdLevel)getWorld();
        
        if(bullet1L!=null){
            FirstLevel.player1Counter.add(50);
            FirstLevel.player2Counter.remove(50);
            world.removeObject(bullet1L);
        }
        
        Actor bullet1R = getOneIntersectingObject(Bullet1R.class);
        
        if(bullet1R!=null){
            FirstLevel.player1Counter.add(50);
            FirstLevel.player2Counter.remove(50);
            world.removeObject(bullet1R);
        }
    }
    /**
     * 
     */
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-4);
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
            {
                setLocation(getX(), getY()-152);
                dashtimer.mark();
            }
        }  
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+4);
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
            {   
                setLocation(getX(), getY()+152);
                dashtimer.mark();
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(4);
            facingDirection=1;
            this.setImage("2ndCharacter (6)_Flipped.png");
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
            {
                move(152);
                dashtimer.mark();
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
            facingDirection=2;
            this.setImage("2ndCharacter (6).png");
            if (dashtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("enter"))
            {
                move(-152);
                dashtimer.mark();
            }
        }
    }
    public void walls()// this method prevents the player from clipping through the walls of the third level
    {
        if (getWorld().getObjectsAt(20, getY(), Player2L.class).contains(this))
        {
            setLocation(getX()+15, getY()+1);
        }
        if (getWorld().getObjectsAt(1250, getY(), Player2L.class).contains(this))
        {
            setLocation(getX()-15, getY()+1);
        }
        if (getWorld().getObjectsAt(getX(), 130, Player2L.class).contains(this))
        {
            setLocation(getX()+1, getY()+15);
        }
        if (getWorld().getObjectsAt(getX(), 830, Player2L.class).contains(this))
        {
            setLocation(getX()+1, getY()-15);
        }
    }
    /**
     * 
     */
    public void shoot()
    {
    if(getWorld() != null && getWorld().getClass().getName().equals("FirstLevel")||getWorld().getClass().getName().equals("SecondLevel")
    ||getWorld().getClass().getName().equals("Tutorial"))
    {
        if (facingDirection == 1) {
            if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("p"))
            {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet2R(), getX()+60, getY()+13);
                shootingtimer.mark();
                
            }
        }
        if (facingDirection == 2) 
        {
            if (shootingtimer.millisElapsed() > 1000 && Greenfoot.isKeyDown("p")) 
            {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet2L(), getX()-60, getY()+13);
                shootingtimer.mark();
            }
        }
    }
    
    if(getWorld() != null && getWorld().getClass().getName().equals("ThirdLevel"))
    {
        if (facingDirection == 1) 
        {
            if (shootingtimer.millisElapsed() > 300 && Greenfoot.isKeyDown("p")) 
            {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet2R(), getX()+60, getY()+13);
                shootingtimer.mark();
                
            }
        }
        if (facingDirection == 2) 
        {
            if (shootingtimer.millisElapsed() > 300 && Greenfoot.isKeyDown("p"))
            {
                Greenfoot.playSound("GUNSOUND.wav");
                World world = getWorld();
                world.addObject( new  Bullet2L(), getX()-60, getY()+13);
                shootingtimer.mark();
            }
        }
    }
    }

    public boolean Player2Win()
    {
        World world = getWorld();
        
        if (world.getObjects(Rabbit.class).isEmpty()&&(FirstLevel.player1Counter.getValue()<FirstLevel.player2Counter.getValue())&&
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

    public boolean Player2Win2()
    {
        World world = getWorld();
        
        if (world.getObjects(Camel.class).isEmpty()&&(FirstLevel.player1Counter.getValue()<FirstLevel.player2Counter.getValue())&&
            world.getObjects(Snake.class).isEmpty() )
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void Player2WinScreen2()
    {
        getWorld().stopped();
        World player2WinL2 =  new  Player2WinL2();
        Greenfoot.setWorld(player2WinL2);
        Greenfoot.playSound("Applause_Crowd_Cheering_sound_effectFORWINSCREEN.wav");
    }
    
    public void ThirdLevel()
    {
        Actor bullet1L = getOneIntersectingObject(Bullet2L.class);
        Actor bullet1R = getOneIntersectingObject(Bullet2R.class);
        
        if (bullet1L != null)
        {
            
            FirstLevel.player1Counter.add(50);
            FirstLevel.player2Counter.remove(50);
            getWorld().removeObject(bullet1L);
            
        }
        
        if (bullet1R != null)
        {
            
            
            FirstLevel.player1Counter.add(50);
            FirstLevel.player2Counter.remove(50);
            getWorld().removeObject(bullet1R);
            
        }
    }
}
