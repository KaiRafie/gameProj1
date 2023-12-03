import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is one of the small animals that need to be hit once, the Zebra class.
 * Since these animals need to be hit once, they have every code from the big animals but the "life" things.
 */
public class Zebra extends SmallAnimals
{
    /**
     * Act - do whatever the Zebra wants to do. This method is called whenever
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
        
        
    }
}
