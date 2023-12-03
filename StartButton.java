import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the start button for the startScreen interface
 *
 */
public class StartButton extends GameInterface
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (Greenfoot.mouseMoved(this))//this checks if the mouse is pointing at the button
        {
            setImage("Option_Button_Highlighted_red.png");// it changes the picture of the button
        }

        if (Greenfoot.mouseMoved(getWorld()))// this checks if the mouse is pointing anywhere but the button
        {
            setImage("Option_Button.png"); // returns back the original button
        }
        
        if (Greenfoot.mouseClicked(this))// this checks if the mouse clicked the button
        {
            Greenfoot.setWorld(new FirstLevel()); //moves to first level
            getWorld().stopped();//this stops the music of the StartScreen so that the musics don't get mixed

        }
    }
}
