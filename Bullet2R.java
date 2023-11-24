import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet2R here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2R extends Actor
{
    
    int world =1;
    /**
     * Act - do whatever the bullet1L wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
           
        
        
        
       
        if (getWorld() != null && getWorld().getClass().getName().equals("FirstLevel"))
            {
            croco();
            rab();
            Remove();
        
        }
        
        if (getWorld() != null && getWorld().getClass().getName().equals("SecondLevel")){
            camel();
            snake();
            Remove1();
        }
        
        
        if (getWorld() != null && getWorld().getClass().getName().equals("ThirdLevel")){
            ThirdLevel world = (ThirdLevel)getWorld();
            
            if (isAtEdge())
            {
                world.removeObject(this);
            }
        }
    
    }
    
    public void croco()
    {
        Actor croco = getOneIntersectingObject(Crocodile.class);
        if (croco != null) {
            Greenfoot.playSound("Quick_Fart_Sound_EffectEDITED.wav");
        }
    }
    public void rab()
    {
        Actor rab = getOneIntersectingObject(Rabbit.class);
        if (rab != null) {
            Greenfoot.playSound("OOF_SOUND_EFFECT_NO_COPYRIGHT_ROBLOX_DEATH_SOUND_FOR_EDITING_1EDDITED.wav");
            World world = getWorld();
            FirstLevel.player1Counter.add(50);
        }
    }
    public void Remove()
    {
        Actor croco = getOneIntersectingObject(Crocodile.class);
        Crocodile croco1 = (Crocodile)getOneIntersectingObject(Crocodile.class);
        Actor rab = getOneIntersectingObject(Rabbit.class);
        FirstLevel world = (FirstLevel)getWorld();
        if(rab!=null||isAtEdge()){
            world.removeObject(rab);
            world.removeObject(this);
        }
        if(croco!=null){
            croco1.life();
            world.removeObject(this);
        }
    }
    
    
    public void camel()
    {
        Actor camel = getOneIntersectingObject(Camel.class);
        if (camel != null) {
            Greenfoot.playSound("Quick_Fart_Sound_EffectEDITED.wav");
        }
    }
    public void snake()
    {
        Actor snake = getOneIntersectingObject(Snake.class);
        if (snake != null) {
            Greenfoot.playSound("OOF_SOUND_EFFECT_NO_COPYRIGHT_ROBLOX_DEATH_SOUND_FOR_EDITING_1EDDITED.wav");
            World world = getWorld();
            FirstLevel.player1Counter.add(50);
        }
    }
    public void Remove1()
    {
        Actor camel = getOneIntersectingObject(Camel.class);
        Camel camel1 = (Camel)getOneIntersectingObject(Camel.class);
        Actor snake = getOneIntersectingObject(Snake.class);
        SecondLevel world = (SecondLevel)getWorld();
        if(snake!=null||isAtEdge()){
            world.removeObject(snake);
            world.removeObject(this);
        }
        if(camel!=null){
            camel1.life();
            world.removeObject(this);
        }
    }
    
}
