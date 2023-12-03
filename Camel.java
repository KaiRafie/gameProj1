import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is one of the big animals that need to be hit twice, the Camel class.
 *
 */
public class Camel extends BigAnimals
{
    private int life =2;// this is the life of the actor, meaning how many bullets it needs to be killed
    
    /**
     * Act - do whatever the Camel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int LR=Greenfoot.getRandomNumber(100);//L=Left and R=Right movement
        
        int UD=Greenfoot.getRandomNumber(100);//U=Up and D=Down movement
        //the second lines of codes is for a random movement
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
    
    public void life()
    {
        Actor bullet1L = getOneIntersectingObject(Bullet1L.class);
        Actor bullet1R = getOneIntersectingObject(Bullet1R.class);
        
        Actor bullet2L = getOneIntersectingObject(Bullet2L.class);
        Actor bullet2R = getOneIntersectingObject(Bullet2R.class);
        //Since this is a large animal it should be killed with two shots
        if(isTouching(Bullet1L.class)||isTouching(Bullet1R.class)||isTouching(Bullet2L.class)
            || isTouching(Bullet2R.class))//this check if any bullet is hitting the current actor
        {
            life--;// if yes one life gets removed
        }
        if (life==1) {
            this.setImage("CAMEL1_injuredS.png");//if the camel has one life left out of 2, it changes the image to an injured version of it
        }
        if (life==0)// this checks if the life of the camel is equal to 0
        {
            if(bullet1L!=null||bullet1R!=null)//if any bullet of Player1 touches it at the end 
            {
                FirstLevel.player1Counter.add(100);// it adds the points to the score of the first player
            }
            else if(bullet2L!=null||bullet2R!=null)// if any bullet of Player2 touches it at the end
            {
                FirstLevel.player2Counter.add(100);// it adds the points to the score of the second player
            }
            getWorld().removeObject(this);// removing the object from the world 
        }
    }
}
