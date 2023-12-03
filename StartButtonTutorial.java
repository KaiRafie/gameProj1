import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Tutorial button
 * explanaition for codes found in StartButton class
 */
public class StartButtonTutorial extends GameInterface
{
    /**
     * Act - do whatever the StartButtonTutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        if (Greenfoot.mouseMoved(this))
        {
            setImage("Option_Button_Highlighted_tutorial_Red.png");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Option_ButtonT.png");
        }
        
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Tutorial()); 
            getWorld().stopped();

        }
    }
}
