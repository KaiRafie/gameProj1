import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is one of the small animals that need to be hit once, the Snake class.
 * Since these animals need to be hit once, they have every code from the big animals but the "life" things.
 */
public class Snake extends SmallAnimals
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
