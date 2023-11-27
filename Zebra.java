import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zebra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Actor
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
