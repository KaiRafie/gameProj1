import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is one of the big animals that need to be hit twice, the Giraffe class.
 *All explanations found in Camel class because it's quite the same*
 */
public class Giraffe extends BigAnimals
{
    private int life =2;
    
    /**
     * Act - do whatever the Girafe wants to do. This method is called whenever
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
    
    public void life(){
        Actor bullet1L = getOneIntersectingObject(Bullet1L.class);
        Actor bullet1R = getOneIntersectingObject(Bullet1R.class);
        
        Actor bullet2L = getOneIntersectingObject(Bullet2L.class);
        Actor bullet2R = getOneIntersectingObject(Bullet2R.class);
        if(isTouching(Bullet1L.class)||isTouching(Bullet1R.class)||isTouching(Bullet2L.class)
            || isTouching(Bullet2R.class)){
            
            life--;
            
        }
        if (life==1) {
            this.setImage("Girafe_injured.png");
        }
        if (life==0){
            if(bullet1L!=null||bullet1R!=null){
                FirstLevel.player1Counter.add(100);
            }
            else if(bullet2L!=null||bullet2R!=null) {
                FirstLevel.player2Counter.add(100);
            }
            getWorld().removeObject(this);
        }
        
        

    }
}
