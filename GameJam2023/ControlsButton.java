import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ControlsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlsButton extends Actor
{
    /**
     * Act - do whatever the ControlsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseMoved(this))
        {
            setImage("ControlSelected.png");
            //Greenfoot.playSound(".wav");
        }

        if (Greenfoot.mouseMoved(getWorld()))
        {
            setImage("Control.png");
        }

        if (Greenfoot.mouseClicked(this))
        {   
            World currentWorld = getWorld();
            currentWorld.stopped();
            World select =  new Controls();
            Greenfoot.setWorld(select);
            select.started();
        }
    }
}
