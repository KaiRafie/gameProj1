import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int LR=Greenfoot.getRandomNumber(100);
        
        int UD=Greenfoot.getRandomNumber(100);
        if (LR<1) {
            move(-10);
        }
        if (LR>=99) {
            move(10);
        }
        if (UD<1) {
            setLocation(getX(), getY() - 10);
        }
        if (UD>=99) {
            setLocation(getX(), getY() + 10);
        }
        
        Actor bullet1L = getOneIntersectingObject(Bullet1L.class);
        if (bullet1L != null) {
            World world = getWorld();
            world.removeObject(bullet1L);
        }
        Actor bullet1R = getOneIntersectingObject(Bullet1R.class);
        if (bullet1R != null) {
            World world = getWorld();
            world.removeObject(bullet1R);
        }
        Actor bullet2L = getOneIntersectingObject(Bullet2L.class);
        if (bullet2L != null) {
            World world = getWorld();
            world.removeObject(bullet2L);
        }
        Actor bullet2R = getOneIntersectingObject(Bullet2R.class);
        if (bullet2R != null) {
            World world = getWorld();
            world.removeObject(bullet2R);
        }
    }
}
