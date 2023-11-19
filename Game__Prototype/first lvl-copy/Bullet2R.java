import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet2R here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2R extends Actor
{
    /**
     * Act - do whatever the bullet1L wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        croco();
        rab();
        
        
        
        Remove();
    }
    
    public void Remove()
    {
        Actor croco = getOneIntersectingObject(Crocodile.class);
        Crocodile croco1 = (Crocodile)getOneIntersectingObject(Crocodile.class);
        Actor rab = getOneIntersectingObject(Rabbit.class);
        MyWorld world = (MyWorld)getWorld();
        if(rab!=null||isAtEdge()){
            world.removeObject(rab);
            world.removeObject(this);
        }
        if(croco!=null){
            croco1.life();
            world.removeObject(this);
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
            MyWorld.player2Counter.add(50);
        }
    }
}
