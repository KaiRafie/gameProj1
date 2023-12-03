import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Left bullet for player1 class, where the bullet flys left
 *
 */
public class Bullet1L extends Player1Things
{
    
    
    /**
     * Act - do whatever the bullet1L wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-8);//moving to the left
        
        //specifying each method for each world is impportant as shown below
        //if we generalize the usage of these methods in the act() method, the game crashes with the PointNullException error text.
        //the following if statements check on which level is the current game at.
        if (getWorld() != null && getWorld().getClass().getName().equals("Tutorial"))
        {
            giraffe();// this is the method to interact with the giraffe actor
            zebra();// this is the method to interact with the zebra actor
            removeFromTutorial();// this method removes the Actors when the bullet hits them, when in tutorial level
        
        }
        
        
        if (getWorld() != null && getWorld().getClass().getName().equals("FirstLevel"))
        {
            croco();// this is the method to interact with the corcodile actor
            rab();// this is the method to interact with the zebra actor
            removeFromLevel1();// this method removes the Actors when the bullet hits them, when in first level
        
        }
        
        if (getWorld() != null && getWorld().getClass().getName().equals("SecondLevel"))
        {
            camel();
            snake();
            removeFromLevel2();// this method removes the Actors when the bullet hits them, when in second level
        }
        
        
        if (getWorld() != null && getWorld().getClass().getName().equals("ThirdLevel"))//since the third level is different the method for it is quite different too
        {
            ThirdLevel world = (ThirdLevel)getWorld();
            Actor player2L = getOneIntersectingObject(Player2L.class);
            if (player2L != null) //we check if the bullet hits the second player only since this bullet is for the first player
            {
            
                Greenfoot.playSound("hit22L.wav");
                
            }
            if (isAtEdge())//if the bukket hits the edge it disappears
            {
                world.removeObject(this);
            }
        }
    
    
    }
    
    
    public void giraffe()
    {
        Actor giraffe = getOneIntersectingObject(Giraffe.class);
        if (giraffe != null) 
        {
            Greenfoot.playSound("Quick_Fart_Sound_EffectEDITED.wav");
        }
    }
    public void zebra()
    {
        Actor zebra = getOneIntersectingObject(Zebra.class);
        if (zebra != null) 
        {
            Greenfoot.playSound("OOF_SOUND_EFFECT_NO_COPYRIGHT_ROBLOX_DEATH_SOUND_FOR_EDITING_1EDDITED.wav");
            World world = getWorld();
            FirstLevel.player1Counter.add(50);
        }
    }
    public void removeFromTutorial()
    {
        Actor giraffe = getOneIntersectingObject(Giraffe.class);//this creates an object of the Actor
        Giraffe giraffe1 = (Giraffe)getOneIntersectingObject(Giraffe.class);//but this allows the usage the methods and the variables of the Actor itself
        Actor zebra = getOneIntersectingObject(Zebra.class);
        Tutorial world = (Tutorial)getWorld();//here we need to specify which world exactly to use
        if(zebra!=null||isAtEdge())
        {
            world.removeObject(zebra);
            world.removeObject(this);
        }
        if(giraffe!=null)
        {
            giraffe1.life();
            world.removeObject(this);
        }
    }
    


    public void croco()
    {
        Actor croco = getOneIntersectingObject(Crocodile.class);
        if (croco != null) 
        {
            Greenfoot.playSound("Quick_Fart_Sound_EffectEDITED.wav");
        }
    }
    public void rab()
    {
        Actor rab = getOneIntersectingObject(Rabbit.class);
        if (rab != null) 
        {
            Greenfoot.playSound("OOF_SOUND_EFFECT_NO_COPYRIGHT_ROBLOX_DEATH_SOUND_FOR_EDITING_1EDDITED.wav");
            World world = getWorld();
            FirstLevel.player1Counter.add(50);
        }
    }
    public void removeFromLevel1()
    {
        Actor croco = getOneIntersectingObject(Crocodile.class);
        Crocodile croco1 = (Crocodile)getOneIntersectingObject(Crocodile.class);
        Actor rab = getOneIntersectingObject(Rabbit.class);
        FirstLevel world = (FirstLevel)getWorld();
        if(rab!=null||isAtEdge())
        {
            world.removeObject(rab);
            world.removeObject(this);
        }
        if(croco!=null)
        {
            croco1.life();
            world.removeObject(this);
        }
    }
    
    
    public void camel()
    {
        Actor camel = getOneIntersectingObject(Camel.class);
        if (camel != null) 
        {
            Greenfoot.playSound("Quick_Fart_Sound_EffectEDITED.wav");
        }
    }
    public void snake()
    {
        Actor snake = getOneIntersectingObject(Snake.class);
        if (snake != null) 
        {
            Greenfoot.playSound("OOF_SOUND_EFFECT_NO_COPYRIGHT_ROBLOX_DEATH_SOUND_FOR_EDITING_1EDDITED.wav");
            World world = getWorld();
            FirstLevel.player1Counter.add(50);
        }
    }
    public void removeFromLevel2()
    {
        Actor camel = getOneIntersectingObject(Camel.class);
        Camel camel1 = (Camel)getOneIntersectingObject(Camel.class);
        Actor snake = getOneIntersectingObject(Snake.class);
        SecondLevel world = (SecondLevel)getWorld();
        if(snake!=null||isAtEdge())
        {
            world.removeObject(snake);
            world.removeObject(this);
        }
        if(camel!=null)
        {
            camel1.life();
            world.removeObject(this);
        }
    }
    
    
    
}
